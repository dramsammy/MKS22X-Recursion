import java.util.ArrayList;
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
    // TESTING FIBONACCI SEQUENCE
    System.out.println("--------------- Testing Fibonacci Sequence ---------------");
    System.out.println("Should be: 1");
    System.out.println("Actual: " + fib(0));
    System.out.println("Should be: 55");
    System.out.println("Actual: " + fib(10));
    System.out.println("Should be: 610");
    System.out.println("Actual: " + fib(15));
    System.out.println("Should be: 6765");
    System.out.println("Actual: " + fib(20));
    System.out.println("--------------- Testing SquareRoot ---------------");
    System.out.println("Should be around: 1.4");
    System.out.println("Actual: " + sqrt(2,0.1));
    System.out.println("Should be around: 9");
    System.out.println("Actual: " + sqrt(9,0.0001));
    System.out.println("Should be around: 12.529");
    System.out.println("Actual: " + sqrt(157,0.0001));
    System.out.println("--------------- Testing makeAllSums Method ---------------");
    System.out.println("Should be: [6,5,4,3,3,2,1,0]");
    System.out.println("Actual: " + makeAllSums(3));
    System.out.println("Should be: [10,9,8,7,7,6,5,4,6,5,4,3,3,2,1,0]");
    System.out.println("Actual: " + makeAllSums(4));
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
    return fibMemorize(n, 0, 1);
  }
  public static double sqrt(double n, double tolerance){
    if (n == 0.0){
      return 0.0;
    }
    return sqrtGuess(n, tolerance, 1);
    }
  private static double sqrtGuess(double n, double tolerance, double guess){
    boolean fitTolerance = true;
    while(fitTolerance){
      if (Math.abs(1 - ((Math.pow(guess, 2))/n)) <=tolerance){
        fitTolerance = false;
        return guess;
      }
      else{
        return sqrtGuess(n, tolerance, (n/guess + guess)/2.0);

      }
    }
    return guess;
  }
  public static ArrayList<Integer> makeAllSums(int n){
    ArrayList<Integer> makeAllSums = new ArrayList<Integer>();
    return makeAllSumsH(n, makeAllSums, 0);
  }
  private static ArrayList<Integer> makeAllSumsH(int n, ArrayList<Integer> ary, int sum){
    if (n == 0){
      ary.add(sum);
      return ary;
    }
    else{
      makeAllSumsH(n - 1, ary, sum + n);
      makeAllSumsH(n - 1, ary, sum);
    }
    return ary;
  }
}
