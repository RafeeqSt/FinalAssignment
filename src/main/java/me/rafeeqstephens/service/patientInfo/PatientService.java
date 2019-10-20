package me.rafeeqstephens.service.patientInfo;

import me.rafeeqstephens.domain.Patient;
import me.rafeeqstephens.service.IService;

import java.util.Set;

public interface PatientService extends IService<Patient, String> {
    Set<Patient> getAll();
}
