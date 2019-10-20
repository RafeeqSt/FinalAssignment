package me.rafeeqstephens.service.occupational;

import me.rafeeqstephens.domain.Booking;
import me.rafeeqstephens.service.IService;

import java.util.Set;

public interface OTBookingService extends IService<Booking, String> {
    Set<Booking> getAll();
}
