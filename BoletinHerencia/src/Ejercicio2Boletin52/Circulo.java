package Ejercicio2Boletin52;

public class Circulo extends Forma implements Dibujable{

    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public void dibujar() {
        System.out.println("dibujando círculo");
    }

    @Override
    public double calcularArea() {
        return 2*Math.PI*radio;
    }
}
