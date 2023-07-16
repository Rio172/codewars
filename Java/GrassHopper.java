import java.util.*;

public class GrassHopper {
    public static void main(String[] args) {
        int test1 = -100000;
        int test2 = 90;
        int test3 = 83;

        System.out.println(getGrade(test1, test2, test3));
    }
    public static char getGrade(int s1, int s2, int s3) {
         int score = (s1 + s2 + s3) / 3;
        char A = 'A';
        char B = 'B';
        char C = 'C';
        char D = 'D';
        char F = 'F';

        if(score >=90 && score <=100){
            return A;
        }
        else if(score >=80 && score < 90){
            return B;
        }
        else if(score >=70 && score < 80){
            return C;
        }
        else if(score >=60 && score < 70){
            return D;
        }else{
            return F;
        }

        //return 'x';

    }

}

