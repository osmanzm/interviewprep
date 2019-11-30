import java.util.*;

// CTCI: Chapter 1 problem 1.1
/*
*   Is Unique: Implement an algorithm to determine if a string
*   has all unique characters.
*   What if you cannot use additional data structures?
*/

public class isUnique {
    public static void main(String[] args) {
        System.out.println(unique("abca"));
    }
    // initial strategy: create a bool array of 26 elements that checks if
    // a particular value has been seen. If it is already true, then
    // a letter has been seen and function returns false.
    public static boolean unique(String string) {
       // string = string.toLowerCase();
        boolean[] arr = new boolean[128];
        for(int i = 0; i < string.length(); i++){
            int index = string.charAt(i);
            if(arr[index] == true) {
                return false;
            }
            arr[index] = true;
        }
        return true;
    }
    //  Run time: O(n)


    // if an additional data structure cannot be used, this would take O(n^2) time
    // I would have to an exhaustive check going through the n character
    // string n times per character.

    //  Feedback:
    //  1.  this solution only accounts for unique letters. To check for all character
    //  types, the array needs to be size 128.
    //  2.  did not include a size check. If the string's length is greater than
    //  128 characters, we can automatically return false.
    //  3.  if we could not use an additional data structure, we could
    //  sort the string O(n log(n)) and then linearly check the string. This could
    //  take extra space.
    //      We could also exhaustively check in O(n^2) time.
}
