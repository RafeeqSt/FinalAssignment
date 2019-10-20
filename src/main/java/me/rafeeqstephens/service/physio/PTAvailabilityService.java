package me.rafeeqstephens.service.physio;

import me.rafeeqstephens.domain.physio.PTAvailability;
import me.rafeeqstephens.service.IService;

import java.util.Set;

public interface PTAvailabilityService extends IService<PTAvailability, String> {
    Set<PTAvailability> getAll();
}
