package com.yajava.sebastianselin.lia_uppgift.service;

import com.yajava.sebastianselin.lia_uppgift.model.OperationModel;

public interface CalculatorRoundingServiceInterface {
    public double ceiling(OperationModel model);
    public double floor(OperationModel model);
    public double round(OperationModel model);
}
