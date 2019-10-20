package me.rafeeqstephens.repository;

import me.rafeeqstephens.domain.Physiotherapist;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhysiotherapistRepository extends CrudRepository<Physiotherapist, String> {
}
