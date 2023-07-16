import java.util.*;

/**
 * ConsecutiveStrings
 */
public class ConsecutiveStrings {
    public static void main(String[] args) {

        //String[] strarr = new String[]{"tree", "foling", "trashy", "blue", "abcdef", "uvwxyz"};

        String[] strarr = new String[]{"wlwsasphmxx","owiaxujylentrklctozmymu","wpgozvxxiu"};

        int k = 2;

        System.out.println(longestConsec(strarr,k));
        
    }
    public static String longestConsec(String[] strarr, int k) {
         if (strarr.length == 0 || k > strarr.length || k <= 0) {
            return "";
        }
        int HighSize = 0;
        String start = "";
        String longest = "";

        //{"zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"};
        // "wlwsasphmxx","owiaxujylentrklctozmymu","wpgozvxxiu"
        for(int j = 0; j < k; j++){
            start += strarr[j];
        }

        longest = start;
        HighSize = start.length();

        // "wlwsasphmxx","owiaxujylentrklctozmymu","wpgozvxxiu"
        for(int i = 1; i < strarr.length - (k-1); i++){  //offset  outer loop makes sure it does not go out of bounds 
            String temp = "";
            for(int j = i; j < (i + k); j++){
                temp += strarr[j];
            }
            //System.out.println(temp);

            temp.length();
            //System.out.println(temp.length() + "  " + HighSize);
            if (temp.length() >  HighSize){
                HighSize = temp.length();
                longest  = (temp);
            }
    }
    return longest;
}
}





