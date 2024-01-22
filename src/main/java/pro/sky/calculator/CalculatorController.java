package pro.sky.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService){
        this.calculatorService = calculatorService;
    }

    @GetMapping()
    public String GreatingCalculator(){
        return calculatorService.GreatingCalculator();
    }

    @GetMapping("/plus")
    public String CalculatorPlus(@RequestParam("num1") int num1, @RequestParam("num2") int num2){
        return CalculatorService.plus(num1, num2);
    }

    @GetMapping("/minus")
    public String CalculatorMinus(@RequestParam("num1") int num1, @RequestParam("num2") int num2){
        return CalculatorService.minus(num1, num2);
    }
    @GetMapping("/multiply")
    public String CalculatorMultiply(@RequestParam("num1") int num1, @RequestParam("num2") int num2){
        return CalculatorService.multiply(num1, num2);
    }
    @GetMapping("/divide")
    public String CalculatorDivide(@RequestParam("num1") int num1, @RequestParam("num2") int num2){
        return CalculatorService.divide(num1, num2);
    }
}
