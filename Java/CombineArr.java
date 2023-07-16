import java.util.*;

public class CombineArr {

    public static void main(String[] args) {

        int[] arrOg1 = new int[]{15, 99, 23};

        int[] arrOg2 = new int[]{24, 12, 25};


        System.out.println(Arrays.toString(ArrayReturn(arrOg1, arrOg2)));

        System.out.println(Arrays.toString(twoArrays(arrOg1, arrOg2)));

    }

    // 2 array as arrguments combone the 2 arr into 1 "int array" and retrun the array as 1 array. The other needs to stay oringal.  
    public static int[] ArrayReturn(int[] arr1, int[] arr2) {

        int[] temp = new int[arr1.length + arr2.length];

        for(int i = 0; i <= arr1.length -1; i++){
            temp[i] = arr1[i];

            if(i == arr1.length -1){ 
                for(int j = 0; j < arr2.length; j++ ){  
                    temp[arr1.length + j] = arr2[j]; // offset
                }

            }

        }
        return temp;

    }

    static int[] twoArrays(int[] first, int[] second) {

        // given two integer arrays, combine into one maintaining sequence 

        int[] third = new int[first.length + second.length];

        int i = 0;

        while(i < third.length) {

            if(i < first.length) {

                third[i] = first[i]; 

            }
            else {

                third[i] = second[ i - first.length ];

            }
            i++;

        }
        
        return third;

    }
    
}






