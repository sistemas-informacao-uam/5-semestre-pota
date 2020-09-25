package Alunos;

public class Sort {
    public static void insertionSort(Aluno alunos[]) {
        int tamanho = alunos.length;
        int i;
        int j;

        for (i = 1; i < tamanho; ++i) {
            Aluno chave = alunos[i];
            j = i - 1;

            while (j >= 0 && alunos[j].compareTo(chave) > 0) {
                alunos[j + 1] = alunos[j];
                j = j - 1;
            }
            alunos[j + 1] = chave;
        }

        System.out.println("Alunos ordenados por nome e insertionSort: ");
        for (i = 0; i < alunos.length; i++) {
            System.out.println(
                    alunos[i].getRA() + " - " + alunos[i].getNome() + " - " + alunos[i].getSemestre() + "º Semestre");
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

    public static void bubbleSort(int array[]) {
        int aux;
        int i;
        int j;

        for (i = 0; i < array.length - 1; i++) {
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
}
