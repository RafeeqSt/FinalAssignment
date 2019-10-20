package me.rafeeqstephens.repository.physio;

import me.rafeeqstephens.domain.physio.PTAvailability;
import me.rafeeqstephens.repository.IRepository;

import java.util.Set;

public interface PTAvailabilityRespository extends IRepository<PTAvailability, String> {
    Set<PTAvailability> getAll();
}
