// src/main/java/Q4ReverseString.java

public class Q4ReverseString {

    public static String reverse(String s) {
        if(s.length() > 0)
         return s.substring(s.length() - 1) + reverseString(s.substring(0, s.length()-1));
      return "";
    }
}
