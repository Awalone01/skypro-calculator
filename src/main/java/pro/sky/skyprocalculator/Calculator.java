package pro.sky.skyprocalculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class Calculator {
    private final CalculatorService calculatorService;

    public Calculator(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping()
    public String calculator() {
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping(path = "/plus")
    public String addition(@RequestParam(name = "num1", required = false) Integer num1,
                           @RequestParam(value = "num2", required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            return "Введите значение";
        }
        return num1 + "+" + num2 + "= " + calculatorService.addition(num1, num2);
    }

    @GetMapping(path = "/minus")
    public String subtraction(@RequestParam(name = "num1", required = false) Integer num1,
                              @RequestParam(value = "num2", required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            return "Введите значение";
        }
        return num1 + "-" + num2 + "= " + calculatorService.subtraction(num1, num2);
    }

    @GetMapping(path = "/multiply")
    public String multiplication(@RequestParam(name = "num1", required = false) Integer num1,
                                 @RequestParam(value = "num2", required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            return "Введите значение";
        }
        return num1 + "*" + num2 + "= " + calculatorService.multiplication(num1, num2);
    }

    @GetMapping(path = "/divide")
    public String division(@RequestParam(name = "num1", required = false) Integer num1,
                           @RequestParam(value = "num2", required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            return "Введите значение";
        }   if (num2 == 0) {
            return "Деление на 0 запрещено.";
        }
//        else if (num1 == Integer.parseInt(null) || num2 == Integer.parseInt(null) ) {
//            return "Введите значение";
//        }
        return num1 + "/" + num2 + "= " + calculatorService.division(num1, num2);
    }
}