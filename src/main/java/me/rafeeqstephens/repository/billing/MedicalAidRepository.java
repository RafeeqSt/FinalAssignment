package me.rafeeqstephens.repository.billing;

import me.rafeeqstephens.domain.billing.MedicalAid;
import me.rafeeqstephens.repository.IRepository;

import java.util.Set;

public interface MedicalAidRepository extends IRepository<MedicalAid,String> {
    Set<MedicalAid> getAll();
}

