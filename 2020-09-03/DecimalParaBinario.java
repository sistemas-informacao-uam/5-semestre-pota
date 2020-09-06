class DecimalParaBinario {
    public String converterParaBinario(int n) {
        String txt = "";
        if (n > 0) {
            txt += converterParaBinario(n / 2);
            return txt + (n % 2) + " ";
        }
        return txt;
    }
}