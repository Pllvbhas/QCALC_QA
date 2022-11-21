package com.crio.qcalc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class StandardCalculatorTest {
    private StandardCalculator standardCalculator;

    @BeforeEach
    void setup(){
        
// StandardCalculator calc = new StandardCalculator();

// calc.add(Double.MAX_VALUE, Double.MAX_VALUE);

// calc.printResult();

standardCalculator = new StandardCalculator();
        
// StandardCalculator calc = new StandardCalculator();

// calc.add(Double.MAX_VALUE, 68.0);

// calc.printResult();

    }


    @Test
    @DisplayName("Test Addition Overflow of Two Doubles")
    void testAdditionOverflowForDoubles(){
        //Assert
        Assertions.assertThrows(ArithmeticException.class,new Executable(){
            @Override
            public void execute() throws Throwable{
                standardCalculator.add(Double.MAX_VALUE, Double.MAX_VALUE);
            }
        });
    }
    @Test
    @DisplayName("Test Subtraction Overflow of Two Doubles")
    void testSubtractionOverflowForDoubles(){
        //Assert
        Assertions.assertThrows(ArithmeticException.class,new Executable(){
            @Override
            public void execute() throws Throwable{
                standardCalculator.subtract(-Double.MAX_VALUE,Double.MAX_VALUE);
            }
        });
    }

    @Test
    @DisplayName("Test Addition of Two Doubles")
    void testAdditionOperationForDoubles(){
        standardCalculator.add(1.0,1.5);
        double actualResult = standardCalculator.getResult();
        Assertions.assertEquals(2.5, actualResult);
    }

    @Test
    @DisplayName("Test Substraction of Two Doubles")
    void testSubtractionOperationForDoubles(){
        standardCalculator.subtract(10.0,20.5);
        double actualResult = standardCalculator.getResult();
        Assertions.assertEquals(-10.5, actualResult);
    }

    @Test

    @DisplayName("Test Multiplication of Two Doubles")
    
    void testMultiplicationOperationForDoubles(){
        standardCalculator.multiply(12.0,4.5);
        double actualResult = standardCalculator.getResult();
        Assertions.assertEquals(54.0, actualResult);
    }
    
    
    @Test
    
    @DisplayName("Test Division of Two Doubles")
    
    void testDivisionOperationForDoubles(){
        standardCalculator.divide(12.0,3.0);
        double actualResult = standardCalculator.getResult();
        Assertions.assertEquals(4.0, actualResult);
    }
    
@Test

@DisplayName("Test Addition of Two Integers")

void testAdditionOperation(){

        standardCalculator.add(1,1);

        double actualResult = standardCalculator.getResult();

        Assertions.assertEquals(2, actualResult);

}

@Test

@DisplayName("Test Subtraction of Two Integers")

void testSubtractionOperation(){

        standardCalculator.subtract(1,1);

        double actualResult = standardCalculator.getResult();

        Assertions.assertEquals(0, actualResult);

}

@Test

@DisplayName("Test Division of Two Integers")

void testDivisionOperation(){
    standardCalculator.divide(1,1);
        double actualResult = standardCalculator.getResult();
        Assertions.assertEquals(1, actualResult);  
}
@Test

@DisplayName("Test Multiplication of Two Integers")

void testMultiplicationOperation(){
    standardCalculator.multiply(6,-4);
        double actualResult = standardCalculator.getResult();
        Assertions.assertEquals(-24, actualResult);  
    }
}
