package calculator;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Calculator {
    private final Map<String, Operation> operationMap;

    public Calculator(List<Operation> allOperation) {
        operationMap = allOperation.stream()
                .collect(Collectors.toMap(Operation::key, Function.identity()));
    }

    public double calculate(double a, double b, String operationKey)throws UnsupportedOperationException{
        Operation operation = operationMap.get(operationKey);
        if (operation != null) {
            return operation.calculate(a, b);
        }
        throw new UnsupportedOperationException();
    }
}
