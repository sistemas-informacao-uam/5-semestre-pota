public class ContagemRegressiva {
    public void contagemRegressiva(int n) {
        if (n > 0) {
            System.out.print(n + ", ");
            contagemRegressiva(n - 1);
        } else {
            System.out.print(n + "... ");
            System.out.println("\nLançamento Realizado!\n");
        }
    }
}