package me.rafeeqstephens.service.patientInfo;

import me.rafeeqstephens.domain.patientInfo.PatientRecovery;
import me.rafeeqstephens.service.IService;

import java.util.Set;

public interface PatientRecoveryService extends IService<PatientRecovery,String> {
    Set<PatientRecovery> getAll();
}
