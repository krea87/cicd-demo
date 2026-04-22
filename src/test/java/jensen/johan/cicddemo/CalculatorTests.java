package jensen.johan.cicddemo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTests {
    Calculator calculator;

    private static final double DELTA = 0.001;
    @BeforeEach
    void setup(){
        // här sätter jag upp mitt testobjekt på nytt inför varje test
    calculator = new Calculator();
    }

    @Test
    void addTwoNumbers(){
        // AAA-metoden

        // Arange
        double firstNumber = 1;
        double secondNumber = 2;
        // Act
        double result = calculator.add(firstNumber,secondNumber);
        // Assert
        // Expected, actual
        assertEquals(3, result);
    }

    @Test
    void addTwoNumbersWithDecimals(){
        // AAA-metoden

        // Arange
        double firstNumber = 0.1;
        double secondNumber = 0.2;
        // Act
        double result = calculator.add(firstNumber,secondNumber);
        // Assert
        // Alltid när ni jämför decimaltal måste ni ha med delta
        assertEquals(0.3, result, DELTA);
    }

    @Test
    void divideTwoNumbers(){
        //happy path
        assertEquals(2, calculator.divide(10, 5), DELTA);
    }

    @Test
    void divideByZero(){

        assertEquals(2, calculator.divide(10, 0), DELTA);
    }
}
