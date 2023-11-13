package com.example.Calc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculadoraController {
	 @Autowired
	    private CalculadoraService calculadoraService;
     
	 @GetMapping("/add")
	    public double add(@RequestParam double num1, @RequestParam double num2) {
	        return calculadoraService.add(num1, num2);
	    }

	    @GetMapping("/subtract")
	    public double subtract(@RequestParam double num1, @RequestParam double num2) {
	        return calculadoraService.subtract(num1, num2);
	    }

	    @GetMapping("/multiply")
	    public double multiply(@RequestParam double num1, @RequestParam double num2) {
	        return calculadoraService.multiply(num1, num2);
	    }
	    
	    @GetMapping("/divide")
	    public double divide(@RequestParam double num1, @RequestParam double num2) {
	        return calculadoraService.divide(num1, num2);
	    }
}