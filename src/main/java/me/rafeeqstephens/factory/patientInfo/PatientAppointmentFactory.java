package me.rafeeqstephens.factory.patientInfo;

import me.rafeeqstephens.domain.patientInfo.PatientAppointment;

import java.util.Date;

public class PatientAppointmentFactory {
    public static PatientAppointment getAppointmentDate(Date appointmentDate){
        return new PatientAppointment.Builder().appointmentDate(appointmentDate).build();
    }

    public static PatientAppointment getAppointmentTime(int appointmentTime){
        return new PatientAppointment.Builder().appointmentTime(appointmentTime).build();
    }
}
