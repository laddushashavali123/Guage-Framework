package com.epam;

import com.thoughtworks.gauge.AfterScenario;
import com.thoughtworks.gauge.AfterSpec;
import com.thoughtworks.gauge.AfterStep;
import com.thoughtworks.gauge.AfterSuite;
import com.thoughtworks.gauge.BeforeScenario;
import com.thoughtworks.gauge.BeforeSpec;
import com.thoughtworks.gauge.BeforeStep;
import com.thoughtworks.gauge.BeforeSuite;
import com.thoughtworks.gauge.Operator;

import static com.epam.TextPrinter.Color;
import static com.epam.TextPrinter.printBorderedText;

public class ExecutionHooks {

    @BeforeSuite
    public void BeforeSuite() {
        printBorderedText("Suite started", "-", Color.RED);
        System.out.print("\n");
    }

    @AfterSuite
    public void AfterSuite() {
        printBorderedText("Suite ended", "-", Color.RED);
        System.out.print("\n");
    }

    @BeforeSpec(tags = { "group_1" })
    public void BeforeSpec() {
        printBorderedText("@BeforeSpec with group_1 tag", "&", Color.MAGENTA);
        System.out.print("\n");
    }

    @AfterSpec
    public void AfterSpec() {
        // Code for after spec
    }

    @BeforeScenario
    public void BeforeScenario() {

    }

    @AfterScenario
    public void AfterScenario() {

    }

    @BeforeStep
    public void BeforeStep() {

    }

    @BeforeStep(tags = { "group_2", "group_3" }, tagAggregation = Operator.AND)
    public void BeforeStep2() {
        printBorderedText("@BeforeStep with group_2 and group_3 tag", "#", Color.BRIGHT_YELLOW);
        System.out.print("\n");
    }

    @AfterStep
    public void AfterStep() {

    }

}
