package com.epam;

import com.thoughtworks.gauge.Step;
import com.thoughtworks.gauge.Table;

public class DataTable {

    @Step("Print out user names and roles <table>")
    public void stepWithInlineTable(Table table) {
        table.getTableRows().forEach(row -> {

            System.out.printf("User name: %s, role: %s \n",
                              row.getCell("userName"),
                              row.getCell("role"));
        });
        System.out.println("\n");
    }

}
