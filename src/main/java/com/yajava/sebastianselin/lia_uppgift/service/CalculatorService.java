package com.yajava.sebastianselin.lia_uppgift.service;
import com.yajava.sebastianselin.lia_uppgift.model.OperationModel;
import org.springframework.stereotype.Service;


@Service
public class CalculatorService implements CalculatorServiceInterface {


    @Override
    public double add(OperationModel model) {
        return model.getNumOne() + model.getNumTwo();
    }

    @Override
    public double subtract(OperationModel model) {
        return model.getNumOne() - model.getNumTwo();
    }

    @Override
    public double divide(OperationModel model) {
        return model.getNumOne() / model.getNumTwo();
    }

    @Override
    public double multiply(OperationModel model) {
        return model.getNumOne() * model.getNumTwo();
    }

    @Override
    public double div(OperationModel model) {
        return model.getNumOne() / model.getNumTwo();
    }

    @Override
    public double mod(OperationModel model) {
        return model.getNumOne() % model.getNumTwo();
    }

    @Override
    public double max(OperationModel model) {
        return Math.max(model.getNumOne(), model.getNumTwo());
    }

    @Override
    public double min(OperationModel model) {
        return Math.min(model.getNumOne(), model.getNumTwo());
    }
}
