class Fibonacci {

  public String mostrarFibonacci(int n) {
    String txt = "Sequência de Fibonacci até o " + n + "º número: ";
    for (int i = 0; i < n; i++) {
      txt += fibonacci(i) + ", ";
    }

    return txt;
  }

  public int fibonacci(int n) {
    if (n < 2) {
      return n;
    } else {
      return fibonacci(n - 1) + fibonacci(n - 2);
    }
  }
}