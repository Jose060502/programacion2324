package Examen2223;

public abstract class JugueteMadera extends Juguete{

    private String paisOrigen;
    private int fechaTala;

    public JugueteMadera(String nombreMarca, String nombre, double precio, String paisOrigen, int fechaTala) throws JugueteException {
        super(nombreMarca, nombre, precio);
        this.paisOrigen = paisOrigen;
        setFechaTala(fechaTala);
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public int getFechaTala() {
        return fechaTala;
    }

    public void setFechaTala(int fechaTala) throws JugueteException {
        if (fechaTala < 1){
            throw new JugueteException("Año incorrecto");
        }
        this.fechaTala = fechaTala;
    }
}
