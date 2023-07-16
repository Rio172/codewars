import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * EqualSideArr
 */
public class EqualSideArr {

    public static void main(String[] args) {

        int arr[] = new int[]{1,2,3,4,3,2,1}; // declare and initialize an array with values.

        //find_even_index(arr);
        System.out.println(find_even_index(arr));

    }

    // [1,2,3,4,3,2,1]
    public static int find_even_index(int[] arr) {

        for(int i = 0; i < arr.length; i++){
            int sumL = 0;
            int sumR = 0;

            for(int j =0;  j < i; j++){
                sumL += arr[j];
            }

            for(int x =i+1;  x < arr.length; x++){
                sumR += arr[x];
            }

            if(sumL == sumR){
                return i;
            }
        }
        return -1;
    }
}

     //int sum = 0;

        /* 
        for(int i = 1; i < arr.length; i++){
            sum += arr[i];
        }
        if (sum == 0){
            return 0;
        }
        */
        
        // 1,2,3,4,3,2,1
