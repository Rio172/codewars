public class temp {

    public static void main(String[] args) {

        int test1 = 70;
        int test2 = 90;
        int test3 = 83;

        System.out.println(getGrade(test1, test2, test3));

    }


    public static char getGrade(int s1, int s2, int s3) {

        int score = (s1 + s2 + s3) / 3;

        if(score >=90 && score <=100){
            return 'A';
        }
        if(score >=80 && score < 90){
            return 'B';
        }
        if(score >=70 && score < 80){
            return 'C';
        }
        if(score >=60 && score < 70){
            return 'D';
        }
        
        return 'F';
    }

}