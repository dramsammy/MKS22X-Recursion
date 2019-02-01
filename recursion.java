public class recursion{
  // public static int fib(int n){
  //   int temp;
  //   if (n == 1){
  //     return 1;
  //   }
  //   if (n == 0){
  //     return 0;
  //   }
  //   if (n > 1){
  //     temp = fib(n - 1);
  //     return fib(n- 2) + temp;
  //   }
  //   return 0;
  // }
  public static void main(String[] args) {
    System.out.println(fib(0));
  }
  private static int fibMemorize(int n, int zero, int one){
    if (n == 0){ //base case starts off with 0 increases in value for tree... memorized value
      return zero;
    }
    if (n > 0){
      return fibMemorize(n - 1, one, one + zero); // decreases n value from start and just adds last two values... n = 2, zero = 0, one = 1, n = 1, zero = 1, one = 1, n = 0, zero = 1, one = 2
    }
    return 0;
  }
  public static int fib(int n){
    if (n == 0){
      return 1;
    }
    return fibMemorize(n, 0, 1);
  }
  public static double sqrt(double n, double tolerance){
    return sqrtGuess(n, 0.1, 1);
    }
  private static double sqrtGuess(double n, double tolerance, double guess){
    boolean fitTolerance = true;
    while(fitTolerance){
      if ((Math.pow(guess, 2)/n) == tolerance){
        fitTolerance = false;
        return guess;
      }
      else{
        return sqrtGuess(n, tolerance, (n/guess + guess)/2);
      }
    }
    return guess;
  }
}
