package com.codurance.ocp;

public class Engineer implements IEmployee {

    private final int salary;

    Engineer(int salary) {
        this.salary = salary;
    }

    public int payAmount() {
        return salary;
    }
}
