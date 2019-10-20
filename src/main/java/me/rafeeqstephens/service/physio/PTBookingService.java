package me.rafeeqstephens.service.physio;

import me.rafeeqstephens.domain.physio.PTBooking;
import me.rafeeqstephens.service.IService;

import java.util.Set;

public interface PTBookingService extends IService<PTBooking, String> {
    Set<PTBooking> getAll();
}

