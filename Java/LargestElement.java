import java.util.*;

public class LargestElement{
    public static void main(String[] args) {
        System.out.print(Arrays.toString((Largest(3, new int[] {7,6,5,4,3,2,1}))));
        
    }

    public static int[] Largest(int number, int[] numList){

        Arrays.sort(numList);
        int[] temp = new int[number];

        int j = 0;
        
        int start = numList.length - number;

        while(j < number) {

            temp[j] = numList[start];

            start++;
            j++;
        }

    return temp;
        
    }

}
