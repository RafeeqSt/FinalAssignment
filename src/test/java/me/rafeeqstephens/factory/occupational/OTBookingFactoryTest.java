package me.rafeeqstephens.factory.occupational;

import me.rafeeqstephens.domain.occupational.OTBooking;
import org.junit.Assert;
import org.junit.Test;

public class OTBookingFactoryTest {

    @Test
    public void getOTPatientDetails() {
        String code = "";
        OTBooking i = OTBookingFactory.getOTPatientDetails(code);
        System.out.println(i);
        Assert.assertNotNull(i.getOTPatientDetails());
    }
}
