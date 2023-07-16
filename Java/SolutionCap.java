public class SolutionCap{

    public static void main(String[] args) {
        
        String word = "database";

        int[] arr = new int[]{1,2,7};

        //System.out.println(capitalize(word,arr));

        System.out.println(CharCap(word,arr));


    }

    public static String capitalize(String s, int[] ind){

        String temp = "";
        boolean flag = false;

        for(int i = 0; i < s.length(); i++){

            for(int j = 0; j < ind.length; j++){
                if(i==ind[j]){
                    temp += Character.toUpperCase(s.charAt(i));
                    flag = true;
                    break;
                }
            }
            if(flag == false){
                temp += s.charAt(i);
            }
            flag = false;

        }

        return temp;
    }

        public static String CharCap(String s, int[] ind){

            char[] charS = s.toCharArray();

            for(int i = 0; i < ind.length; i++){
                if(ind[i] < 0 || ind[i] > charS.length -1 ){

                }else{

                    charS[ind[i]] = Character.toUpperCase(charS[ind[i]]);//MUST BE A INT[] work the inner, the element that is produce from on index becomes the index of the outer array element.
                }
            }
            return new String(charS);
        }

}