public class URLify {

    // 1.3  URLify: Write a method to replace all spaces in a
    // string with '%20'. You may assume that the string has
    // sufficient space at the end to hold the additional characters,
    // and that you are given the "true" length of the string.
    // (Note: If implementing in Java,please use a character array
    // so that you can perform this operation in place.)


    public static void main(String[] args) {
        System.out.print(toURL("Mr John Smith   "));
    }

    public static String toURL (String input){
        input = input.trim();
        String output = "";
        String x = "%20";
        for(int i = 0; i < input.length(); i++){
            if(input.charAt(i) == ' '){
                output += x;
            } else {
                output += input.charAt(i);
            }
        }

        return output;
    }
}
    // Notes:   if I used a char array, I would do the same thing
    // (input.toCharArray()), except I would be iterating through
    // a char array instead of a string.
    // Runtime is O(n)