package Examen2223;

public abstract class JuguetePlastico extends Juguete{

    private TPlastico tipoPlastico;

    public JuguetePlastico(String nombreMarca, String nombre, double precio, TPlastico pvc) throws JugueteException {
        super(nombreMarca, nombre, precio);
        this.tipoPlastico = tipoPlastico;
    }

    public TPlastico getTipoPlastico() {
        return tipoPlastico;
    }
}
