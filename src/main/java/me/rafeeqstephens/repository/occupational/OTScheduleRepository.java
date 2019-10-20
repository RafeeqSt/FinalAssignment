package me.rafeeqstephens.repository.occupational;

import me.rafeeqstephens.domain.occupational.OTSchedule;
import me.rafeeqstephens.repository.IRepository;

import java.util.Set;

public interface OTScheduleRepository extends IRepository<OTSchedule,String> {
    Set<OTSchedule> getAll();
}
