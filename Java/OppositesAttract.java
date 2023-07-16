import java.util.*;

public class OppositesAttract {
    public static void main(String[] args) {

        int num1 = (int)(Math.random() * 10);

        int num2 = (int)(Math.random() * 10);




        System.out.println(isLove(num1, num2));
        
    }

    public static boolean isLove(final int flower1, final int flower2) {



        if(flower1 % 2 == 0 && flower2 % 2 == 1 ){
            return true;
        }
        if(flower1 % 2 == 1 && flower2 % 2 == 0){
            return true;
        }else{
            return false;
        }

    }
}
