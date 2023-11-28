package com.example.taskmanagerwebandmysql.entities;
import java.util.TimeZone;

public enum TimeZoneEnum {
    DEFAULT(java.util.TimeZone.getDefault()),
    BULGARIA_SOFIA(java.util.TimeZone.getTimeZone("Bulgaria/Sofia"));
    private final TimeZone tz;

    private TimeZoneEnum(final TimeZone tz)
    {
        this.tz = tz;
    }

    public final TimeZone getTimeZone()
    {
        return tz;
    }

    @Override
    public String toString() {
        return tz.toString();
    }
}
