public class Reverse {

    /**
     * @param str
     * @return
     */
    public static String solution(String str) {
      // Your code here...
        String[] word = str.split(",");
        String temp = "";
        for(int i = 0; i <= word.length / 2; i++){
            temp = word[i];
            //temp = word[i];
        }
         //=temp.length-1

      return temp;
    }
  
    public static void main(String[] args) {
        System.out.println(solution("world"));
    }



  }