import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    System.out.println(fatorial(pegarInt()));
  }

  public static int soma(int n) {
    return n > 1 ? n + soma(n - 1) : n;
  }

  public static int fatorial(int n) {
    if (n == 0) {
      return 1;
    }
    if (n < 0) {
      System.out.println("Coloque um número positivo");
    }
    return n > 1 ? n * fatorial(n - 1) : n;
  }

  public static void contagemRegressiva(int n) {
    System.out.println(n);

    if (n == 0) {
      System.out.println("Lançamento Realizado!");
    } else {
      contagemRegressiva(n - 1);
    }
  }

  public static void chamarPotencia() {
    Scanner scan = new Scanner(System.in);

    System.out.print("Digite um número: ");
    double base = scan.nextDouble();

    System.out.print("Digite um número: ");
    double expoente = scan.nextDouble();

    scan.close();
    System.out.println(potencia(base, expoente));
  }

  public static double potencia(double base, double expoente) {
    if (expoente == 0) {
      return 1;
    } else if (expoente > 0) {
      return base * potencia(base, expoente - 1);
    } else {
      return 1 / potencia(base, -expoente);
    }
  }

  public static int pegarInt() {
    Scanner scan = new Scanner(System.in);

    System.out.print("Digite um número: ");
    int num = scan.nextInt();

    scan.close();

    return num;
  }
}