package Examen2223;

public class VehiculoPlastico extends JuguetePlastico{
    private int numRuedas;

    public VehiculoPlastico(String nombreMarca, String nombre, double precio, int numRuedas) throws JugueteException {
        super(nombreMarca, nombre, precio, TPlastico.PVC);
        setNumRuedas(numRuedas);
    }

    public int getNumRuedas() {
        return numRuedas;
    }

    public void setNumRuedas(int numRuedas) throws JugueteException {
        if (numRuedas < 1){
            throw new JugueteException("No tiene sentido tan pocas ruedas");
        }
        this.numRuedas = numRuedas;
    }

}
