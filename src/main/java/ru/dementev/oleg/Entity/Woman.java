package ru.dementev.oleg.Entity;

import java.util.Date;

/**
 * Created by Антон Дементьев on 11.03.2018.
 */
public class Woman extends People {

    private final String sex = "Woman";

    public Woman(String firstName, String lastName, String middelName, Date birtday) {
        super(firstName, lastName, middelName, birtday);
    }

    public String getSex() {
        return sex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Woman woman = (Woman) o;

        return sex.equals(woman.sex);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + sex.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Woman{" + super.toString() +
                "sex='" + sex + '\'' +
                "} ";
    }
}
