public class Soma {
    public int soma(int n) {
        return n > 1 ? n + soma(n - 1) : n;
    }
}