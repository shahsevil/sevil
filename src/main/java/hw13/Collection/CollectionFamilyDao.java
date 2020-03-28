package hw13.Collection;

import hw13.DAO.FamilyDao;
import hw13.Entity.Family;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
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
        File data = new File("C:\\Users\\shaxs\\IdeaProjects\\sevil\\src\\main\\java\\hw13\\myfile.bin");
        try {
            FileInputStream fileInputStream = new FileInputStream(data);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            familyList = (List<Family>) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println("Something went wrong");
        }
    }
}
