package Examen2223;

public class FiguraMadera extends JugueteMadera implements Apilable{
    private String color;
    private int numLados;

    public FiguraMadera(String nombreMarca, String nombre, double precio, String paisOrigen, int fechaTala, String color, int numLados) throws JugueteException {
        super(nombreMarca, nombre, precio, paisOrigen, fechaTala);
        this.color = color;
        setNumLados(numLados);
    }

    public void setNumLados(int numLados) throws JugueteException {
        if (numLados < 2){
            throw new JugueteException("El numero de lados es demasiado bajo");
        }
        this.numLados = numLados;
    }

    @Override
    public void apilar(Juguete juguete) throws JugueteException {
        Apilable.super.apilar(juguete);
        System.out.println("Se ha apilado el juguete " + juguete.getNombre() + " sobre el juguete " + this.getNombre());
    }
}
