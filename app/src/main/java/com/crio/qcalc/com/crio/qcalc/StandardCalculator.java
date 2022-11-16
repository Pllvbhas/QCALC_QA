package com.crio.qcalc;


public class StandardCalculator {
    int num1;
    int num2;

public int add(int num1, int num2){
    return num1 + num2;

}


public int subtract(int num1, int num2){
    return num1 - num2;

}


public int multiply(int num1, int num2){
    return num1*num2;

}


public int divide(int num1, int num2){
    return num1 / num2;

}



    public static void getVersion(){

        System.out.println("Standard Calculator 1.0");

    }
}

