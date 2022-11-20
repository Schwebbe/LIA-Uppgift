package com.yajava.sebastianselin.lia_uppgift.model;

public class OperationModel {
    private double numOne;
    private double numTwo;
    private double sum;

    public OperationModel(double numOne, double numTwo, double sum) {
        this.numOne = numOne;
        this.numTwo = numTwo;
        this.sum = sum;
    }

    public double getNumOne() {
        return numOne;
    }

    public void setNumOne(double numOne) {
        this.numOne = numOne;
    }

    public double getNumTwo() {
        return numTwo;
    }

    public void setNumTwo(double numTwo) {
        this.numTwo = numTwo;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }
}
