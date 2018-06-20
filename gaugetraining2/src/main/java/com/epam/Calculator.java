package com.epam;

public class Calculator {

    public Calculator() {
    }

    public Double add(Double d1, Double d2) {
        return d1 + d2;
    }

    public Double subtract(Double d1, Double d2) {
        return d1 - d2;
    }

    public Double multiply(Double d1, Double d2) {
        return d1 * d2;
    }

    public Double divide(Double d1, Double d2) throws ArithmeticException {
        if (d2 == 0) {
            throw new ArithmeticException("Division by 0");
        } else {
            return d1 / d2;
        }
    }

}
