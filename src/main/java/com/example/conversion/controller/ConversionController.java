package com.example.conversion.controller;


import com.example.conversion.service.ConversionService;
import com.example.conversion.service.ConversionUnit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConversionController {

    @Autowired
    private ConversionService conversionService;

    @GetMapping("/milestokm/{amount}")
    public String getGetKilometers(@PathVariable double amount){

        return String.format("%.4f", conversionService.convert(amount, ConversionUnit.MILES_TO_KILOMETERS));
    }

    @GetMapping("/kelvintocelsius/{amount}")
    public String getGetCelsius( @PathVariable double amount){

        return String.format("%.4f", conversionService.convert(amount, ConversionUnit.KELVIN_TO_CELSIUS));
    }

    @GetMapping("/poundstokg/{amount}")
    public String getGetKgFromPounds( @PathVariable double amount){

        return String.format("%.4f", conversionService.convert(amount, ConversionUnit.POUNDS_TO_KILOGRAMS));
    }

}
