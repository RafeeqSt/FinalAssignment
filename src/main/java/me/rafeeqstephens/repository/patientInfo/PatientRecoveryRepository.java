package me.rafeeqstephens.repository.patientInfo;

import me.rafeeqstephens.domain.patientInfo.PatientRecovery;
import me.rafeeqstephens.repository.IRepository;

import java.util.Set;

public interface PatientRecoveryRepository extends IRepository<PatientRecovery,String> {
    Set<PatientRecovery> getAll();
}
