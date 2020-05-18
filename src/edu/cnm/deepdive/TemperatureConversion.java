package edu.cnm.deepdive;

public class TemperatureConversion {

  public static void main(String[] args) {
  // Todo invoke conversion method with test values.
  }

  public static double convertC2F(double celsius) {
    return celsius * 9 / 5 + 32;
  }

  public static double convertF2C(double fahrenheit) {
   return (fahrenheit - 32) * 5 / 9;
  }

}
