package me.rafeeqstephens.factory.occupational;

import me.rafeeqstephens.domain.occupational.OTAvailability;
import org.junit.Assert;
import org.junit.Test;

public class OTAvailabilityFactoryTest {

    @Test
    public void getOTBooked() {
        Boolean code = false;
        OTAvailability i = OTAvailabilityFactory.getOTBooked(code);
        System.out.println(i);
        Assert.assertNotNull(i.getOTBooked());
    }
}
