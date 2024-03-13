package Ejercicio7;

import java.util.*;

public class Receta {

    private String nombre;
    private int tiempoPreparacion;
    Set<Ingrediente> ingredientes;
    List<String> pasos;

    public Receta(String nombre, int tiempoPreparacion) {
        this.nombre = nombre;
        this.tiempoPreparacion = tiempoPreparacion;
        this.ingredientes = new HashSet<>();
        this.pasos = new LinkedList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public int getTiempoPreparacion() {
        return tiempoPreparacion;
    }

    public boolean necesitaIngrediente(String nombreIngrediente){

        return ingredientes.stream().anyMatch(i -> i.getNombre().equals(nombreIngrediente));
    }

    public void annadirIngrediente(Ingrediente ingredienteNuevo){

        Iterator<Ingrediente> it = ingredientes.iterator();

        while (it.hasNext()){
           Ingrediente i = it.next();

           if (ingredienteNuevo.getNombre().equals(i.getNombre())){
               i.addCantidad(ingredienteNuevo.getCantidad());
           }
        }
    }

    public void borrarIngrediente(Ingrediente ingredienteABorrar) throws RecetaException {
        if (!ingredientes.contains(ingredienteABorrar)){
            throw new RecetaException("El ingrediente no existe en la receta");
        }

        ingredientes.remove(ingredienteABorrar);

        List<String> eliminaPaso = new ArrayList<>();

        for (String paso : pasos){
            if (paso.contains(ingredienteABorrar.getNombre())){
                eliminaPaso.add(paso);
            }
        }

        pasos.removeAll(eliminaPaso);
    }

    public void annadirPasoDetrasDe(String pasoNuevo, String pasoExistente) throws RecetaException {
        if (!pasos.contains(pasoExistente)){
            throw new RecetaException("El paso existente no existe en la receta");
        }

        int indice = pasos.indexOf(pasoExistente);
        pasos.add(indice +1, pasoNuevo);
    }

    public boolean contieneIngrediente(String ingrediente) {
        for (Ingrediente i : ingredientes) {
            if (i.getNombre().equals(ingrediente)) {
                return true;
            }
        }
        return false;
    }
}
