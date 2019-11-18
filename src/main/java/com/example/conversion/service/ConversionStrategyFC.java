package com.example.conversion.service;

public class ConversionStrategyFC implements ConversionStrategy {
    @Override
    public double convert(double amount) {
        return amount - ConversionUnit.KELVIN_TO_CELSIUS.getUnits();
    }
}
