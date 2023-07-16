/**
 * Java
 */
public class Java {

    public static void main(String[] args) {
        int num = 2;
        System.out.println(doubleInteger(num));
    }

        public static int doubleInteger(int i) {
          // Double the integer and return it!

          int d = (int)Math.pow(i,2);

          //int d = i * 2;

          return d;
        }
      }