import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ListFilter
 */
public class ListFilter {

    public static void main(String[] args) {

        ArrayList<Object> list = new ArrayList<Object>(Arrays.asList("apple", 5, "banana", 7));  // created an arrayList with value 

        System.out.println(filterList(list));// Call the filterList method and print the result
    }

     public static List<Object> filterList(final List<Object> list) {
    // Return the List with the Strings filtered out

    ArrayList<Object> filterList = new ArrayList<Object>(); // declare a arraylist to store the filter value

    //"apple", 5, "banana", 7
    for(int i = 0; i < list.size(); i++){ // traverse thru the input arrayList

        if(!(list.get(i) instanceof String )){ // test for the current element is not a instance of the string class type
            filterList.add(list.get(i)); // if the element is not a string, add it to the filterList
        }
    }
    return filterList; //return the filter list
  }
}