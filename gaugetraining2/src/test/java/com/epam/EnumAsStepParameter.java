package com.epam;

import com.thoughtworks.gauge.Step;

public class EnumAsStepParameter {

    public enum Direction {
        NORTH, SOUTH, EAST, WEST;
    }

    @Step("Navigate towards <Direction>")
    public void navigateTO(Direction direction) {
        System.out.printf("Navigate toward %s\n", direction.toString());
    }
}
