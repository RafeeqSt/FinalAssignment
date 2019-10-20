package me.rafeeqstephens.repository.patientInfo;

import me.rafeeqstephens.domain.patientInfo.Patient;
import me.rafeeqstephens.repository.IRepository;

import java.util.Set;

public interface PatientRepository extends IRepository<Patient, String> {
    Set<Patient> getAll();
}
