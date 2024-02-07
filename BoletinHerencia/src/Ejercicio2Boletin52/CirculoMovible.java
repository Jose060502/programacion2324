package Ejercicio2Boletin52;

public class CirculoMovible extends Forma implements Dibujable, Animable{
    private double radio;

    public CirculoMovible(double radio) {
        this.radio = radio;
    }

    @Override
    public void animar() {
        System.out.println("Animando círculo movible");
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando círculo movible");
    }

    @Override
    public double calcularArea() {
        return 2*Math.PI*radio;
    }
}
