package me.rafeeqstephens.factory.physio;

import me.rafeeqstephens.domain.physio.PTSchedule;

import java.util.Date;

public class PTScheduleFactory {
    public static PTSchedule getPTDate(Date date){
        return new PTSchedule.Builder().date(date).build();
    }
    public static PTSchedule getPTTime(int time){ return new PTSchedule.Builder().time(time).build();
    }
}
