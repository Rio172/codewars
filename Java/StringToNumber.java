import java.util.*;

public class StringToNumber {
    public static void main(String[] args) {

        String str1 = "1234";

        System.out.println(stringToNumber(str1));
        
    }
    public static int stringToNumber(String str) {
        //TODO: Convert str into a number

        int convert = Integer.parseInt(str);


        return convert;

      }
}
