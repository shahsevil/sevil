package hw10.Controller;

import hw10.Entity.Family;
import hw10.Entity.Human;
import hw10.Entity.Pet;
import hw10.Service.FamilyService;

import java.text.ParseException;
import java.util.List;
import java.util.Set;

public class FamilyController {

    FamilyService familyService = new FamilyService();

    public List<Family> getAllFamilies() {
        return familyService.getAllFamilies();
    }

    public void displayAllFamilies() {
        familyService.displayAllFamilies();
    }

    public List<Family> getFamiliesBiggerThan(int specified) {
        return familyService.getFamiliesBiggerThan(specified);
    }

    public List<Family> getFamiliesLessThan(int specified) {
        return familyService.getFamiliesLessThan(specified);
    }

    public int countFamiliesWithMemberNumber(int count) {
        return familyService.countFamiliesWithMemberNumber(count);
    }

    public void createNewFamily(Human human1, Human human2) {
        familyService.createNewFamily(human1, human2);
    }

    public void deleteFamilyByIndex(int index) {
        familyService.deleteFamilyByIndex(index);
    }

    public Family bornChild(Family family, String masculine, String feminine) throws ParseException {
        return familyService.bornChild(family, masculine, feminine);
    }

    public Family adoptChild(Family family, Human adoptedChild) {
        return familyService.adoptChild(family, adoptedChild);
    }

//    public void deleteAllChildrenOlderThan(int age) {
//        familyService.deleteAllChildrenOlderThan(age);
//    }

    public int count() {
        return familyService.count();
    }

    public Family getFamilyById(int index) {
        return familyService.getFamilyById(index);
    }

    public Set<Pet> getPets(int index) {
        return familyService.getPets(index);
    }

    public void addPet(int index, Pet pet) {
        familyService.addPet(index, pet);
    }
}
