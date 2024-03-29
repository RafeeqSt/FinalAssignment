package me.rafeeqstephens.factory.physio;

import me.rafeeqstephens.domain.physio.PTSchedule;
import org.junit.Assert;
import org.junit.Test;

public class PTScheduleFactoryTest {

    @Test
    public void getPTTime() {
        int code = 1223;
        PTSchedule i = PTScheduleFactory.getPTTime(code);
        System.out.println(i);
        Assert.assertNotNull(i.getPTTime());
    }
}
