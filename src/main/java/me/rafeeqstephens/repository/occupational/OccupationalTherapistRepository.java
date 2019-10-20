package me.rafeeqstephens.repository.occupational;

import me.rafeeqstephens.domain.occupational.OccupationalTherapist;
import me.rafeeqstephens.repository.IRepository;

import java.util.Set;

public interface OccupationalTherapistRepository extends IRepository<OccupationalTherapist, String> {
    Set<OccupationalTherapist> getAll();
}
