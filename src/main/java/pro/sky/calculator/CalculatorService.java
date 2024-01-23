package pro.sky.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public static String plus(Integer num1, Integer num2){
        return Integer.toString(num1 + num2);
    }

    public static String minus(Integer num1, Integer num2){
        return Integer.toString(num1 - num2);
    }

    public static String multiply(Integer num1, Integer num2){
        return Integer.toString(num1 * num2);
    }

    public static String divide(Integer num1, Integer num2){
        return Integer.toString(num1 / num2);
    }
}
