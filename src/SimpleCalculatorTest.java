import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class SimpleCalculatorTest {
    @Parameter()
    public int m1;
    @Parameter(1)
    public int m2;
    @Parameter(2)
    public int result;
    SimpleCalculator calculator;

    @Parameters
    public static Collection<Object> data() {
        Object[][] data = new Object[][]{{1, 1, 2}, {2, 2, 4}, {4, 4, 8}};
        return Arrays.asList(data);
    }

    //    @Parameters
//    public static Collection<Object> multiply() {
//        Object[][] multiply = new Object[][]{{1,1,1},{4,4,16},{7,7,49}};
//        return Arrays.asList(multiply);
//
//    }
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        calculator = new SimpleCalculator();
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @Test
    @Parameters(name = "data")
    @DisplayName("Sum Test")
    public void testSum() {
        System.err.println(m1 + " + " + m2 + " = " + result);
        setUp();
        assertEquals("Result", result, calculator.add(m1, m2));
    }

//    @org.junit.jupiter.api.Test
//    @Parameters(name = "multiply")
//    @DisplayName("Multiply Test")
//    void testMultiply() {
//        assertEquals(result,calculator.multiply(m1,m2));
//    }
//
//    @org.junit.jupiter.api.Test
//    @Parameters(name = "divide")
//    @DisplayName("Divide Test")
//    void testDivine() {
//        assertEquals(result,calculator.divine(m1,m2));
//    }
//    public class SimpleCalculator2 {
//        public int add(int i, int j){
//            return i+j;
//        }
}
