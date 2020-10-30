package calculator.children_calculator;

import calculator.operations.integer_operations.Add;
import calculator.operations.integer_operations.Divide;
import calculator.operations.integer_operations.Multiply;
import calculator.operations.integer_operations.Subtract;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class ChildrenCalculatorTest {

    public static final int RESULT_ADD = 12;
    public static final int RESULT_MULTIPLY = 20;
    public static final int RESULT_SUBTRACT = 8;
    public static final int RESULT_DIVIDE = 5;

    @Mock
    Add add;

    @Mock
    Subtract subtract;

    @Mock
    Multiply multiply;

    @Mock
    Divide divide;

    @InjectMocks
    ChildrenCalculator childrenCalculator;

    public static final Integer FIRST = 10;
    public static final Integer SECOND = 2;


    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    @DisplayName("Should return sum of two integer")
    void add() {
        //when
        when(add.calculate(FIRST, SECOND)).thenReturn(RESULT_ADD);

        //then
        Integer returnInt = childrenCalculator.add(FIRST, SECOND);

        assertEquals(returnInt, RESULT_ADD);
    }

    @Test
    @DisplayName("Should return result of subtraction")
    void subtract() {
        //when
        when(subtract.calculate(FIRST, SECOND)).thenReturn(RESULT_SUBTRACT);

        //then
        Integer returnInt = childrenCalculator.subtract(FIRST, SECOND);

        assertEquals(returnInt, RESULT_SUBTRACT);
    }

    @Test
    @DisplayName("Should return result of multiply")
    void multiply() {
        //when
        when(multiply.calculate(FIRST, SECOND)).thenReturn(RESULT_MULTIPLY);

        //then
        Integer returnInt = childrenCalculator.multiply(FIRST, SECOND);

        assertEquals(returnInt, RESULT_MULTIPLY);
    }

    @Test
    @DisplayName("Should return result of divide")
    void divide() {
        //when
        when(divide.calculate(FIRST, SECOND)).thenReturn(RESULT_DIVIDE);

        //then

        Integer returnInt = childrenCalculator.divide(FIRST, SECOND);

        assertEquals(returnInt, RESULT_DIVIDE);
    }
}