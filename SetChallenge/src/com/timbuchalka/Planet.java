package com.timbuchalka;

/**
 * Created by Arnas on 2017.06.20.
 */
public class Planet extends HeavenlyBody {
    public Planet(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyTypes.PLANET);
    }

    @Override
    public boolean addSatellite(HeavenlyBody moon) {
        if(moon.getBodyType() == BodyTypes.MOON){
            return super.addSatellite(moon);
        } else {
            return false;
        }
    }
}
