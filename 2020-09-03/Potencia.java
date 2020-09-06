class Potencia {
    public String mostrarPotencia(double base, double expoente) {
        String potencia = "Potência: (" + base + ") ^ " + expoente + " = ";
        return potencia + potencia(base, expoente);
    }

    public double potencia(double base, double expoente) {
        if (expoente == 0) {
            return 1;
        } else if (expoente > 0) {
            return base * potencia(base, expoente - 1);
        } else {
            return 1 / potencia(base, -expoente);
        }
    }
}
