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

    public String checkData(Integer n1, Integer n2, String znak){
        if (n1 == null || n2 == null){
            return ("Incorrect data");
        } else {
            return n1 + znak + n2 + " = ";
        }
    }

    @GetMapping("/plus")
    public String calculatorPlus(@RequestParam(value = "num1", required = false) Integer num1,
                                 @RequestParam(value = "num2", required = false) Integer num2){
        return checkData(num1, num2, " + ") + CalculatorService.plus(num1, num2);
    }

    @GetMapping("/minus")
    public String calculatorMinus(@RequestParam(value = "num1", required = false) Integer num1,
                                  @RequestParam(value = "num2", required = false) Integer num2){
            return checkData(num1, num2, " - ") + CalculatorService.minus(num1, num2);
    }
    @GetMapping("/multiply")
    public String calculatorMultiply(@RequestParam(value = "num1", required = false) Integer num1,
                                     @RequestParam(value = "num2", required = false) Integer num2){
            return checkData(num1, num2, " * ") + CalculatorService.multiply(num1, num2);
    }
    @GetMapping("/divide")
    public String calculatorDivide(@RequestParam(value = "num1", required = false) Integer num1,
                                   @RequestParam(value = "num2", required = false) Integer num2){
        if (num2 == 0){
            return ("You cannot divide by 0");
        } else {
            return checkData(num1, num2, " / ") + CalculatorService.divide(num1, num2);
        }
    }
}
