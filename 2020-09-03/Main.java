class Main {
  public static void main(String[] args) {

    // Exemplo durante aula
    Soma sum = new Soma();
    int soma = sum.soma(5);
    System.out.println("Soma: " + soma + "\n");

    // Exemplo durante aula
    ContagemRegressiva cont = new ContagemRegressiva();
    System.out.print("Contagem regressiva: ");
    cont.contagemRegressiva(6);

    // Exercício 1
    Potencia pot = new Potencia();
    double base = 5, expoente = 3;
    String potencia = pot.mostrarPotencia(base, expoente);
    System.out.println(potencia + "\n");

    // Exercício 2
    Fatorial fato = new Fatorial();
    String fatorial = fato.mostrarFatorial(4);
    System.out.println(fatorial + "\n");

    // Exercício 3
    Fibonacci fibo = new Fibonacci();
    String fibonacci = fibo.mostrarFibonacci(6);
    System.out.println(fibonacci + "\n");

    // Exercício 4
    MaiorElemento maior = new MaiorElemento();
    int[] vetor = { 102, 20, 537, 40, 30, 45, 47, 34, 99 };
    int maiorElemento = maior.acharMaiorElemento(vetor, vetor.length);
    System.out.println("Maior elemento: " + maiorElemento + "\n");

    // Exercício 5
    DecimalParaBinario d2b = new DecimalParaBinario();
    int numeroDecimal = 23;
    String decimalParaBinario = "Resposta= " + numeroDecimal + " base 10 -> base 2 = "
        + d2b.converterParaBinario(numeroDecimal);
    System.out.println(decimalParaBinario);
  }
}