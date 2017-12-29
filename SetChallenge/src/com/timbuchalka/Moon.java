package com.timbuchalka;

/**
 * Created by Arnas on 2017.06.20.
 */
public class Moon extends HeavenlyBody {
    public Moon(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyTypes.MOON);
    }
}
