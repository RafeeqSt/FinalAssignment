package me.rafeeqstephens.factory.occupational;

import me.rafeeqstephens.domain.occupational.OccupationalTherapist;
import org.junit.Assert;
import org.junit.Test;

public class OccupationalTherapistFactoryTest {

    @Test
    public void getOccupationalTherapist() {
        String code = "ADP 2";
        OccupationalTherapist i = OccupationalTherapistFactory.getQualification(code);
        System.out.println(i);
        Assert.assertNotNull(i.getQualification());    }
}
