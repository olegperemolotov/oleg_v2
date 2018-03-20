package ru.dementev.oleg;

import ru.dementev.oleg.Entity.Man;
import ru.dementev.oleg.Entity.Woman;
import ru.dementev.oleg.Entity.Human;

import java.io.*;

/**
 * Created by Антон Дементьев on 11.03.2018.
 */
public class Serialize {
    static File file = new File("text.txt");


    static boolean serialazable(Man man) {
        try (FileOutputStream fileOutputStream = new FileOutputStream(file);
             ObjectOutputStream inputStream = new ObjectOutputStream(fileOutputStream)) {
            inputStream.writeObject(man);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return true;
    }

    static boolean serialazable(Woman woman) {
        try (FileOutputStream fileOutputStream = new FileOutputStream(file);
             ObjectOutputStream inputStream = new ObjectOutputStream(fileOutputStream)) {
            inputStream.writeObject(woman);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return true;
    }

    static Man deserialazableMan() {
        try (FileInputStream fileInputStream = new FileInputStream(file);
             ObjectInputStream inputStream = new ObjectInputStream(fileInputStream)) {

            if (inputStream.readObject() instanceof Man)
                return (Man) inputStream.readObject();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return null;
    }

    static Woman deserialazableWoman() {
        try (FileInputStream fileInputStream = new FileInputStream(file);
             ObjectInputStream inputStream = new ObjectInputStream(fileInputStream)) {

            if (inputStream.readObject() instanceof Woman)
                return (Woman) inputStream.readObject();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return null;
    }

}
