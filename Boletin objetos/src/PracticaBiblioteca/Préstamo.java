package PracticaBiblioteca;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Préstamo {
    public static final int NUM_DIAS_PRESTAMO = 10;
    public static final int NUM_MA_PRESTAMOS = 3;
    private LocalDateTime fechaInicio;
    private LocalDate fechaFin;
    private LocalDateTime fechaDevolucion;
    private Libro libro;
    private Usuario usuario;

    public Préstamo(LocalDateTime fechaInicio, Libro libro, Usuario usuario) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaInicio.plusDays(NUM_DIAS_PRESTAMO).toLocalDate();
        this.libro = libro;
        this.usuario = usuario;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public boolean estaActivo(){
        return fechaDevolucion == null;
    }
}
