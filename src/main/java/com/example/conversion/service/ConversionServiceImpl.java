package com.example.conversion.service;


import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class ConversionServiceImpl implements ConversionService {



    @Override
    public double convert(double amount, ConversionUnit units) {
        return strategies.get(units).convert(amount);
    }


    private final static Map<ConversionUnit, ConversionStrategy>  strategies= new HashMap< >();

    static {
        strategies.put(ConversionUnit.KELVIN_TO_CELSIUS,new ConversionStrategyFC());
        strategies.put(ConversionUnit.POUNDS_TO_KILOGRAMS, new ConversionStrategyKiloPound());
        strategies.put(ConversionUnit.MILES_TO_KILOMETERS, new ConversionStrategyMilesKilom());
    }
}
