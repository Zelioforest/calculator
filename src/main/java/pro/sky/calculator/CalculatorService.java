package pro.sky.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public static String plus(int num1, int num2){
        return Integer.toString(num1 + num2);
    }

    public static String minus(int num1, int num2){
        return Integer.toString(num1 - num2);
    }

    public static String multiply(int num1, int num2){
        return Integer.toString(num1 * num2);
    }

    public static String divide(int num1, int num2){
        return Integer.toString(num1 / num2);
    }
}
