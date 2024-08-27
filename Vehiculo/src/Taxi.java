public class Taxi extends Vehiculo {
    private double valorPasaje;

    public Taxi(String color, String patente, double valorPasaje) {
        super(color, patente);
        this.valorPasaje = valorPasaje;
    }

    public double getValorPasaje() {
        return valorPasaje;
    }

    public void setValorPasaje(double valorPasaje) {
        this.valorPasaje = valorPasaje;
    }

    public double pagarPasaje(double monto) {
        if (monto > valorPasaje) {
            return monto - valorPasaje;
        } else {
            return valorPasaje;
        }
    }
}