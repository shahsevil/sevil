package hw09;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class FamilyServiceTest {
    private Man father1;
    private Man father2;
    private Man boy;
    private Woman mother1;
    private Woman mother2;
    private Woman girl;
    private Family family;
    private Family family1;
    private Pet pet;
    private FamilyController familyController;
    private FamilyService familyService;

    @BeforeEach
    void setUp() {
            this.father1=new Man("Vito", "Karleone", 1991, 1);
            this.father2=new Man("Ben", "Adams", 1991, 1);
            this.boy=new Man("Jacob", "Karleone", 20, 80);
            this.girl=new Woman("Emma", "Karleone", 15, 70);
            this.mother1=new Woman("Jane", "Karleone", 1992, 1);
            this.mother2=new Woman("Kate", "Adams", 1992, 1);
            this.pet=new Dog("Oscar", 3, 20, Collections.singleton("eat,drink,sleep"));
            this.pet=new DomesticCat("Lucy", 4, 60, Collections.singleton("eat,sleep,drink"));
            this.pet=new Fish("Bob", 1, 10, Collections.singleton("drink,sleep,eat"));
            this.pet=new RoboCat("Sam", 5, 48, Collections.singleton("sleep,eat,drink"));
            this.family=new Family(mother1, father1);
            this.familyService=new FamilyService();
            this.familyController=familyController;
        }

        @Test
        void getAllFamilies() {
            assertEquals(0,familyService.getAllFamilies().size());
        }

    @Test
    void getFamiliesBiggerThan() {
        assertEquals(0,familyService.getAllFamilies().size());
    }

    @Test
    void getFamiliesLessThan() {
        assertEquals(0,familyService.getAllFamilies().size());
    }

    @Test
    void countFamiliesWithMemberNumber() {
        assertEquals(0,familyService.getAllFamilies().size());
    }

    @Test
    void createNewFamily() {
        assertEquals(0,familyService.getAllFamilies().size());
    }

    @Test
    void deleteFamilyByIndex() {
        assertEquals(0,familyService.getAllFamilies().size());
    }

    @Test
    void bornChild() {
        assertEquals(0,familyService.getAllFamilies().size());
    }

    @Test
    void adoptChild() {
        assertEquals(0,familyService.getAllFamilies().size());
    }

    @Test
    void deleteAllChildrenOlderThan() {
        assertEquals(0,familyService.getAllFamilies().size());
    }

    @Test
    void count() {
        assertEquals(0,familyService.getAllFamilies().size());
    }

    @Test
    void getFamilyById() {
        assertEquals(0,familyService.getAllFamilies().size());
    }

    @Test
    void getPets() {
        assertEquals(0,familyService.getAllFamilies().size());
    }

    @Test
    void addPet() {
        assertEquals(0,familyService.getAllFamilies().size());
    }
}