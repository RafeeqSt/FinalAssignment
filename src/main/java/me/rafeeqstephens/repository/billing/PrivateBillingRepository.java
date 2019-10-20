package me.rafeeqstephens.repository.billing;

import me.rafeeqstephens.domain.billing.PrivateBilling;
import me.rafeeqstephens.repository.IRepository;

import java.util.Set;

public interface PrivateBillingRepository extends IRepository<PrivateBilling,String> {
    Set<PrivateBilling> getAll();
}
