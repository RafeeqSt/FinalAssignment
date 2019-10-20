package me.rafeeqstephens.factory.billing;

import me.rafeeqstephens.domain.billing.PatientBilling;

public class PatientBillingFactory {
    public static PatientBilling getHours(int hours){
        return new PatientBilling.Builder().hours(hours).build();
    }
}
