package com.epam;

import com.thoughtworks.gauge.Step;
import org.assertj.core.api.Assertions;

public class Environment {

    @Step("Environment should be <envName>")
    public void checkEnvironment(String envName) {
        Assertions.assertThat(System.getenv("environment"))
                  .as("Environment is not correct").isEqualTo(envName);
    }
}
