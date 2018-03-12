package ru.dementev.oleg;

import ru.dementev.oleg.Entity.Human;
import ru.dementev.oleg.Entity.Man;
import ru.dementev.oleg.Entity.People;
import ru.dementev.oleg.Entity.Woman;

import java.io.*;

public class SerilizeHuman {

    static boolean serialazable(Human human) {
        File file = new File("text.txt");
        try (FileOutputStream fileOutputStream = new FileOutputStream(file);
             ObjectOutputStream inputStream = new ObjectOutputStream(fileOutputStream)) {
            inputStream.writeObject(human);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return true;
    }

    static Human deserialazable() {
        File file = new File("text.txt");
        try (FileInputStream fileInputStream = new FileInputStream(file);
             ObjectInputStream inputStream = new ObjectInputStream(fileInputStream)) {
            Human human = (Human) inputStream.readObject();
                return  human;

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return null;
    }
}
