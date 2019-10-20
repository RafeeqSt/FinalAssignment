package me.rafeeqstephens.service.physio;

import me.rafeeqstephens.domain.physio.PTSchedule;
import me.rafeeqstephens.service.IService;

import java.util.Set;

public interface PTScheduleService extends IService<PTSchedule,String> {
        Set<PTSchedule> getAll();
}
