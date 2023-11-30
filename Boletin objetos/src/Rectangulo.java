// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Rectangulo {
    public static final int MAX_LONGITUD = 20;
    private double longitud;
    private double ancho;

    public static void main (String [] args){
        Rectangulo r = new Rectangulo(5, 2);
        System.out.printf("El área del rectangulo es %f\n", r.calcularArea());
        System.out.printf("El perímetro del rectángulo es %f\n", r.calcularPerimetro());
    }

    public Rectangulo(double l, double a) {
        setLongitud(l);
        setAncho(a);
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        if (longitud > 0) {
            this.longitud = longitud;
        } else {
            // TODO: Lanzar excepcion
        }
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        if (ancho > 0 && ancho < MAX_LONGITUD) {
            this.ancho = ancho;
        } else {
            // TODO: Lanzar excepcion
        }
    }

    public double calcularPerimetro() {
        return 2 * longitud + 2 * ancho;
    }

    public double calcularArea() {
        return longitud * ancho;
    }
}