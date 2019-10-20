package me.rafeeqstephens.service.occupational;

import me.rafeeqstephens.domain.occupational.OTSchedule;
import me.rafeeqstephens.service.IService;

import java.util.Set;

public interface OTScheduleService extends IService<OTSchedule,String> {
    Set<OTSchedule> getAll();
}
