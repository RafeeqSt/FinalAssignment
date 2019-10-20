package me.rafeeqstephens.repository.patientInfo;

import me.rafeeqstephens.domain.patientInfo.PatientAppointment;
import me.rafeeqstephens.repository.IRepository;

import java.util.Set;

public interface PatientAppointmentRepository extends IRepository<PatientAppointment,String> {
    Set<PatientAppointment> getAll();
}
