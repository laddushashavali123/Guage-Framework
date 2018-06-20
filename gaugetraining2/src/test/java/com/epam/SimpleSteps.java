package com.epam;

import com.thoughtworks.gauge.Gauge;
import com.thoughtworks.gauge.Step;

public class SimpleSteps {

    @Step("This step should print Hello World!")
    public void simpleStep() {
        String helloWorld = "Hello World!\n";
        System.out.println(helloWorld);
        Gauge.writeMessage(helloWorld);
    }

}
