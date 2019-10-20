package me.rafeeqstephens.service.physio;

import me.rafeeqstephens.domain.Physiotherapist;
import me.rafeeqstephens.service.IService;

import java.util.Set;

public interface PhysioTherapistService extends IService<Physiotherapist, String> {
        Set<Physiotherapist> getAll();
}
