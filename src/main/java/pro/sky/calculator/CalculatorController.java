package pro.sky.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService){
        this.calculatorService = calculatorService;
    }

    @GetMapping(path = "/calculator")
    public String GreatingCalculator(){
        return calculatorService.GreatingCalculator();
    }

    @GetMapping(path = "/calculator/plus")
    public String Calculatorsum(@RequestParam("num1") int num1, @RequestParam("num2") int num2){
        return CalculatorService.plus(num1, num2);
    }
}
