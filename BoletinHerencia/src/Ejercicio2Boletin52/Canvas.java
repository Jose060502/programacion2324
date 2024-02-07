package Ejercicio2Boletin52;

public class Canvas {
    public static void dibujaYAnimaFormas(Forma[] formas){
        for (Forma forma: formas){
            if (forma instanceof Dibujable){
                ((Dibujable) forma).dibujar();
            }
            if(forma instanceof Animable){
                ((Animable) forma).animar();
            }
            try {
                System.out.println("El area de " + forma.getClass().getSimpleName() + " es " + forma.calcularArea());
            } catch (FormaException e) {
                System.err.println(e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        Forma [] formas = {new Rectangulo(3, 4), new Circulo(3), new CirculoMovible(2), new Linea(4)};

        dibujaYAnimaFormas(formas);
    }
}
