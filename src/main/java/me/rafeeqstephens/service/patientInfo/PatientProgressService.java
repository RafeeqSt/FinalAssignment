package me.rafeeqstephens.service.patientInfo;

import me.rafeeqstephens.domain.patientInfo.PatientProgress;
import me.rafeeqstephens.service.IService;

import java.util.Set;

public interface PatientProgressService extends IService<PatientProgress,String> {
    Set<PatientProgress> getAll();
}
