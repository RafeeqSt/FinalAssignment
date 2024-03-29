package me.rafeeqstephens.factory.occupational;

import me.rafeeqstephens.domain.occupational.OccupationalTherapist;

public class OccupationalTherapistFactory {
    public static OccupationalTherapist getQualification(String qualification){
        return new OccupationalTherapist.Builder().qualification(qualification).build();
    }
}
