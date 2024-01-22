package pro.sky.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public String GreatingCalculator(){
        return "Welcome to Calculator";
    }

    public static String ourStr(int n1, int n2, String znak, int res){
        return Integer.toString(n1) + znak + Integer.toString(n2) + " = " + Integer.toString(res);
    }

    public static String plus(int num1, int num2){
        int res = num1 + num2;
        return ourStr(num1, num2, " + ", res);
    }

    public static String minus(int num1, int num2){
        int res = num1 - num2;
        return ourStr(num1, num2, " - ", res);
    }

    public static String multiply(int num1, int num2){
        int res = num1 * num2;
        return ourStr(num1, num2, " * ", res);
    }

    public static String divide(int num1, int num2){
        int res = num1 / num2;
        return ourStr(num1, num2, " / ", res);
    }
}
