package me.rafeeqstephens.factory.occupational;

import me.rafeeqstephens.domain.occupational.OTBooking;

public class OTBookingFactory {
    public static OTBooking getOTPatientDetails(String patientDetails){
        return new OTBooking.Builder().patientDetails(patientDetails).build();
    }
}

