package com.e.calculator;

public class Calculator {
    private double num1;
    private double num2;
    private double res;
    private double memory;

    public Operation getOperation() {
        return operation;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    private Operation operation = Operation.plus;

    enum Operation {
        plus, minus, mult, divide;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public String getRes() {
        return String.valueOf(res);
    }

    public void setRes(double res) {
        this.res = res;
    }

    public double getMemory() {
        return memory;
    }

    public void setMemory(double memory) {
        this.memory = memory;
    }

    public void calculate() {
        switch (operation) {
            case plus:
                res = num1 + num2;
                break;
            case minus:
                res = num1 - num2;
                break;
            case mult:
                res = num1 * num2;
                break;
            case divide:
                res = num1 / num2;
                break;
        }
    }
}
