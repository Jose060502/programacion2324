package Examen2122;

import java.time.LocalDateTime;

public class Fichero {
    private String nombre;
    private long size;
    private LocalDateTime fechaCreacion;

    public Fichero(String nombre, long size) {
        this.nombre = nombre;
        setSize(size);
        this.fechaCreacion = LocalDateTime.now();
    }

    public long getSize() {
        return size;
    }

    /**
     *
     * @param size
     * @throws IllegalArgumentException
     */
    public void setSize(long size) {
        if (size < 1) throw new IllegalArgumentException("El tamaño del archivo no puede ser negativo");
        this.size = size;
    }
}
