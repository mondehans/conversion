package com.example.conversion.service;

public class ConversionStrategyMilesKilom implements ConversionStrategy {
    @Override
    public double convert(double amount) {
        return amount * ConversionUnit.MILES_TO_KILOMETERS.getUnits();
    }
}
