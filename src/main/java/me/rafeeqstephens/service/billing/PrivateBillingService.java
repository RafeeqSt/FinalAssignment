package me.rafeeqstephens.service.billing;

import me.rafeeqstephens.domain.billing.PrivateBilling;
import me.rafeeqstephens.service.IService;

import java.util.Set;

public interface PrivateBillingService extends IService<PrivateBilling,String> {
    Set<PrivateBilling> getAll();
}
