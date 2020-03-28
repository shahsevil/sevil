package hw09.Collection;

import hw09.Classes.Family;
import hw09.DAO.FamilyDao;

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
        else familyList.set(familyList.indexOf(family),family);
        return family;
    }
}
