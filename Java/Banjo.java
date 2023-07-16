import java.util.Scanner;

/**
 * Banjo
 */
public class Banjo {



    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Are you playing with banjo? ");

        String name = myObj.nextLine();  // Read user input
        
        System.out.println(areYouPlayingBanjo(name));
    }

    public static String areYouPlayingBanjo(String name) {

       if(name.charAt(0) == 'r' || name.charAt(0) == 'R' ){
        return String.format("%s plays banjo", name);
       }
       else{
        return String.format("%s does not play banjo", name);
       }
    // Program me!
  }
}