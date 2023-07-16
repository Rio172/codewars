import java.util.*;

public class CamelBreak {

    public static void main(String[] args) {
        
        String word = "camelCasing";

        System.out.println(Camel(word));

    }
    

    public static String Camel(String lowerCamel) {

        String temp = "";

        for(int i = 0; i < lowerCamel.length(); i++){

            if(Character.isUpperCase(lowerCamel.charAt(i))){

                temp += " " + lowerCamel.charAt(i);

            }else{
                temp += lowerCamel.charAt(i);

            }
        }
        return temp;
        
    }


}
