/**
 * BetweenTheExtremes
 */
import java.applet.*;
import java.util.Arrays;

public class BetweenTheExtremes {

    public static void main(String[] args) {
        int[] num = new int[]{23, 3, 19, 21, 16};

        System.out.println(betweenExtremes(num));

        Arrays.toString(args)
    }


    public static int betweenExtremes(int[] numbers) {
        Arrays.sort(numbers); // sorting the numbers array smallest to biggest;

        int small = numbers[0];
        int big = numbers[numbers.length-1];

        //return (big - small);
        return numbers[numbers.length-1] - numbers[0];
    }
}

