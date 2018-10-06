package com.test.unit;

public class CityClock extends Clock {
  private int utcZeroTime;

  @Override
  public int getTime() {
      return (utcZeroTime+utcOffset+24)%24;
  }

  public void setUtcZeroTime(int utcZeroTime) {
      this.utcZeroTime = utcZeroTime;
  }

  public CityClock(int utcOffset){
      this.utcOffset=utcOffset;
  }
}
