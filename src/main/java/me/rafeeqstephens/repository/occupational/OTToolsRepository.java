package me.rafeeqstephens.repository.occupational;

import me.rafeeqstephens.domain.occupational.OTTools;
import me.rafeeqstephens.repository.IRepository;

import java.util.Set;

public interface OTToolsRepository extends IRepository<OTTools,String> {
    Set<OTTools>getAll();
}
