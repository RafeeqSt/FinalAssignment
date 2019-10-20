package me.rafeeqstephens.repository.patientInfo;

import me.rafeeqstephens.domain.patientInfo.Impediment;
import me.rafeeqstephens.repository.IRepository;

import java.util.Set;

public interface ImpedimentRepository extends IRepository<Impediment, String> {
        Set<Impediment> getAll();
}
