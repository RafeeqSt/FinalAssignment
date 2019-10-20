package me.rafeeqstephens.repository.occupational;

import me.rafeeqstephens.domain.occupational.OTBooking;
import me.rafeeqstephens.repository.IRepository;

import java.util.Set;

public interface OTBookingRepository extends IRepository<OTBooking, String> {
    Set<OTBooking> getAll();
}
