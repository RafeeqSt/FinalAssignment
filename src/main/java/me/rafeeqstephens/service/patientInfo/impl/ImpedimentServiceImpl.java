package me.rafeeqstephens.service.patientInfo.impl;

import me.rafeeqstephens.domain.patientInfo.Impediment;
import me.rafeeqstephens.repository.patientInfo.ImpedimentRepository;
import me.rafeeqstephens.repository.patientInfo.impl.ImpedimentRepositoryImpl;
import me.rafeeqstephens.service.patientInfo.ImpedimentService;

import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class ImpedimentServiceImpl implements ImpedimentService {

    private static ImpedimentServiceImpl service = null;
    private ImpedimentRepository repository;

    private ImpedimentServiceImpl() {
        this.repository = ImpedimentRepositoryImpl.getRepository();
    }

    public static ImpedimentServiceImpl getService(){
        if(service == null) service = new ImpedimentServiceImpl();
        return service;
    }

    @Override
    public Set<Impediment> getAll() {
        return this.repository.getAll();
    }

    @Override
    public Impediment create(Impediment impe) {
        return this.repository.create(impe);
    }

    @Override
    public Impediment update(Impediment impe) {
        return this.repository.update(impe);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public Impediment read(String s) {
        return this.repository.read(s);
    }
}
