package me.rafeeqstephens.factory.billing;

import me.rafeeqstephens.domain.billing.PrivateBilling;
import org.junit.Assert;
import org.junit.Test;

public class PrivateBillingFactoryTest {

    @Test
    public void getPaymentMethod() {
        String code = "ADP 2";
        PrivateBilling i = PrivateBillingFactory.getPaymentMethod(code);
        System.out.println(i);
        Assert.assertNotNull(i.getPaymentMethod());
    }
}
