package pro.sky.skyprocalculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class Calculator {
    private CalculatorOperation calculatorOperation = new CalculatorOperation();
    @GetMapping()
    public String calculator() {
        return calculatorOperation.calculator();
    }
    @GetMapping(path = "/plus")
    public int addition(@RequestParam int num1, @RequestParam int num2) {
        return calculatorOperation.addition(num1, num2);
    }
    @GetMapping(path = "/minus")
    public int subtraction(@RequestParam int num1, @RequestParam int num2) {
        return calculatorOperation.subtraction(num1, num2);
    }
    @GetMapping(path = "/multiply")
    public int multiplication(@RequestParam int num1, @RequestParam int num2) {
        return calculatorOperation.multiplication(num1, num2);
    }
    @GetMapping(path = "/divide")
    public int division(@RequestParam int num1, @RequestParam int num2) {
        return calculatorOperation.division(num1, num2);
    }
}
