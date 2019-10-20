package me.rafeeqstephens.service.billing;

import me.rafeeqstephens.domain.billing.MedicalAid;
import me.rafeeqstephens.service.IService;

import java.util.Set;

public interface MedicalAidService extends IService<MedicalAid,String> {
    Set<MedicalAid> getAll();
}

