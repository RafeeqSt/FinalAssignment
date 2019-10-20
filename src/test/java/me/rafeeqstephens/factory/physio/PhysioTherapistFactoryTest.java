package me.rafeeqstephens.factory.physio;

import me.rafeeqstephens.domain.physio.PhysioTherapist;
import org.junit.Assert;
import org.junit.Test;

public class PhysioTherapistFactoryTest {

    @Test
    public void getQualification() {
        String code = "ADP 2";
        PhysioTherapist i = PhysioTherapistFactory.getQualification(code);
        System.out.println(i);
        Assert.assertNotNull(i.getQualification());
    }
}
