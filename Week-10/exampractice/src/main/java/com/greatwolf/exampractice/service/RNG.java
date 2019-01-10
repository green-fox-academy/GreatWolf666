package com.greatwolf.exampractice.service;

public class RNG {

  public static Long randomFourDigitLong(){
    Long code = new Long((int)(Math.random()*9000)+1000);
    return code;
  }
}
