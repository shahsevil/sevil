package hw11.Service;

import hw11.Collection.CollectionFamilyDao;
import hw11.DAO.FamilyDao;
import hw11.Entity.*;

import java.text.ParseException;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FamilyService {

    private FamilyDao familyDao = new CollectionFamilyDao();

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
        String year = "2005/10/03";
        if (random == 0) {
            Man boy = new Man(masculine, family.getFather().getSurname(), year, iq);
            family.addChild(boy);
        } else {
            Woman girl = new Woman(feminine, family.getFather().getSurname(), year, iq);
            family.addChild(girl);
        }
        return familyDao.saveFamily(family);
    }

    public Family adoptChild(Family family, Human adoptedChild) {
        family.addChild(adoptedChild);
        familyDao.saveFamily(family);
        return family;
    }

    public void deleteAllChildrenOlderThan(int age) {
        for (Family family : familyDao.getAllFamilies()) {
            family.getChildren().removeIf(children -> age < (2020 - children.getBirthDate()));
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
}
