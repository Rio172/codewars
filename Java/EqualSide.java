import java.util.*;

public class EqualSide {


    public static void main(String[] args) {

        int arr[] = new int[]{1,2,3,4,3,2,1}; // declare and initialize an array with values.

        //find_even_index(arr);
        System.out.println(find_even_index(arr));
    }

    public static int find_even_index(int[] arr) {

        // 1,2,3,4,3,2,1
        for(int i = 0; i < arr.length; i++){

            int sumL = 0;
            int sumR = 0;

            for(int j = 0; j < i; j++){
                sumL += arr[j];
            }

            for(int x = i + 1; x < arr.length; x++){
                sumR += arr[x];
            }

            if( sumL == sumR){
                return i;
            }
        }
        return -1;
}
}
