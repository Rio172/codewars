import java.util.*;

/**
 * YesOrNo
 */
public class YesOrNo {

    public static void main(String[] args) {
        boolean si = true;

        boolean no = false;

        System.out.println(boolToWord(si)); 
        
    }

    public static String boolToWord(boolean b){
    
        if(b == true){
            return "Yes";
        }else{
            return "No";
        }
  }


}
