import java.util.*;

public class VowelCount {
    public static void main(String[] args) {
        String name = "gus tavo";
        System.out.println(getCount(name));
    }
    public static int getCount(String str){
        String nameLower = str.toLowerCase();
        String temp = "";
        int count = 0;

        for(int i = 0; i < nameLower.length();i++){
            if(nameLower.charAt(i) == 'a' || nameLower.charAt(i) == 'e' || nameLower.charAt(i) == 'i' || nameLower.charAt(i) == 'o' || nameLower.charAt(i) == 'u')
                temp += nameLower.charAt(i);
            }
            count = temp.length();
    return count;
  }
}
