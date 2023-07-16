public class Kata1 {

    public static void main(String[] args) {

        System.out.println(quarterOf(7));
 
    }

    public static int quarterOf(int month) {
        // Your code here


        switch(month){

            case 1:
            case 2:
            case 3:
                return (1);
                //break;
            case 4:
            case 5:
            case 6:
                return (2);
                //break;
            case 7:
            case 8:
            case 9:
                return (3);
            case 10:
            case 11:
            case 12:
                return (4);
            default:
                System.out.println("Enter a value between 1 - 12");
                return (0);
        }

    }

}