package Examen2223;

public class InstrumentoMadera extends JugueteMadera{

    private int edadMin;
    public static final int EDAD_MINIMA_PERMITIDA = 1;
    public InstrumentoMadera(String nombreMarca, String nombre, double precio, String paisOrigen, int fechaTala, int edadMin) throws JugueteException {
        super(nombreMarca, nombre, precio, paisOrigen, fechaTala);
        setEdadMin(edadMin);
    }

    public int getEdadMin() {
        return edadMin;
    }

    public void setEdadMin(int edadMin) throws JugueteException {
        if (edadMin < EDAD_MINIMA_PERMITIDA){
            throw new JugueteException("Valor incorrecto");
        }
        this.edadMin = edadMin;
    }
}
