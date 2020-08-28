public class TemperaturaSemana {

    double[] temperaturaSemana = new double[7];

    public TemperaturaSemana(double[] temperaturaSemana) {
        this.temperaturaSemana = temperaturaSemana;
    }

    public double calcularMedia() {
        double media = 0;
        for (int i = 0; i < this.temperaturaSemana.length; i++) {
            media += this.temperaturaSemana[i];
        }
        media /= this.temperaturaSemana.length;
        return media;
    }

    public int calcularDiasAcima() {
        double media = calcularMedia();

        int diasAcima = 0;
        for (int i = 0; i < this.temperaturaSemana.length; i++) {
            if (this.temperaturaSemana[i] > media) {
                diasAcima++;
            }
        }
        return diasAcima;
    }
}