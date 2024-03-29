package me.rafeeqstephens.service.physio.impl;

import me.rafeeqstephens.domain.physio.PTBooking;
import me.rafeeqstephens.repository.physio.PTBookingRepository;
import me.rafeeqstephens.repository.physio.impl.PTBookingRepositoryImpl;
import me.rafeeqstephens.service.physio.PTBookingService;

import org.springframework.stereotype.Service;
import java.util.Set;

@Service
public class PTBookingServiceImpl implements PTBookingService {

    private static PTBookingServiceImpl service = null;
    private PTBookingRepository repository;

    private PTBookingServiceImpl() {
        this.repository = PTBookingRepositoryImpl.getRepository();
    }

    public static PTBookingServiceImpl getService(){
        if(service == null) service = new PTBookingServiceImpl();
        return service;
    }

    @Override
    public Set<PTBooking> getAll() {
        return this.repository.getAll();
    }

    @Override
    public PTBooking create(PTBooking ptb) {
        return this.repository.create(ptb);
    }

    @Override
    public PTBooking update(PTBooking ptb) {
        return this.repository.update(ptb);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public PTBooking read(String s) {
        return this.repository.read(s);
    }
}
