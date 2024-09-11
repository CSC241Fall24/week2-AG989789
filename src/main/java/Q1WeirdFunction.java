// src/main/java/Q1WeirdFunction.java

public class Q1WeirdFunction {

    public static int fRecurisve(int n) {
      if(n < 3) return n;
      return fRecurisve(n - 1) + fRecurisve(n - 2) + fRecurisve(n - 3);
   }
   
   public static int fInterative(int n) {
      while(n < 3)
         n = (n - 1) + (n - 2) + (n - 3);
      return n;
   }
}
