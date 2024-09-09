// src/main/java/Q1WeirdFunction.java

public class Q1WeirdFunction {

    public static int fRecursive(int n) {
      if(n < 3) return n;
      n = fRecurisve(n - 1) + fRecurisve(n - 2) + fRecurisve(n - 3);
   }

    }

    public static int fIterative(int n) {
        // TODO: Implement the iterative function
        return 0;
    }
}
