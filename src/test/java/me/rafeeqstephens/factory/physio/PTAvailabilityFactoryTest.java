package me.rafeeqstephens.factory.physio;

import me.rafeeqstephens.domain.physio.PTAvailability;
import org.junit.Assert;
import org.junit.Test;

public class PTAvailabilityFactoryTest {

    @Test
    public void getPTBooked() {

        boolean code = true;
        PTAvailability i = PTAvailabilityFactory.getPTBooked(code);
        System.out.println(i);
        Assert.assertNotNull(i.getPTBooked());
    }
}
