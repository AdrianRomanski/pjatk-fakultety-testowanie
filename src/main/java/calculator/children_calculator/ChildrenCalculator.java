package calculator.children_calculator;

import calculator.children_calculator.calculator.BasicCalculator;
import calculator.operations.integer_operations.Add;
import calculator.operations.integer_operations.Divide;
import calculator.operations.integer_operations.Multiply;
import calculator.operations.integer_operations.Subtract;

public class ChildrenCalculator implements BasicCalculator<Integer> {

    Add add = new Add();
    Subtract subtract = new Subtract();
    Multiply multiply = new Multiply();
    Divide divide = new Divide();

    @Override
    public Integer add(Integer first, Integer second) {
        return add.calculate(first, second);
    }

    @Override
    public Integer subtract(Integer first, Integer second) {
        return subtract.calculate(first, second);
    }

    @Override
    public Integer multiply(Integer first, Integer second) {
        return multiply.calculate(first, second);
    }

    @Override
    public Integer divide(Integer first, Integer second) {
        return divide.calculate(first, second);
    }
}
