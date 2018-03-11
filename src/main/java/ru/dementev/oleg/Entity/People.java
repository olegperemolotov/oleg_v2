package ru.dementev.oleg.Entity;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Антон Дементьев on 11.03.2018.
 */
public abstract class People implements Serializable {
    protected final String firstName;
    protected final String lastName;
    protected final String middelName;
    protected final Date birtday;

    public People(String firstName, String lastName, String middelName, Date birtday) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middelName = middelName;
        this.birtday = birtday;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddelName() {
        return middelName;
    }

    public Date getBirtday() {
        return birtday;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        People people = (People) o;

        if (firstName != null ? !firstName.equals(people.firstName) : people.firstName != null) return false;
        if (lastName != null ? !lastName.equals(people.lastName) : people.lastName != null) return false;
        if (middelName != null ? !middelName.equals(people.middelName) : people.middelName != null) return false;
        return birtday != null ? birtday.equals(people.birtday) : people.birtday == null;
    }

    @Override
    public int hashCode() {
        int result = firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (middelName != null ? middelName.hashCode() : 0);
        result = 31 * result + (birtday != null ? birtday.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return  "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middelName='" + middelName + '\'' +
                ", birtday=" + birtday +" ";
    }
}
