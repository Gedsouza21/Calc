package com.example.Calc;

import org.springframework.stereotype.Service;

@Service
public class CalculadoraService {
	
	 public double add(double num1, double num2) {
	     return num1 + num2;
	 }

	 public double subtract(double num1, double num2) {
	     return num1 - num2;
	 }

	 public double multiply(double num1, double num2) {
	     return num1 * num2;
	 }

	 public double divide(double num1, double num2) {
	     if (num2 != 0) {
	         return num1 / num2;
	     } else {
	         throw new ArithmeticException("Cannot divide by zero");
	     }
	 }
}
