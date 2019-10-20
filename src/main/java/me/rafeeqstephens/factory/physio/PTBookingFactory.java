package me.rafeeqstephens.factory.physio;

import me.rafeeqstephens.domain.patientInfo.Patient;
import me.rafeeqstephens.domain.physio.PTBooking;

public class PTBookingFactory {

    public static PTBooking getPTPatientDetails(Patient patientDetails){
            return new PTBooking.Builder().patientDetails(patientDetails).build();
        }
    }



