package com.yajava.sebastianselin.lia_uppgift.controller;


import com.yajava.sebastianselin.lia_uppgift.model.OperationModel;
import com.yajava.sebastianselin.lia_uppgift.service.CalculatorRoundingService;
import org.springframework.beans.factory.annotation.Autowired;
import com.yajava.sebastianselin.lia_uppgift.service.CalculatorService;
import org.springframework.web.bind.annotation.*;



@RestController
public class CalculatorController {

    @Autowired
    private CalculatorService calculatorService;

    @Autowired
    private CalculatorRoundingService calRoundService;



    @RequestMapping("/add")
    public double add(@RequestBody OperationModel model) {
        return calculatorService.add(model);
    }
    @RequestMapping("/subtract")
    public double subtract(@RequestBody OperationModel model) {
        return calculatorService.subtract(model);
    }
    @RequestMapping("/divide")
    public double divide(@RequestBody OperationModel model) {
        return calculatorService.divide(model);
    }
    @RequestMapping("/multiply")
    public double multiply(@RequestBody OperationModel model) {
        return calculatorService.multiply(model);
    }

    @RequestMapping("/div")
    public double div(@RequestBody OperationModel model) {
        return calculatorService.div(model);
    }

    @RequestMapping("/mod")
    public double mod(@RequestBody OperationModel model) {
        return calculatorService.mod(model);
    }
    @RequestMapping("/max")
    public double max(@RequestBody OperationModel model) {
        return calculatorService.max(model);
    }
    @RequestMapping("/min")
    public double min(@RequestBody OperationModel model) {
        return calculatorService.min(model);
    }
    @RequestMapping("/ceiling")
    public double ceiling(@RequestBody OperationModel model) {
        return calRoundService.ceiling(model);
    }
    @RequestMapping("/floor")
    public double floor(@RequestBody OperationModel model) {
        return calRoundService.floor(model);
    }
    @RequestMapping("/round")
    public double round(@RequestBody OperationModel model) {
        return calRoundService.round(model);
    }

}
