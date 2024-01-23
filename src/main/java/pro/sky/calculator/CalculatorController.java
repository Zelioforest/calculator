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
    public String greatingCalculator(){
       return "Welcome to Calculator";
    }

//    public String ourStr(int n1, int n2, String znak, int res){
//        return Integer.toString(n1) + znak + Integer.toString(n2) + " = " + Integer.toString(res);
//    }

    @GetMapping("/plus")
    public String calculatorPlus(@RequestParam(value = "num1", required = false) int num1, @RequestParam(value = "num2", required = false) int num2){
        return Integer.toString(num1) + " + " + Integer.toString(num2) + " = " + CalculatorService.plus(num1, num2);
    }

    @GetMapping("/minus")
    public String calculatorMinus(@RequestParam("num1") int num1, @RequestParam("num2") int num2){
        return Integer.toString(num1) + " - " + Integer.toString(num2) + " = " + CalculatorService.minus(num1, num2);
    }
    @GetMapping("/multiply")
    public String calculatorMultiply(@RequestParam("num1") int num1, @RequestParam("num2") int num2){
        return Integer.toString(num1) + " * " + Integer.toString(num2) + " = " + CalculatorService.multiply(num1, num2);
    }
    @GetMapping("/divide")
    public String calculatorDivide(@RequestParam("num1") int num1, @RequestParam("num2") int num2){
        return Integer.toString(num1) + " / " + Integer.toString(num2) + " = " + CalculatorService.divide(num1, num2);
    }
}
