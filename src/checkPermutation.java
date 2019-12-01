import java.util.*;
public class checkPermutation {
    //  Given two strings,write a method to decide if one is a permutation of the
    //other.
    public static void main(String[] args) throws NullPointerException{
        System.out.println(perm("abc", "fgh"));
    }

    public static boolean perm(String one, String two){
        if(one.length() != two.length()){
            return false;
        }

        HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
        HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();
        for(int i = 0; i < one.length(); i++){
            char oneChar = one.charAt(i);
            char twoChar = two.charAt(i);

            if(!map1.containsKey(one.charAt(i))){
                map1.put(one.charAt(i), 0);
            }
            if(!map2.containsKey(two.charAt(i))){
                map2.put(two.charAt(i), 0);
            }
            int oneInt = map1.get(oneChar);
            int twoInt = map2.get(twoChar);
            map1.put(oneChar, oneInt++);
            map2.put(twoChar, twoInt++);

        }
        return map1.equals(map2);
    }
}
/*
    Analysis:   This runs in O(n) time. 2 Strings of length n are
    iterated through once and stored in a hashmap. Then, two maps
    are compared. If the two maps are identical, i.e. they both contain
    the same amounts of each letter, then they are permutations of one another. 
 */