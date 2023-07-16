import java.util.*;

public class DotCalculator {

    public static void main(String[] args) {
        
        String num1 = "..... + ...............";
        String num2 = "..... - ...";
        String num3 = "..... * ...";
        String num4 = "..... // ..";

        System.out.println(Calc(num1));
        System.out.println(Calc(num2));
        System.out.println(Calc(num3));
        System.out.println(Calc(num4));
    }

    public static String Calc(String numero1) {

        String[] dataNum = numero1.split(" ");

        int one = 0;
        int two = 0;
        String operator = "";
        int result = 0;
        String dot = "";

        for(int i = 0; i < dataNum[0].length(); i++){
            one++;
        }

        for(int i = 0; i < dataNum[2].length(); i++){
            two++;
        }

        //int[] operatorArr = new int[]{};

        switch(dataNum[1]){
            case "+":
                result = one + two;
                break;
            case "-":
                result = one - two;
                break;
            case "*":
                result = one * two;
                break;
            case "//":
                result = one / two;
                break;
        }

        for(int i = 0; i < result; i++){
            dot+=".";
        }
        return dot;
    }

}

/*
class Solution {
  public static String calc(String txt){
    
      String[] problem_list = txt.split(" ");
        int op1 = problem_list[0].length();
        int op2 = problem_list[2].length();
        String operator = problem_list[1];

        int answer=0;

        switch(operator) {

            case "+":
            answer = op1 + op2;
            break;
            case "-":
            answer = op1 - op2;
            break;
            case "*":
            answer = op1*op2;
            break;
            case "//":
            answer = op1 / op2;
            break;

        }

        String dots = "";

        for(int i = 0; i  < answer;i++) {

            dots+=".";
        }

        return dots;
      }
  }
 */