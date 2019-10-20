package me.rafeeqstephens.factory.occupational;

import me.rafeeqstephens.domain.occupational.OTAvailability;

public class OTAvailabilityFactory {
    public static OTAvailability getOTBooked(Boolean booked){
        return new OTAvailability.Builder().booked(booked).build();
    }
}

