package calculator.operations.integer_operations;

import calculator.operations.Operation;

public class Subtract implements Operation<Integer> {

    @Override
    public Integer calculate(Integer first, Integer second) {
        return first - second;
    }

    @Override
    public String getOperationName() {
        return Subtract.class.getSimpleName();
    }
}
