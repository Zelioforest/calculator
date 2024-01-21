package pro.sky.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public String GreatingCalculator(){
        return "Welcome to Calculator";
    }

    public static String plus(int num1, int num2){
        int res = num1 + num2;
        return Integer.toString(num1) + " + " + Integer.toString(num2) + " = " + Integer.toString(res);
    }
}
