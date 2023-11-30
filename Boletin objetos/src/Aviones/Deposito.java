package Aviones;

public class Deposito {

    private double capacidadMáxima;
    private double cantidadActual;

    public Deposito(double cantidadActual, double capacidadMáxima) {
        this.capacidadMáxima = capacidadMáxima;
        setCantidadActual(cantidadActual);
    }

    public void setCantidadActual(double cantidadActual) {
        if (cantidadActual < capacidadMáxima && cantidadActual > 0) {
            this.cantidadActual = cantidadActual;
        }
    }

    public double getCapacidadMáxima() {
        return capacidadMáxima;
    }

    public double getCantidadActual() {
        return cantidadActual;
    }
    public String toString(){
        return (cantidadActual / capacidadMáxima * 100 )+ " % de un deposito " + capacidadMáxima + " litros";
    }
}
