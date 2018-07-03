package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {
    
  }
  
  public double maiorDouble(double v1, double v2){
    return v1 > v2 ? v1 : v2;
  }
  //TODO: Add javadoc comment
  public String greet(String someone) {
    return String.format("Hello, %s!", someone);
  }
}
