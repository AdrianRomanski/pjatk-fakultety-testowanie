package calculator.operations;

public interface Operation<T> {

    T calculate(T first, T second);

    String getOperationName();

}
