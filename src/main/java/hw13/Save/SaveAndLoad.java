package hw13.Save;

import hw13.Controller.FamilyController;
import hw13.Entity.Family;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SaveAndLoad {

    private String data;

    public SaveAndLoad(String path) {
        this.data = path;
    }

    private String getData() {
        return data;
    }

    public List<Family> load() {
        File data = new File(getData());
        List<Family> familyList = new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream(data);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            familyList = (List<Family>) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println("Something went wrong");
        }
        return familyList;
    }

    public void save(FamilyController familyController) {
        File data = new File(getData());
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(data);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(familyController.getAllFamilies());
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (IOException ex) {
            System.out.println("Something went wrong");
        }
    }
}
