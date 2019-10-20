package me.rafeeqstephens.factory.occupational;

import me.rafeeqstephens.domain.occupational.OTSchedule;

import java.util.Date;

public class OTScheduleFactory {
    public static OTSchedule getOTDate(Date date){
        return new OTSchedule.Builder().date(date).build();
    }
    public static OTSchedule getOTTime(int time){
        return new OTSchedule.Builder().time(time).build();
    }
}
