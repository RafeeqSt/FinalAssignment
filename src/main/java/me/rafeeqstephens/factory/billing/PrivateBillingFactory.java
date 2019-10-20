package me.rafeeqstephens.factory.billing;

import me.rafeeqstephens.domain.billing.PrivateBilling;

public class PrivateBillingFactory {
    public static PrivateBilling getPaymentMethod(String paymentMethod){
        return new PrivateBilling.Builder().paymentMethod(paymentMethod).build();
    }
}

