package ru.dementev.oleg;

import ru.dementev.oleg.Entity.Human;
import ru.dementev.oleg.Entity.Man;
import ru.dementev.oleg.Entity.People;
import ru.dementev.oleg.Entity.Woman;

public class SerializeMan extends SerilizeHuman{


    public void serMan(Man man){
        SerializeMan.serialazable(man);
    }

    public Man deserMan(){
        return (Man)SerializeMan.deserialazable();
    }
}
