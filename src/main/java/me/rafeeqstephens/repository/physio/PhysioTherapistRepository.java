package me.rafeeqstephens.repository.physio;

import me.rafeeqstephens.domain.physio.PhysioTherapist;
import me.rafeeqstephens.repository.IRepository;

import java.util.Set;

public interface PhysioTherapistRepository  extends IRepository<PhysioTherapist, String> {
        Set<PhysioTherapist> getAll();
}
