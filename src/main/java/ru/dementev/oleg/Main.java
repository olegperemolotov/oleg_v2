package ru.dementev.oleg;

import ru.dementev.oleg.Entity.Man;
import ru.dementev.oleg.Entity.People;
import ru.dementev.oleg.Entity.Woman;

import java.util.Date;

/**
 * Created by Антон Дементьев on 11.03.2018.
 */
public class Main {
    public static void main(String[] args) {
        People man = new Man("Test","Test2","Test1",new Date());
        Serialize.serialazeble(man);
        System.out.println(Serialize.deserialazeble());

        People woman = new Woman("TestW","TestW2","TestW",new Date());
        Serialize.serialazeble(woman);
        System.out.println(Serialize.deserialazeble());


    }
}
