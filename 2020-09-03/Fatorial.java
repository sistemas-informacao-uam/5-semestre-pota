class Main {
  public static void main(String[] args) {

    int n = 5;

    System.out.println("Fatorial de " + n + " é: " + fatorial(n));

  }

  public static int fatorial(int n) {
    if (n == 0) {
      return 1;
    } else {
      return n * fatorial(n - 1);
    }
  }
}