package Ejercicio7;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Recetario {

    private Set<Receta> recetas;

    public Recetario(){
        recetas = new HashSet<>();
    }

    public void annadirReceta(Receta nuevaReceta) throws RecetaException {
        if (recetas.contains(nuevaReceta)){
            throw new RecetaException("La receta ya existe");
        }
        recetas.add(nuevaReceta);
    }

    public String listadoRecetasOrdenadasAlfabeticamente() throws RecetaException {
        if (recetas.isEmpty()){
            throw new RecetaException("No hay recetas");
        }

        List<Receta> recetasOrdenadas = new LinkedList<>(recetas);
        recetasOrdenadas.sort((r1, r2) -> r1.getNombre().compareTo(r2.getNombre()));
        StringBuilder sb = new StringBuilder();
        for (Receta receta : recetasOrdenadas) {
            sb.append(receta.getNombre()).append(" - ").append(receta.getTiempoPreparacion()).append("\n");
        }
        return sb.toString();
    }
    public String listadoRecetasConIngredienteOrdenadasPorTiempoPreparacion(String ingrediente) throws RecetaException {
        List<Receta> recetasConIngrediente = new LinkedList<>();
        for (Receta receta : recetas) {
            if (receta.contieneIngrediente(ingrediente)) {
                recetasConIngrediente.add(receta);
            }
        }
        if (recetasConIngrediente.isEmpty()) {
            throw new RecetaException("No hay recetas con ese ingrediente");
        }
        recetasConIngrediente.sort((r1, r2) -> r1.getTiempoPreparacion() - r2.getTiempoPreparacion());
        StringBuilder sb = new StringBuilder();
        for (Receta receta : recetasConIngrediente) {
            sb.append(receta.getNombre()).append(" - ").append(receta.getTiempoPreparacion()).append("\n");
        }
        return sb.toString();
    }
}
