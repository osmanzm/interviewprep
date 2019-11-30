import java.util.*;

public class isUnique {
    public static void main(String[] args) {
        System.out.println(unique("abca"));
    }

    public static boolean unique(String string) {
        string = string.toLowerCase();
        boolean[] arr = new boolean[26];
        for(int i = 0; i < string.length(); i++){
            int index = string.charAt(i) - 'a';
            if(arr[index] == true) {
                return false;
            } else {
                arr[index] = true;
            }
        }
        return true;
    }

}
