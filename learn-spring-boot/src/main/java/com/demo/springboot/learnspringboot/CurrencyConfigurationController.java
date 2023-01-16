package com.demo.springboot.learnspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyConfigurationController {

    @Autowired
    CurrencyServiceConfiguration currencyServiceConfiguration;

    @RequestMapping("/currency-service")
    public CurrencyServiceConfiguration retrieveAllCurrency() {
        return currencyServiceConfiguration;
    }
}
