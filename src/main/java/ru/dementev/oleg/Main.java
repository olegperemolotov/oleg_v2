package ru.dementev.oleg;

import ru.dementev.oleg.Entity.Man;
import ru.dementev.oleg.Entity.Human;
import ru.dementev.oleg.Entity.Woman;

import java.util.Date;

/**
 * Created by Антон Дементьев on 11.03.2018.
 */
public class Main {
    public static void main(String[] args) {
        Man man = new Man("Test","Test2","Test1",new Date());
        SerializeMan.deserialazable();
       // Serialize.serialazable(man);
       // System.out.println(Serialize.deserialazable());

       // People woman = new Woman("TestW","TestW2","TestW",new Date());
       // Serialize.serialazable(woman);
       // System.out.println(Serialize.deserialazable());


    }
}
