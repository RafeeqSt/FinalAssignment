package me.rafeeqstephens.factory.occupational;

import me.rafeeqstephens.domain.occupational.OTSchedule;
import org.junit.Assert;
import org.junit.Test;

public class OTScheduleFactoryTest {

    @Test
    public void getOTTime() {
        int code = 1234;
        OTSchedule i = OTScheduleFactory.getOTTime(code);
        System.out.println(i);
        Assert.assertNotNull(i.getOTTime());
    }
}
