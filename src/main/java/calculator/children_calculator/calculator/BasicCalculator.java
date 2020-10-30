package calculator.children_calculator.calculator;

public interface BasicCalculator<T> {

    T add(T first, T second);

    T subtract(T first, T second);

    T multiply(T first, T second);

    T divide(T first, T second);

}
