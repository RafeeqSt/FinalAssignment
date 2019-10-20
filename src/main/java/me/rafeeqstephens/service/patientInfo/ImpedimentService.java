package me.rafeeqstephens.service.patientInfo;

import me.rafeeqstephens.domain.patientInfo.Impediment;
import me.rafeeqstephens.service.IService;

import java.util.Set;

public interface ImpedimentService extends IService<Impediment, String> {
        Set<Impediment> getAll();
}
