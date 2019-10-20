package me.rafeeqstephens.repository.physio;

import me.rafeeqstephens.domain.physio.PTSchedule;
import me.rafeeqstephens.repository.IRepository;

import java.util.Set;

public interface PTScheduleRepository extends IRepository<PTSchedule,String> {
        Set<PTSchedule> getAll();
}
