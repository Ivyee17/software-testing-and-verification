package com.test.unit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelWorldClockSystemTest {
    private HotelWorldClockSystem hotelWorldClockSystem;
    private PhoneClock phoneClock;

    @Before
    public void initial() {
        hotelWorldClockSystem = new HotelWorldClockSystem();
        phoneClock = new PhoneClock(8);
    }

    @Test
    public void clock_in_beijing_should_be_9_after_setting_clock_to_9() {
        //arrange
        CityClock cityClock = new CityClock(8);
        hotelWorldClockSystem.attach(cityClock);
        //act
        phoneClock.setHotelWorldClockSystem(hotelWorldClockSystem);
        phoneClock.setTime(9);
        //assert
        assertEquals(9, cityClock.getTime());

    }

    @Test
    public void both_clock_in_london_should_be_15_and_clock_in_new_york_should_be_10_after_setting_clock_to_23() {
        //arrange
        CityClock londonCityClock = new CityClock(0);
        hotelWorldClockSystem.attach(londonCityClock);
        CityClock newYorkCityClock = new CityClock(19);
        hotelWorldClockSystem.attach(newYorkCityClock);
        //act
        phoneClock.setHotelWorldClockSystem(hotelWorldClockSystem);
        phoneClock.setTime(23);
        //assert
        assertEquals(15, londonCityClock.getTime());
        assertEquals(10, newYorkCityClock.getTime());
    }

    @After
    public void finalize() {
        hotelWorldClockSystem = null;
        phoneClock = null;
    }
}
