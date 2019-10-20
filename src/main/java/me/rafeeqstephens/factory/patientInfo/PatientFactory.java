package me.rafeeqstephens.factory.patientInfo;

import me.rafeeqstephens.domain.patientInfo.Patient;

public class PatientFactory {
        public static Patient getPatientID(String patientID){
            return new Patient.Builder().patientID(patientID).build();
        }
}
