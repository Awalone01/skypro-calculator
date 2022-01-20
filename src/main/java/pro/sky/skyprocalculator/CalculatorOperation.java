package pro.sky.skyprocalculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class CalculatorOperation {
    public String calculator() {
        return "Добро пожаловать в калькулятор";
    }
    public int addition(@RequestParam int num1, @RequestParam int num2) {
        return num1 + num2;
    }
    public int subtraction(@RequestParam int num1, @RequestParam int num2) {
        return num1 - num2;
    }
    public int multiplication(@RequestParam int num1, @RequestParam int num2) {
        return num1 * num2;
    }
    public int division(@RequestParam int num1, @RequestParam int num2) {
        if (num2 == 0) {
            return null1();
        }
        return num1 / num2;
    }
    public String null1 () {
        return "на ноль делить нельзя!";
    }


}
