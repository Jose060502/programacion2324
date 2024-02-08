package Examen2223;

public abstract class Juguete {
    private String nombreMarca;
    private String nombre;
    private double precio;

    public Juguete(String nombreMarca, String nombre, double precio) throws JugueteException {
        this.nombreMarca = nombreMarca;
        this.nombre = nombre;
        setPrecio(precio);
    }

    public String getNombreMarca() {
        return nombreMarca;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) throws JugueteException {
        if (precio < 1){
            throw new JugueteException("El precio debe ser positivo");
        }
        this.precio = precio;
    }

}
