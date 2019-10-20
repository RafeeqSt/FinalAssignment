package me.rafeeqstephens.repository.patientInfo;

import me.rafeeqstephens.domain.patientInfo.PatientProgress;
import me.rafeeqstephens.repository.IRepository;

import java.util.Set;

public interface PatientProgressRepository extends IRepository<PatientProgress,String> {
    Set<PatientProgress> getAll();
}
