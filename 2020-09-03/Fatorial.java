public class Fatorial {
  public String mostrarFatorial(int n) {
    return "Fatorial de " + n + " é: " + fatorial(n);
  }

  public int fatorial(int n) {
    if (n == 0) {
      return 1;
    } else {
      return n * fatorial(n - 1);
    }
  }
}