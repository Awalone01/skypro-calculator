package pro.sky.skyprocalculator;

import org.springframework.web.bind.annotation.RequestParam;

public interface CalculatorService {
    int addition(int num1, int num2);
    int subtraction(int num1, int num2);
    int multiplication(int num1, int num2);
    double division(int num1, int num2);
}
