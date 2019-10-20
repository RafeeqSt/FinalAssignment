package me.rafeeqstephens.service.occupational;

import me.rafeeqstephens.domain.occupational.OTTools;
import me.rafeeqstephens.service.IService;

import java.util.Set;

public interface OTToolsService extends IService<OTTools,String> {
    Set<OTTools>getAll();
}
