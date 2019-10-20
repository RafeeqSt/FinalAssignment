package me.rafeeqstephens.service.occupational;

import me.rafeeqstephens.domain.occupational.OccupationalTherapist;
import me.rafeeqstephens.service.IService;

import java.util.Set;

public interface OccupationalTherapistService extends IService<OccupationalTherapist, String> {
    Set<OccupationalTherapist> getAll();
}
