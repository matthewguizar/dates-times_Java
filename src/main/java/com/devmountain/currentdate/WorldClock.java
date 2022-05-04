package com.devmountain.currentdate;

import java.time.*;

public class WorldClock {

    public LocalDate getNowForDate() {
        LocalDate localDate = LocalDate.now();
        return localDate;
    }

    public LocalDateTime getNowForDateAndTime() {
        LocalDateTime localDateTime = LocalDateTime.now();
        return localDateTime;
    }

    public DayOfWeek getDayOfWeekForNow() {
        LocalDateTime localDateTime = LocalDateTime.now();
        return localDateTime.getDayOfWeek();
    }

    public int getDayOfMonthForNow() {
        LocalDateTime localDateTime = LocalDateTime.now();
        return localDateTime.getDayOfMonth();
    }

    public int getDayOfYearForNow() {
        LocalDateTime localDateTime = LocalDateTime.now();
        return localDateTime.getDayOfYear();
    }

    public ZonedDateTime getNowDateTimeForNewYork() {
        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
        return zonedDateTime;
    }

    public ZonedDateTime getNowDateTimeForLA() {
       ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
       return zonedDateTime;
    }

    public ZonedDateTime getNowDateTimeForLondon() {
        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("Europe/London"));
        return zonedDateTime;
    }

    public ZonedDateTime getNowDateTimeForMoscow() {
        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("Europe/Moscow"));
        return zonedDateTime;
    }

    public ZonedDateTime getNowDateTimeForTokyo() {
        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
        return zonedDateTime;
    }



}
