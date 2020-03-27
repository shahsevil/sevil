package hw13.Collection;

import hw13.DAO.FamilyDao;
import hw13.Entity.Family;

import java.util.ArrayList;
import java.util.List;

public class CollectionFamilyDao implements FamilyDao {

    private List<Family> familyList = new ArrayList<>();

    @Override
    public List<Family> getAllFamilies() {
        return familyList;
    }

    @Override
    public Family getFamilyByIndex(int index) {
        try {
            return familyList.get(index);
        } catch (IndexOutOfBoundsException ex) {
            throw new RuntimeException("DAO:get:IndexOutOfBoundsException", ex);
        }
    }

    @Override
    public boolean deleteFamily(int index) {
        try {
            familyList.remove(index);
            return true;
        } catch (IndexOutOfBoundsException ex) {
            throw new RuntimeException("DAO:get:IndexOutOfBoundsException", ex);
        }
    }

    @Override
    public boolean deleteFamily(Family family) {
        try {
            familyList.remove(family);
            return true;
        } catch (IndexOutOfBoundsException ex) {
            throw new RuntimeException("DAO:get:IndexOutOfBoundsException", ex);
        }
    }

    @Override
    public Family saveFamily(Family family) {
        if (!familyList.contains(family)) familyList.add(family);
        return family;
    }

    @Override
    public void loadData(List<Family> families) {
        familyList.addAll(families);
    }


}
