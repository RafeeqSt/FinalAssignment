package me.rafeeqstephens.service.patientInfo.impl;

import me.rafeeqstephens.domain.patientInfo.PatientDiagnosis;
import me.rafeeqstephens.repository.patientInfo.PatientDiagnosisRepository;
import me.rafeeqstephens.repository.patientInfo.impl.PatientDiagnosisRepositoryImpl;
import me.rafeeqstephens.service.patientInfo.PatientDiagnosisService;

import org.springframework.stereotype.Service;
import java.util.Set;

@Service
public class PatientDiagnosisServiceImpl implements PatientDiagnosisService {
    private static PatientDiagnosisServiceImpl service = null;
    private PatientDiagnosisRepository repository;

    private PatientDiagnosisServiceImpl() {
        this.repository = PatientDiagnosisRepositoryImpl.getRepository();
    }

    public static PatientDiagnosisServiceImpl getService(){
        if(service == null) service = new PatientDiagnosisServiceImpl();
        return service;
    }

    @Override
    public Set<PatientDiagnosis> getAll() {
        return this.repository.getAll();
    }

    @Override
    public PatientDiagnosis create(PatientDiagnosis pd) {
        return this.repository.create(pd);
    }

    @Override
    public PatientDiagnosis update(PatientDiagnosis pd) {
        return this.repository.update(pd);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public PatientDiagnosis read(String s) {
        return this.repository.read(s);
    }
}
