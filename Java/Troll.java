
/**
 * Troll
 */
public class Troll {

    public static void main(String[] args) {

        String word = "This website is for losers LOL!";

        System.out.println(disemvowel(word));
        
    }

    public static String disemvowel(String str) {
        // Code away...

        String temp = "";
      
      for(int i = 0; i < str.length(); i++){
        
        switch(str.charAt(i)){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'O':
                break;
            default:
                temp += str.charAt(i);

        }

           // String complete = Character.toString(temp);

    }

    return temp;

    }

}