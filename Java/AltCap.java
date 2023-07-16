import java.util.*;

/**
 * AltCap
 */
public class AltCap {

    public static void main(String[] args) {
        
        String letter1 = "abcdef";

    System.out.println(Arrays.toString(Alternate(letter1)));

    }
    public static String[] Alternate(String word) {
        
        char[] charArr = word.toCharArray();

        char[] tempEven = new char[charArr.length];

        char[] tempOdd = new char[charArr.length];

        for(int i = 0; i < charArr.length; i++ ){

            if (i%2 == 0) {
                tempEven[i] = Character.toUpperCase(charArr[i]);
                tempOdd[i] = charArr[i];
            }
            else{
                tempOdd[i] = Character.toUpperCase(charArr[i]);
                tempEven[i] = charArr[i];
            }
        }

        String[] final2 = new String[]{new String(tempEven), new String(tempOdd)};

        return final2;
    }

}