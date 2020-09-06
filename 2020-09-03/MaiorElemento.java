class MaiorElemento {

    public int acharMaiorElemento(int[] vetor, int tamanhoVetor) {
        if (tamanhoVetor == 1)
            return vetor[0];

        int n = acharMaiorElemento(vetor, tamanhoVetor - 1);
        if (n < vetor[tamanhoVetor - 1])
            n = vetor[tamanhoVetor - 1];

        return n;
    }

}