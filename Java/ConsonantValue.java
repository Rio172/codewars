import java.util.ArrayList;
import java.util.*;

public class ConsonantValue {
    public static void main(String[] args) {

        String theWord = "zodiacs";
        System.out.println(solve(theWord));

    }

    public static int solve(final String s) {
       String vowels = "aeiou";
        int highestValue = 0;
        int currentValue = 0;

        // static method is called with the class name 

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            //System.out.println(c);
            if (vowels.indexOf(c) == -1) {
                currentValue += c - 'a' + 1;
                //System.out.println(currentValue);
                
            } else {
                if (currentValue > highestValue) {
                    highestValue = currentValue;
                }
                currentValue = 0;
            }
        }

        if (currentValue > highestValue) {
            highestValue = currentValue;
        }

        return highestValue;
    }
  
  }