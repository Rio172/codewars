import java.util.*;

/**
 * HighLow
 */
public class HighLow {

    public static void main(String[] args) {

        //String num = "1 9 3 4 5";
        System.out.println(highAndLow("1 9 3 4 -5"));
    }

    public static String highAndLow(String num) {
        
        //convert a string to a String array using split method of String class. 
        String[] numArr = num.split(" "); 

        // temp int array created with a the fix size of numArr;
        int[] temp = new int[numArr.length];

        for(int i = 0; i < numArr.length; i++){ // comparing integer using the length property
            temp[i] = Integer.valueOf(numArr[i]);
        }
        Arrays.sort(temp); 

        int low = 0;
        int high = 0;

        low = temp[0];
        high = temp[temp.length -1];

        return low + "" + " " + high + "";
    }
}