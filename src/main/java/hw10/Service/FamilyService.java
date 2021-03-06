package hw10.Service;

import hw10.Entity.*;
import hw10.Collection.CollectionFamilyDao;
import hw10.DAO.FamilyDao;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class FamilyService {

    private FamilyDao familyDao = new CollectionFamilyDao();

    public List<Family> getAllFamilies() {
        return familyDao.getAllFamilies();
    }

    public void displayAllFamilies() {
        for (Family family : familyDao.getAllFamilies()) {
            System.out.printf("%d ->\n %s", getAllFamilies().indexOf(family), family);
        }
    }

    public List<Family> getFamiliesBiggerThan(int specified) {
        List<Family> fbt = new ArrayList<>();
        familyDao.getAllFamilies().forEach(family -> {
            if (family.countFamily() > specified) fbt.add(family);
        });
        System.out.println(fbt);
        return fbt;
    }

    public List<Family> getFamiliesLessThan(int specified) {
        List<Family> flt = new ArrayList<>();
        familyDao.getAllFamilies().forEach(family -> {
            if (family.countFamily() < specified) flt.add(family);
        });
        System.out.println(flt);
        return flt;
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

//    public void deleteAllChildrenOlderThan(int age) {
//        for (Family family : familyDao.getAllFamilies()) {
//            family.getChildren().removeIf(human -> (2020 - human.ge()) > age);
//            familyDao.saveFamily(family);
//        }
//    }

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
