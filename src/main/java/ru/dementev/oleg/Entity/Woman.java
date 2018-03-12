package ru.dementev.oleg.Entity;

import java.util.Date;
import java.util.Objects;

/**
 * Created by Антон Дементьев on 11.03.2018.
 */
public class Woman implements Human {

    private   final String sex = "woman";
    protected final String firstName;
    protected final String lastName;
    protected final String middelName;
    protected final Date   birtday;


    public Woman(String firstName, String lastName, String middelName, Date birtday) {
        this.firstName=firstName;
        this.lastName=lastName;
        this.middelName=middelName;
        this.birtday=birtday;

    }


    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public String getMiddelName() {
        return middelName;
    }

    @Override
    public Date getBirtday() {
        return birtday;
    }

    @Override
    public String getSex() {
        return sex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Woman woman = (Woman) o;
        return Objects.equals(sex, woman.sex) &&
                Objects.equals(firstName, woman.firstName) &&
                Objects.equals(lastName, woman.lastName) &&
                Objects.equals(middelName, woman.middelName) &&
                Objects.equals(birtday, woman.birtday);
    }

    @Override
    public int hashCode() {

        return Objects.hash(sex, firstName, lastName, middelName, birtday);
    }

    @Override
    public String toString() {
        return "Man{" + super.toString() +
                "sex='" + sex + '\'' +
                "} ";
    }
}