package com.yajava.sebastianselin.lia_uppgift.service;

import com.yajava.sebastianselin.lia_uppgift.model.OperationModel;

public interface CalculatorServiceInterface {
    public double add(OperationModel model);
    public double subtract(OperationModel model);
    public double divide(OperationModel model);
    public double multiply(OperationModel model);
    public double div(OperationModel model);
    public double mod(OperationModel model);
    public double max(OperationModel model);
    public double min(OperationModel model);
}
