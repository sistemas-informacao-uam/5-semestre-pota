package Alunos;

public class Aluno implements Comparable<Aluno> {
    private int RA;
    private int semestre;
    private String nome;

    public Aluno(int RA, int semestre, String nome) {
        this.RA = RA;
        this.semestre = semestre;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRA() {
        return RA;
    }

    public void setRA(int rA) {
        RA = rA;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    @Override
    public int compareTo(Aluno a) {
        if (this.nome.compareTo(a.getNome()) > 0)
            return 1;
        if (this.nome.compareTo(a.getNome()) < 0)
            return -1;
        else
            return 0;
    }
}
