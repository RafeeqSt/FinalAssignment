package me.rafeeqstephens.service.physio.impl;

import me.rafeeqstephens.domain.physio.PTSchedule;
import me.rafeeqstephens.repository.physio.PTScheduleRepository;
import me.rafeeqstephens.repository.physio.impl.PTScheduleRepositoryImpl;
import me.rafeeqstephens.service.physio.PTScheduleService;

import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class PTScheduleServiceImpl implements PTScheduleService {

    private static PTScheduleServiceImpl service = null;
    private PTScheduleRepository repository;

    private PTScheduleServiceImpl() {
        this.repository = PTScheduleRepositoryImpl.getRepository();
    }

    public static PTScheduleServiceImpl getService(){
        if(service == null) service = new PTScheduleServiceImpl();
        return service;
    }

    @Override
    public Set<PTSchedule> getAll() {
        return this.repository.getAll();
    }

    @Override
    public PTSchedule create(PTSchedule pts) {
        return this.repository.create(pts);
    }

    @Override
    public PTSchedule update(PTSchedule pts) {
        return this.repository.update(pts);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public PTSchedule read(String s) {
        return this.repository.read(s);
    }
}
