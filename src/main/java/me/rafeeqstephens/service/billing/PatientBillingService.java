package me.rafeeqstephens.service.billing;

import me.rafeeqstephens.domain.billing.PatientBilling;
import me.rafeeqstephens.service.IService;

import java.util.Set;

public interface PatientBillingService extends IService<PatientBilling,String> {
    Set<PatientBilling> getAll();
}
