package com.epam;

import com.thoughtworks.gauge.Gauge;
import com.thoughtworks.gauge.Step;

public class StepAlias {

    @Step({ "This step should print <textToPrint>", "This step is a <textToPrint>" })
    public void stepAlias(String textToPrint) {
        TextPrinter.printText(textToPrint);
        System.out.print("\n");
        Gauge.writeMessage(textToPrint);
    }

}
