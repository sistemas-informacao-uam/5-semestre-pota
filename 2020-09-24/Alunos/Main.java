package Alunos;

class Main {
    public static void main(String[] args) {
        Aluno[] alunos = { new Aluno(332, 3, "José"), new Aluno(1124, 4, "Priscila"), new Aluno(543, 5, "Fernanda"),
                new Aluno(34, 3, "Paulo"), new Aluno(9877, 3, "Guilherme"), new Aluno(7867, 1, "Marcos"),
                new Aluno(233, 8, "Jéssica"), new Aluno(100, 7, "Gabi"), new Aluno(1, 6, "Carol"),
                new Aluno(99123, 2, "Roberto"), };

        Sort.insertionSort(alunos);
    }
}