package pl.javastart.euler2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Euler2Test {
    private Euler2 euler2;

    @Test
    public void should_Return_Sum_Of_All_Even_Fib_Numbers_Less_Than_4_000_000() {

        euler2 = new Euler2();

        assertEquals(4613732, euler2.returnFibSumForEvenNumbers(4000000));
    }

    @Test
    public void should_Return_Sum_Of_All_Even_Fib_Numbers_Less_Than_20_000_000() {

        euler2 = new Euler2();

        assertEquals(19544084, euler2.returnFibSumForEvenNumbers(20000000));
    }

    @ParameterizedTest(name = "{arguments} expected number for Maximum Fibonacci Value")

    @CsvSource({"0, 0", "2, 3", "10, 10", "44, 34", "10, 30", "44, 40", "44, 50",
            "44, 80", "188, 200", "188, 400", "798, 1000",})
    public void should_Return_Correct_Number_For_SUM_Of_All_Fib_Number_With_Max_Value(long expected, long fibNumber) {
        euler2 = new Euler2();

        assertEquals(expected, euler2.returnFibSumForEvenNumbers(fibNumber));
    }

}