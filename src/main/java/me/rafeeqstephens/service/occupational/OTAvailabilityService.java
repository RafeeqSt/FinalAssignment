package me.rafeeqstephens.service.occupational;

import me.rafeeqstephens.domain.occupational.OTAvailability;
import me.rafeeqstephens.service.IService;

import java.util.Set;

public interface OTAvailabilityService extends IService<OTAvailability, String> {
    Set<OTAvailability> getAll();
}
