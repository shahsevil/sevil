package hw12.Service;

import hw12.Collection.CollectionFamilyDao;
import hw12.DAO.FamilyDao;
import hw12.Entity.*;
import hw12.Exceptions.FamilyOverflowException;

import java.text.ParseException;
import java.util.Calendar;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FamilyService {

    private FamilyDao familyDao = new CollectionFamilyDao();

    public static String showMenu() {
        StringBuilder stringBuilder = new StringBuilder();
        return stringBuilder.append("1. Fill with test data (create several families and save them in the database)\n")
                .append("2. Display the entire list of families (displays a list of all families with indexation starting with 1)\n")
                .append("3. Display a list of families where the number of people is greater than the specified number\n")
                .append("4. Display a list of families where the number of people is less than the specified number\n")
                .append("5. Calculate the number of families where the number of members is\n")
                .append("6. Create a new family\n")
                .append("7. Delete a family by its index in the general list\n")
                .append("8. Edit a family by its index in the general list\n")
                .append("9. Remove all children over the age of majority\n")
                .append("10. Exit\n")
                .toString();
    }

    public List<Family> getAllFamilies() {
        return familyDao.getAllFamilies();
    }

    public void displayAllFamilies() {
        familyDao.getAllFamilies().forEach(System.out::println);
    }

    public List<Family> getFamiliesBiggerThan(int specified) {
        return familyDao.getAllFamilies().stream().
                filter(family -> family.countFamily() > specified).collect(Collectors.toList());
    }

    public List<Family> getFamiliesLessThan(int specified) {
        return familyDao.getAllFamilies().stream().
                filter(family -> family.countFamily() < specified).collect(Collectors.toList());
    }

    public int countFamiliesWithMemberNumber(int count) {
        return (int) familyDao.getAllFamilies().stream().filter(family -> family.countFamily() == count).count();
    }

    public void createNewFamily(Human human1, Human human2) {
        familyDao.saveFamily(new Family(human1, human2));
    }

    public void deleteFamilyByIndex(int index) {
        familyDao.deleteFamily(index);
    }

    public Family bornChild(Family family, String masculine, String feminine) throws ParseException {
        int random = (int) (Math.random() * 2);
        int iq = 0;
        String year = "2020/03/19";
        if (family.countFamily() > 5) throw new FamilyOverflowException("Family overflow, max is 5");
        if (random == 0) {
            Man boy = new Man(masculine, family.getFather().getSurname(), year, iq);
            family.addChild(boy);
        } else {
            String gender = "Woman";
            Woman girl = new Woman(feminine, family.getFather().getSurname(), year, iq);
            family.addChild(girl);
        }
        return familyDao.saveFamily(family);
    }

    public Family adoptChild(Family family, Human adoptedChild) {
        if (family.countFamily() > 3) throw new FamilyOverflowException("Family overflow, max is 2");
        family.addChild(adoptedChild);
        familyDao.saveFamily(family);
        return family;
    }

    public void deleteAllChildrenOlderThan(int age) {
        for (Family family : familyDao.getAllFamilies()) {
            family.getChildren().removeIf(human -> age < (2020 - human.describeAge()));
            familyDao.saveFamily(family);
        }
    }

    public int count() {
        return familyDao.getAllFamilies().size();
    }

    public Family getFamilyById(int index) {
        return familyDao.getFamilyByIndex(index);
    }

    public Set<Pet> getPets(int index) {
        return familyDao.getFamilyByIndex(index).getPet();
    }

    public void addPet(int index, Pet pet) {
        List<Family> allFamilies = familyDao.getAllFamilies();
        Family family = allFamilies.get(index);
        Set<Pet> pet1 = family.getPet();
        boolean add = pet1.add(pet);
        familyDao.saveFamily(familyDao.getAllFamilies().get(index));
    }

    public String showChildMenu() {
        StringBuilder stringBuilder = new StringBuilder();
        return stringBuilder.append("1. Give birth to a baby\n")
                .append("2. Adopt a child\n")
                .append("3. Return to main menu\n")
                .toString();
    }
}
