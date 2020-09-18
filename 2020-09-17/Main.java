class Main {
    public static void main(String[] args) {
        // Exercício 01
        System.out.println("Exercício 01\n");

        String[] dicionario = { "ciência", "computação", "informação", "tecnologia", "programação", "pota", "calculo",
                "sistemas", "" };

        String sentKey = "tecnologia";
        int pos = Busca.sentinelaString(dicionario, sentKey);

        if (pos > -1) {
            System.out.println("A chave {" + sentKey + "}" + " está na posição " + pos);
        } else {
            System.out.println("A chave {" + sentKey + "}" + " não existe no dicionário");
        }

        System.out.println("\nExercício 02\n");

        // Exercício 02
        int[] v1 = new int[10];
        int[] v2 = new int[1_000];
        int[] v3 = new int[1_000_000];
        int[] v4 = new int[1_000_000_00];

        v1 = randomInts(v1);
        v2 = randomInts(v2);
        v3 = randomInts(v3);
        v4 = randomInts(v4);

        int key = 987;

        System.out.println("Linear");
        System.out.println("10: " + Busca.linear(v1, key) + "ms");
        System.out.println("1_000: " + Busca.linear(v2, key) + "ms");
        System.out.println("1_000_000: " + Busca.linear(v3, key) + "ms");
        System.out.println("1_000_000_00: " + Busca.linear(v4, key) + "ms");

        System.out.println("-------------");

        System.out.println("Binária");
        System.out.println("10: " + Busca.binaria(v1, key) + "ms");
        System.out.println("1_000: " + Busca.binaria(v2, key) + "ms");
        System.out.println("1_000_000: " + Busca.binaria(v3, key) + "ms");
        System.out.println("1_000_000_00: " + Busca.binaria(v4, key) + "ms");

        System.out.println("\nExercício 03\n");

        key = v2[543];
        pos = Busca.interpolation(v2, key);

        if (pos > -1) {
            System.out.println("A chave {" + key + "}" + " está na posição " + pos);
        } else {
            System.out.println("A chave {" + key + "}" + " não existe no dicionário");
        }
    }

    public static int[] randomInts(int[] v) {
        int[] newV = new int[v.length];
        for (int i = 0; i < v.length; i++) {
            newV[i] = (int) (Math.random() * Math.max(1000, v.length));
        }
        return newV;
    }
}
