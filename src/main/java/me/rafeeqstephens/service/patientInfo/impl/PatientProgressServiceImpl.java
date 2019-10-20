package me.rafeeqstephens.service.patientInfo.impl;

import me.rafeeqstephens.domain.patientInfo.PatientProgress;
import me.rafeeqstephens.repository.patientInfo.PatientProgressRepository;
import me.rafeeqstephens.repository.patientInfo.impl.PatientProgressRepositoryImpl;
import me.rafeeqstephens.service.patientInfo.PatientProgressService;

import org.springframework.stereotype.Service;
import java.util.Set;

@Service
public class PatientProgressServiceImpl implements PatientProgressService {

    private static PatientProgressServiceImpl service = null;
    private PatientProgressRepository repository;

    private PatientProgressServiceImpl() {
        this.repository = PatientProgressRepositoryImpl.getRepository();
    }

    public static PatientProgressServiceImpl getService(){
        if(service == null) service = new PatientProgressServiceImpl();
        return service;
    }

    @Override
    public Set<PatientProgress> getAll() {
        return this.repository.getAll();
    }

    @Override
    public PatientProgress create(PatientProgress patientProgress) {
        return this.repository.create(patientProgress);
    }

    @Override
    public PatientProgress update(PatientProgress patientProgress) {
        return this.repository.update(patientProgress);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public PatientProgress read(String s) {
        return this.repository.read(s);
    }
}
