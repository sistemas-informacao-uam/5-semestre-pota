import java.util.Random;

class Main {
  public static void main(String[] args) {
    Random random = new Random();
    int array[] = new int[100];

    System.out.println("Desordenado: ");

    for (int i = 0; i < array.length; i++) {
      array[i] = random.nextInt(50);
      System.out.print(array[i] + " ");
    }
    System.out.println();

    long inicioBuble = System.nanoTime();
    System.out.println();
    bubbleSort(array);
    long tempoEstimadoBuble = (System.nanoTime() - inicioBuble) / 1_000_000;
    System.out.println();
    System.out.println("Tempo: " + tempoEstimadoBuble + "ms"); //88ms

    long inicioInsert = System.nanoTime();
    System.out.println();
    insertionSort(array);
    long tempoEstimadoInsert = (System.nanoTime() - inicioInsert) / 1_000_000;
    System.out.println();
    System.out.println("Tempo: " + tempoEstimadoInsert + "ms"); //10ms
  }

  public static void bubbleSort(int array[]) {
    int aux;
    int i;
    int j;

    for (i = 0; i < array.length-1; i++) {
      for (j = 0; j < array.length - 1; j++) {
        if (array[j] > array[j + 1]) {
          aux = array[j];
          array[j] = array[j + 1];
          array[j + 1] = aux;
        }
      }
    }

    System.out.println("Ordenado BubbleSort: ");
    for (i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
    }
  }

  public static void insertionSort(int array[]) {
    int tamanho = array.length;
    int i;
    int j;

    for (i = 1; i < tamanho; ++i) {
      int chave = array[i];
      j = i - 1;

      while (j >= 0 && array[j] > chave) {
        array[j + 1] = array[j];
        j = j - 1;
      }
      array[j + 1] = chave;
    }

    System.out.println("Ordenado insertionSort: ");
    for (i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
    }
  }
}