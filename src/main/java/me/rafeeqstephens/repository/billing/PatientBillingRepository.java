package me.rafeeqstephens.repository.billing;

import me.rafeeqstephens.domain.billing.PatientBilling;
import me.rafeeqstephens.repository.IRepository;

import java.util.Set;

public interface PatientBillingRepository extends IRepository<PatientBilling,String> {
    Set<PatientBilling> getAll();
}
