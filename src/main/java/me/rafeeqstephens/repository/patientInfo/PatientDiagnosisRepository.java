package me.rafeeqstephens.repository.patientInfo;

import me.rafeeqstephens.domain.patientInfo.PatientDiagnosis;
import me.rafeeqstephens.repository.IRepository;

import java.util.Set;

public interface PatientDiagnosisRepository extends IRepository<PatientDiagnosis,String> {
    Set<PatientDiagnosis> getAll();
}
