package com.yajava.sebastianselin.lia_uppgift.service;

import com.yajava.sebastianselin.lia_uppgift.model.OperationModel;
import org.springframework.stereotype.Service;

@Service
public class CalculatorRoundingService implements CalculatorRoundingServiceInterface{

    @Override
    public double ceiling(OperationModel model) {
        return Math.ceil(model.getNumOne());
    }

    @Override
    public double floor(OperationModel model) {
        return Math.floor(model.getNumOne());
    }

    @Override
    public double round(OperationModel model) {
        return Math.round(model.getNumOne());
    }
}
