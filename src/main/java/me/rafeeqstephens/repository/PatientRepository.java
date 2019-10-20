package me.rafeeqstephens.repository;

import me.rafeeqstephens.domain.Patient;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends CrudRepository<Patient, String> {
}
