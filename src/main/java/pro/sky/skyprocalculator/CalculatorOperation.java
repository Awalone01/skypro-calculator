package pro.sky.skyprocalculator;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class CalculatorOperation implements CalculatorService {

    @Override
    public int addition(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return num1 + num2;
    }

    @Override
    public int subtraction(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return num1 - num2;
    }

    @Override
    public int multiplication(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return num1 * num2;
    }

    @Override
    public double division(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException1();
        }
        return (double) num1 / num2;
    }
}