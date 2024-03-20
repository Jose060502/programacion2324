import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Plato {
    private String nombre;
    private double duracion;
    private List<String> pasos;
    private Map<String, Integer> ingredientes;

    public Plato(String nombre, double duracion) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.pasos = new LinkedList<>();
        this.ingredientes = new HashMap<>();
    }

    public void nuevoPaso(String paso) throws RestauranteException {
        if (paso.isBlank()) throw new RestauranteException("No se ha introducido un paso valido");

        pasos.add(paso);
    }

    public void nuevoIngrediente(String nombre, int cantidad){
        Integer cantidadPrevia = ingredientes.putIfAbsent(nombre, cantidad);
        if (cantidadPrevia != null) ingredientes.replace(nombre, cantidadPrevia + cantidad);
    }
}
