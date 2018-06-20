package com.epam;

import com.thoughtworks.gauge.BeforeScenario;
import com.thoughtworks.gauge.Step;
import com.thoughtworks.gauge.datastore.DataStore;
import com.thoughtworks.gauge.datastore.DataStoreFactory;

import static org.assertj.core.api.Assertions.assertThat;

public class DataStoreSteps {

    private Calculator calculator;
    private DataStore scenarioStore = DataStoreFactory.getScenarioDataStore();
    private static final String RESULT = "result";

    @BeforeScenario
    public void createCalculator() {
        this.calculator = new Calculator();
    }

    @Step("The user adds <num1> to <num2>")
    public void addTwoNumbers(Double num1, Double num2) {
        scenarioStore.put(RESULT, calculator.add(num1, num2));
    }

    @Step("The user subtract <num1> from <num2>")
    public void subtractTwoNumbers(Double num1, Double num2) {
        scenarioStore.put(RESULT, calculator.subtract(num1, num2));
    }

    @Step("The user multiply <num1> by <num2>")
    public void multiplyTwoNumbers(Double num1, Double num2) {
        scenarioStore.put(RESULT, calculator.multiply(num1, num2));
    }

    @Step("The user divide <num1> by <num2>")
    public void divideTwoNumbers(Double num1, Double num2) {
        scenarioStore.put(RESULT, calculator.divide(num1, num2));
    }

    @Step("The result should be equal to <number>")
    public void verifyResult(Double number) {
        Double result = (Double) scenarioStore.get(RESULT);
        assertThat(result).as("check if the result is %f", result).isEqualTo(number);
    }

}
