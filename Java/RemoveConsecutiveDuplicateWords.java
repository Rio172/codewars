import java.util.*;

public class RemoveConsecutiveDuplicateWords {
    public static void main(String[] args) {

        String phrase = "alpha beta beta gamma gamma gamma delta alpha beta beta gamma gamma gamma delta";
        System.out.println(removeConsecutiveDuplicates(phrase));
    }
    public static String removeConsecutiveDuplicates(String s){

        String[] word = s.split(" ");

        //String[] finalWord = new String[]{};
        Vector<String> v = new Vector<String>();

        for(int i = 0; i < word.length-1; i++){

            if(word[i].equals(word[i+1])){

            }else{
                v.add(word[i]);
            }
        }
        return String.join(" ", v) + " " + word[word.length-1];
    }
}



