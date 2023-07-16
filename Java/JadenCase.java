import java.util.*;

public class JadenCase {

    public static void main(String[] args) {

        JadenCase Obj = new JadenCase(); 
        
        String jadenWord = "How can mirrors be real if our eyes aren't real";

        System.out.println(Obj.toJadenCase(jadenWord));
        
    }

	public String toJadenCase(String phrase) {
		// TODO put your code below this comment

        String[] arr = new String[]{};

        arr = phrase.split(" ");

        String[] temp = new String[arr.length];

        //System.out.println(Arrays.toString(arr));

        
        //["How","can","mirrors","be", "real", "if", "our", "eyes", "aren't", "real"]

         
        for(int i = 0; i < arr.length; i++){

            temp[i] = arr[i].substring(0,1).toUpperCase();

            // variable temp[i] is being assign to an instance method 

            temp[i] += arr[i].substring(1).toLowerCase();

        }
        
		return String.join(" ", temp);
	}

}