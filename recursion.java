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
    System.out.println(fib(15));
  }
  private static int fibMemorize(int n, int zero, int one){
    if (n == 0){
      return zero;
    }
    if (n > 0){
      return fibMemorize(n - 1, one, one + zero);
    }
    return 0;
  }
  public static int fib(int n){
    return fibMemorize(n, 0, 1);
  }
}
