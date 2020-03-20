package hw13.Entity;

import java.io.Serializable;
import java.util.*;

public class Family implements Serializable {
    private Human mother;
    private Human father;
    private Set<Pet> petSet;
    private List<Human> childrenList = new ArrayList<>();
    private int num = 0;
    private static final long serialVersionUID = 1L;

    public Family(Human mother, Human father, Set<Pet> petSet) {
        this.mother = mother;
        this.father = father;
        this.petSet = petSet;
    }

    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
        this.petSet = new HashSet<>();
    }

    public Family() {
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

    public Set<Pet> getPet() {
        return petSet;
    }

    public void setPet(Pet pet) {
        this.petSet = petSet;
    }

    public List<Human> getChildren() {
        return childrenList;
    }

    public void setChildren(List<Human> children) {
        this.childrenList = childrenList;
    }

    public List<Human> addChild(Human child) {
        childrenList.add(child);
        num++;
        return childrenList;
    }

    public boolean deleteChild(int index) {
        if (childrenList.size() == 0 || index > childrenList.size()) return false;
        else {
            childrenList.remove(index);
            num--;
            return true;
        }
    }

    public int countFamily() {
        return num + 2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Family family = (Family) o;
        return num == family.num &&
                Objects.equals(mother, family.mother) &&
                Objects.equals(father, family.father) &&
                Objects.equals(petSet, family.petSet) &&
                Objects.equals(childrenList, family.childrenList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mother, father, petSet, childrenList, num);
    }


    public String prettyFormat(List<Human> childrenList) {
        StringBuilder line = new StringBuilder();
        for (Human child : childrenList) {
            if (child instanceof Man) {
                line.append("\n\tboy: ").append(child.prettyFormat());
            } else if (child instanceof Woman) {
                line.append("\n\tgirl: ").append(child.prettyFormat());
            } else {
                line.append("\n\nchild: ").append(child.prettyFormat());
            }
        }
        return line.toString();
    }

    @Override
    public String toString() {
        return String.format("Family{\n\tmother=%s, \n\tfather=%s, \n\tpetSet=%s, \n\tchildrenList=%s, \ncountFam=%d}\n", mother, father, petSet, prettyFormat(childrenList), countFamily());
    }
}
