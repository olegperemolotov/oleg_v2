package ru.dementev.oleg;

import ru.dementev.oleg.Entity.Man;
import ru.dementev.oleg.Entity.People;
import ru.dementev.oleg.Entity.Woman;

import java.io.*;

/**
 * Created by Антон Дементьев on 11.03.2018.
 */
public interface Serialize {

    /*static boolean serialazable(People people) {
        File file = new File("text.txt");
        try (FileOutputStream fileOutputStream = new FileOutputStream(file);
             ObjectOutputStream inputStream = new ObjectOutputStream(fileOutputStream)) {
            inputStream.writeObject(people);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return true;
    }

    static People deserialazable() {
        File file = new File("text.txt");
        try (FileInputStream fileInputStream = new FileInputStream(file);
             ObjectInputStream inputStream = new ObjectInputStream(fileInputStream)) {
            People people = (People) inputStream.readObject();
            if (people instanceof Man)
                return (Man) people;
            if (people instanceof Woman)
                return (Woman) people;

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return null;
    }*/
}
