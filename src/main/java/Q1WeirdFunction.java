// src/main/java/Q1WeirdFunction.java

public class Q1WeirdFunction {

   public static int fRecursive(int n) {
      if(n < 3) return n;
      return fRecursive(n - 1) + 2 * fRecursive(n - 2) + 3 * fRecursive(n - 3);
   }
   
   public static int fIterative(int n) {
      while(n <= 3) {
         n = (n - 1) + 2 * (n - 2) + 3 * (n - 3);
      }
      return n;
   }
}
