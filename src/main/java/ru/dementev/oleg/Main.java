package ru.dementev.oleg;

import ru.dementev.oleg.Entity.Man;
import ru.dementev.oleg.Entity.Human;
import ru.dementev.oleg.Entity.Woman;
import ru.dementev.oleg.Entity.CreateMan;
import ru.dementev.oleg.Entity.CreateWoman;
import ru.dementev.oleg.Entity.CreateHuman;

import java.util.Date;

/**
 * Created by Антон Дементьев on 11.03.2018.
 */
public class Main {
    public static void main(String[] args) {
       // Man man = new Man("Test","Test2","Test1",new Date());
        CreateHuman createhuman1 = new CreateMan("TestM","TestM","TestM",new Date());
        CreateHuman createhuman2 = new CreateWoman("TestW","TestW","TestW",new Date());

        Serialize.serialazable(createhuman1.create());

        // SerializeMan.deserialazable();
       // Serialize.serialazable(man);
       // System.out.println(Serialize.deserialazable());

       // Serialize.serialazable(woman);
       // System.out.println(Serialize.deserialazable());


    }
}
