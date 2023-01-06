//package com.perscholas.java_basics;

public class MathPractice {

  public static void main(String[] args) {
    System.out.println(Math.PI);
    System.out.println(Math.E);

    //min and max
    Math.max(2, 3); //3
    Math.max(5, 3); //5
    Math.min(2, 1); //1
    Math.min(2, 3); //2

    //abs
    Math.abs(-2); //2
    Math.abs(-5); //5

    //------all below take doubles-----
    //exp(double a): e^a
    Math.exp(1); //2.71

    //log(double a)
    Math.log(2.71); //1.0

    //log10
    Math.log10(5);

    //pow
    Math.pow(2, 2); //4

    //sqrt
    Math.sqrt(16); //4.0

    //natural log of x+1
    Math.log1p(26);

    //rouding a number

    //double ceil(double x)
    System.out.println(Math.ceil(5.1)); //rounds up to nearest int whole number 6.0(double)

    //double floor(double x) - rounds down to nearest int, returned as double
    System.out.println(Math.floor(5.9999)); //5.0

    // double rint(double x) - rounds to the closest whole num returned as a double
    System.out.println(Math.rint(5.59999999));

    //int round(float x)
    //return (int)Math.floor(x+0.5);

    System.out.println(Math.round(3.1232));

    //long round(double x)
    //return (long)Math.floor(x+0.5)
    System.out.println(Math.round(5.3));

    //Random
    //Generates a random number between 0(inclusive) and 1(exclusive)
    //(0.0<=Math.random()<1.0)
    int x = (int) (Math.random() * 11); //return random number between 0 and 10
    //typecasting to int returns whole num
    System.out.println(x);
    x = 45 + (int) (Math.random() * 20); //random num btw 45-64
    System.out.println(x);

    //a+Math.random()*b //Returns a random num between a and a+b, excluding a+b

    //100-1000
    x = 100 + (int) (Math.random() * 901);

    //also trg functions
    Math.cos(1.0);
    Math.tan(1.0);
    Math.sin(1.0);
    Math.tanh(1.0);
    Math.cosh(1.0);
    Math.atan(1.0);
  }
}
