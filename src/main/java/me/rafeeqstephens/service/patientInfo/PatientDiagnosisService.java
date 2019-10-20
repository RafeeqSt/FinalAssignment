package me.rafeeqstephens.service.patientInfo;

import me.rafeeqstephens.domain.patientInfo.PatientDiagnosis;
import me.rafeeqstephens.service.IService;

import java.util.Set;

public interface PatientDiagnosisService extends IService<PatientDiagnosis,String> {
    Set<PatientDiagnosis> getAll();
}
