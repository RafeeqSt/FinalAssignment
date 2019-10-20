package me.rafeeqstephens.repository.physio;

import me.rafeeqstephens.domain.physio.PTTools;
import me.rafeeqstephens.repository.IRepository;

import java.util.Set;

public interface PTToolsRepository extends IRepository<PTTools,String> {
    Set<PTTools> getAll();
}
