/**
 * RemoveEx
 */
public class RemoveEx {

    public static void main(String[] args) {

        String word = "He!!oWorld!";

        System.out.println(removeExclamationMarks(word));
        
    }

    static String removeExclamationMarks(String s) {
        String temp = "";
        String remove = "";

        for(int i= 0; i < s.length();i++){
            if(s.charAt(i) == '!'){
                remove += s.charAt(i);
            }
            else{
                temp += s.charAt(i);
            }
        }
        //He!!oWorld!
        System.out.println(s);
        return temp;
    }
}