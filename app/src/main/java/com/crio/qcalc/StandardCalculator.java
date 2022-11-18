
package com.crio.qcalc;
public class StandardCalculator {
    int num1;
    int num2;
    int result;
public void add(int num1, int num2){
    result = num1 + num2;
   

}

public int getResult() {

    return result;

}
public void clearResult() {

    result = 0;

}

public void subtract(int num1, int num2){
    result = num1 - num2;

}


public void multiply(int num1, int num2){
    result = num1*num2;

}


public void divide(int num1, int num2){
    result = num1 / num2;

}
    public static void getVersion(){

        System.out.println("Standard Calculator 1.0");

    }
    public void printResult(){

        System.out.println("Standard Calculator Result:"+ result);

    }
}
