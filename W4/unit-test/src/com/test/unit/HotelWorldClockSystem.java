package com.test.unit;

import java.util.ArrayList;
import java.util.List;

public class HotelWorldClockSystem {
    private List<CityClock> cityClocks = new ArrayList<CityClock>();

    public void attach(CityClock cityClock) {
        this.cityClocks.add(cityClock);
    }

    public List<CityClock> getClocks() {
        return this.cityClocks;
    }

}
