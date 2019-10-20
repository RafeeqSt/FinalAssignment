package me.rafeeqstephens.service.patientInfo;

import me.rafeeqstephens.domain.patientInfo.PatientAppointment;
import me.rafeeqstephens.service.IService;

import java.util.Set;

public interface PatientAppointmentService extends IService<PatientAppointment,String> {
    Set<PatientAppointment> getAll();
}
