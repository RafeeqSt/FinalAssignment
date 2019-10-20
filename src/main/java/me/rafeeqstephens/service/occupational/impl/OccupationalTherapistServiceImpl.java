package me.rafeeqstephens.service.occupational.impl;

import me.rafeeqstephens.domain.occupational.OccupationalTherapist;
import me.rafeeqstephens.repository.occupational.OccupationalTherapistRepository;
import me.rafeeqstephens.repository.occupational.impl.OccupationalTherapistRepositoryImpl;
import me.rafeeqstephens.service.occupational.OccupationalTherapistService;

import org.springframework.stereotype.Service;

import java.util.Set;
@Service

public class OccupationalTherapistServiceImpl implements OccupationalTherapistService {

    private static OccupationalTherapistServiceImpl service = null;
    private OccupationalTherapistRepository repository;

    private OccupationalTherapistServiceImpl() {
        this.repository = OccupationalTherapistRepositoryImpl.getRepository();
    }

    public static OccupationalTherapistServiceImpl getService(){
        if(service == null) service = new OccupationalTherapistServiceImpl();
        return service;
    }

    @Override
    public Set<OccupationalTherapist> getAll() {
        return this.repository.getAll();
    }

    @Override
    public OccupationalTherapist create(OccupationalTherapist occupationalTherapist) {
        return this.repository.create(occupationalTherapist);
    }

    @Override
    public OccupationalTherapist update(OccupationalTherapist occupationalTherapist) {
        return this.repository.update(occupationalTherapist);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public OccupationalTherapist read(String s) {
        return this.repository.read(s);
    }
}
