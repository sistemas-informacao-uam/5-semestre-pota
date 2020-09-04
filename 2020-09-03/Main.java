class Main {
  public static void main(String[] args) {
    Fatorial fato = new Fatorial();
    String fatorial = fato.mostrarFatorial(4);
    System.out.println(fatorial + "\n");

    Fibonacci fibo = new Fibonacci();
    String fibonacci = fibo.mostrarFibonacci(6);
    System.out.println(fibonacci + "\n");

    Potencia pot = new Potencia();
    double base = 5, expoente = 3;
    String potencia = pot.mostrarPotencia(base, expoente);
    System.out.println(potencia + "\n");

    int soma = soma(5);
    System.out.println("Soma: " + soma + "\n");

    System.out.print("Contagem regressiva: ");
    contagemRegressiva(6);
  }

  // Soma
  public static int soma(int n) {
    return n > 1 ? n + soma(n - 1) : n;
  }

  // Contagem Regressiva
  public static void contagemRegressiva(int n) {
    if (n > 0) {
      System.out.print(n + ", ");
      contagemRegressiva(n - 1);
    } else {
      System.out.print(n + "... ");
      System.out.println("\nLançamento Realizado!");
    }
  }
}