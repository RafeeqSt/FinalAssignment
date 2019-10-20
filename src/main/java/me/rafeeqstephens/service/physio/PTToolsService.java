package me.rafeeqstephens.service.physio;

import me.rafeeqstephens.domain.physio.PTTools;
import me.rafeeqstephens.service.IService;

import java.util.Set;

public interface PTToolsService extends IService<PTTools,String> {
    Set<PTTools> getAll();
}
