package hw06;

import java.util.Arrays;
import java.util.Objects;

public class Family {

    private Human mother;
    private Human father;
    private Pet pet;
    private Human[] childrenArr;
    private int num = 0;

    static {
        System.out.println("a new class is being loaded");
    }

    public Family(Human mother, Human father, Pet pet) {
        this.mother = mother;
        this.father = father;
        this.pet = pet;
    }

    public Family() {
    }

    public Family(Human[] childrenArr) {
        this.childrenArr = childrenArr;
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Human[] getChildren() {
        return childrenArr;
    }

    public void setChildren(Human[] children) {
        this.childrenArr = childrenArr;
    }

    public void addChild(Human child) {
        Human[] newArray = new Human[num + 1];
        for (int i = 0; i < num; i++) {
            newArray[i] = childrenArr[i];
        }
        newArray[num++] = child;
        child.setFamily(this);
        childrenArr = newArray;
    }

    public boolean deleteChild(int index) {
        if (index >= 0 && index < childrenArr.length) {
            Human[] childrenArr2 = Arrays.copyOf(childrenArr, childrenArr.length - 1);
            for (int i = 0, j = 0; i < childrenArr.length; i++) {
                if (i == index) {
                    continue;
                }
                childrenArr2[j++] = childrenArr[i];
            }
            num--;
            childrenArr = childrenArr2;
            return true;
        } else {
            return false;
        }
    }

    private boolean contains(Human child) {
        for (Human el : childrenArr) {
            if (el.equals(child))
                return true;
        }
        return false;
    }

    public boolean deleteChild(Human child) {
        boolean resultBool = contains(child);
        if (resultBool) {
            Human[] result = new Human[childrenArr.length - 1];
            int count = 0;
            for (Human el : childrenArr) {
                if (!el.equals(child)) {
                    result[count] = el;
                    count++;
                }
            }
            childrenArr = result;
        }
        return resultBool;
    }

    public int countFamily() {
        return num + 2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Family family = (Family) o;
        if (o.hashCode() != this.hashCode()) return false;
        return num == family.num &&
                Objects.equals(mother, family.mother) &&
                Objects.equals(father, family.father) &&
                Objects.equals(pet, family.pet) &&
                Arrays.equals(childrenArr, family.childrenArr);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(mother, father, pet, num);
        result = 31 * result + Arrays.hashCode(childrenArr);
        return result;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Family deleted");
        super.finalize();
    }

    @Override
    public String toString() {
        return String.format("Family{mother=%s,\n father=%s,\n pet=%s,\n children=%s\n countFam:%d}",
                mother, father, pet, Arrays.toString(childrenArr), countFamily());
    }
}
