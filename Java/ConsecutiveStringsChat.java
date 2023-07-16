/**
 * ConsecutiveStringsChat
 */
public class ConsecutiveStringsChat {
    public static void main(String[] args) {

        //String[] strarr = new String[]{"tree", "foling", "trashy", "blue", "abcdef", "uvwxyz"};

        String[] strarr = new String[]{"zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"};

        int k = 2;

        System.out.println(longestConsec(strarr,k));
        
    }


    public static String longestConsec(String[] strarr, int k) {

        if (strarr == null || strarr.length == 0 || k <= 0 || k > strarr.length) {
            return "";
        }

        // Variables to track the maximum combined length and starting index of consecutive strings
        int maxLength = 0;
        int startIndex = 0;

        // Iterate through the array to find consecutive strings with maximum combined length
        for (int i = 0; i <= strarr.length - k; i++) {
            // Variable to store the combined length of consecutive strings for the current iteration
            int currentLength = 0;
            // Calculate the combined length of consecutive strings
            for (int j = i; j < i + k; j++) {
                currentLength += strarr[j].length();
            }
            // Update maximum length and starting index if current length is greater
            if (currentLength > maxLength) {
                maxLength = currentLength;
                startIndex = i;
            }
        }

        // Build the final result by concatenating the consecutive strings with the maximum length
        StringBuilder sb = new StringBuilder();
        for (int i = startIndex; i < startIndex + k; i++) {
            sb.append(strarr[i]);
        }

        // Return the final result as a string
        return sb.toString();
    }
}





    