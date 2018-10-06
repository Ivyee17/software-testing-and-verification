package com.test.unit;

public abstract class Clock {
    protected int utcOffset;
    public abstract int getTime();
}
