import java.util.*;

public class MixedSum {
    public static void main(String[] args) {
        List<String> mix = Arrays.asList("2", "1", "3", "6");

        //System.out.println(sum(mix));
        MixedSum s = new MixedSum();

        System.out.println(s.sum(mix));
    }

    public int sum(List<?> mixed) {	

        int temp = 0;
        for(int i = 0; i < mixed.size(); i++){
        
            temp += Integer.valueOf(mixed.get(i).toString());
        }

		return temp;
	}
}
