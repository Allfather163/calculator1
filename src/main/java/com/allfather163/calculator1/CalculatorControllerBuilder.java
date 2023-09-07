package com.allfather163.calculator1;

public class CalculatorControllerBuilder {
    private CalculatorService calculatorService;

    public CalculatorControllerBuilder setCalculatorService(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
        return this;
    }

    public CalculatorController createCalculatorController() {
        return new CalculatorController();
    }
}