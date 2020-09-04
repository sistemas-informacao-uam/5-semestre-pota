class Main {
  public static void main(String[] args) {

    for (int i = 0; i <= 9; i++) {
      System.out.print(fibonati(i) + ", ");
    }

    System.out.print(fibonati(10));
  }

  public static int fibonati(int n) {
    if (n < 2) {
      return n;
    } else {
      return fibonati(n - 1) + fibonati(n - 2);
    } 
  }
}