package me.rafeeqstephens.domain.access;

import me.rafeeqstephens.domain.patientInfo.PersonAge;
import me.rafeeqstephens.domain.patientInfo.PersonName;

public class Person implements PersonName, PersonAge {
    String gender;

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public void fName() {

    }

    @Override
    public void SName() {

    }

    @Override
    public void age() {

    }


}
