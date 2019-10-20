package me.rafeeqstephens.repository.physio;

import me.rafeeqstephens.domain.physio.PTBooking;
import me.rafeeqstephens.repository.IRepository;

import java.util.Set;

public interface PTBookingRepository extends IRepository<PTBooking, String> {
    Set<PTBooking> getAll();
}

