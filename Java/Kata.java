public class Kata {
    public static void main(String[] args) {

        int[] intArr = new int[]{1,2,2};

        System.out.println(squareSum(intArr));
        
    }
    /**
     * InnerKata
     */
    public static int squareSum(int[] n){

        int dos = 2;

        int sum = 0;

        for(int i = 0; i < n.length; i++){
            sum += Math.pow(n[i], dos);
        }
        return sum;
    }
}
