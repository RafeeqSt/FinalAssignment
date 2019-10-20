package me.rafeeqstephens.repository.occupational;

import me.rafeeqstephens.domain.occupational.OTAvailability;
import me.rafeeqstephens.repository.IRepository;

import java.util.Set;

public interface OTAvailabilityRespository extends IRepository<OTAvailability, String> {
    Set<OTAvailability> getAll();
}
