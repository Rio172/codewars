import java.util.*;

public class Solution {
    public static void main(String[] args) {
        int pere1 = 6;
        int pere2 = 10;
      
        int square1 = 3;
        int square2 = 3;

        System.out.println(areaOrPerimeter(pere1,pere2)); 
        System.out.println(areaOrPerimeter(square1,square2));
    }

    public static int areaOrPerimeter(int l, int w) {
        // code away...
        int square = 0;

        int dos = 2;

        if(l==w){
            return square = (int)Math.pow(l, dos);
        }else{
            return dos * (l + w);
        }


    }
}
