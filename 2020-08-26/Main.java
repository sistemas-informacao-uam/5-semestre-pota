import java.util.Scanner;

// Paulo D'Elia
// RA: 21066425

// Link to test online
// https://repl.it/join/twxkosqf-paulohdelia

/**
 * Main
 */

// Primeira aula POTA - Revisão de Java e Lógica
public class Main {
    public static void main(String[] args) {
        temperaturaDaSemana();
    }

    public static void temperaturaDaSemana() {
        // Estou declarando dessa forma para ser fácil de verificar se está correto
        double[] vetorTemperaturaSemana = new double[7];
        vetorTemperaturaSemana[0] = 14;
        vetorTemperaturaSemana[1] = 5;
        vetorTemperaturaSemana[2] = 7;
        vetorTemperaturaSemana[3] = 9;
        vetorTemperaturaSemana[4] = 15;
        vetorTemperaturaSemana[5] = 14;
        vetorTemperaturaSemana[6] = 12;

        TemperaturaSemana temperaturaSemana = new TemperaturaSemana(vetorTemperaturaSemana);

        double media = temperaturaSemana.calcularMedia();
        int diasAcima = temperaturaSemana.calcularDiasAcima();

        System.out.println("Média: " + media);
        System.out.println("Dias acima da média: " + diasAcima);
    }

    public static String achaIssoNoVetor(int num) {
        int[] vetor = new int[20];

        // preencher valores com números de 0 a 19 pra facilitar a vida
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = i;
        }

        String achou = "O valor não foi encontrado";

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == num) {
                achou = "Valor encontrado em vetor[" + i + "]";
                break;
            }
        }
        return achou;
    }

    public static void imparesEvoluidoDaSimone() {
        int[] vetor = new int[10];

        for (int i = 0, j = 1; i < vetor.length; i++, j += 2) {
            vetor[i] = j;
            System.out.println("vetor[" + i + "] = " + vetor[i]);
        }
    }

    public static void multiplicaPor3AteDar100() {
        int num = pegarInt();
        System.out.println(num);
        while (num <= 100) {
            num *= 3;
            System.out.println(num);
        }
    }

    public static void somaDeNumerosAntesDeN() {
        int num = pegarInt();
        int somatoria = 0;
        for (int i = 1; i <= num; i++) {
            somatoria += i;
        }
        System.out.println("Soma de todos os números: " + somatoria);
    }

    public static void impares() {
        int[] vetor = new int[10];

        int cont = 1;
        int pos = 0;
        while (pos < vetor.length) {
            if (cont % 2 != 0) {
                vetor[pos] = cont;
                System.out.print(vetor[pos] + " ");
                pos++;
            }
            cont++;
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