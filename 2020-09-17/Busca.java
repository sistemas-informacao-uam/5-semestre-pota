import java.util.Arrays;

public class Busca {
    public static int sentinelaString(String[] v, String key) {
        v[v.length - 1] = key;
        int i = 0;
        while (!v[i].equals(key))
            i++;
        if (i == v.length - 1)
            return -1;
        return i;
    }

    public static void sequencial() {

    }

    public static long binaria(int[] v, int key) {
        // Ordenação
        Arrays.sort(v);

        long inicio, fim, tempoEstimado;
        inicio = System.nanoTime();

        int start = 0;
        int end = v.length - 1;
        while (start <= end) {
            int center = (start + end) / 2;
            if (key == v[center]) {
                break;
            } else if (key < v[center]) {
                end = center - 1;
            } else {
                start = center + 1;
            }
        }

        fim = System.nanoTime();
        tempoEstimado = (fim - inicio) / 1_000_000;
        return tempoEstimado;
    }

    public static long linear(int[] v, int key) {
        long inicio, fim, tempoEstimado;
        inicio = System.nanoTime();

        for (int i = 0; i < v.length; i++) {
            if (v[i] == key) {
                break;
            }
        }

        fim = System.nanoTime();
        tempoEstimado = (fim - inicio) / 1_000_000;
        return tempoEstimado;
    }

    public static int interpolation(int[] v, int key) {

        int start = (v.length - 1);
        int end = 0;

        while (key >= v[end] && key <= v[start] && end <= start) {

            int probe = end + (start - end) * (key - v[end]) / (v[start] - v[end]);

            if (start == end) {
                if (v[end] == key) {
                    return end;
                } else {
                    return -1;
                }
            }

            if (v[probe] == key) {
                return probe;
            }

            if (v[probe] < key) {
                end = probe + 1;
            } else {
                start = probe - 1;
            }
        }
        return -1;
    }
}
