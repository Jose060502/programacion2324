package Ejercicio3;

import java.time.LocalDateTime;

public class Mensaje implements Comparable{
    private Persona remitente;
    private String texto;
    private LocalDateTime fecha;

    public Mensaje(Persona remitente, String texto) {
        this.remitente = remitente;
        this.texto = texto;
        fecha = LocalDateTime.now();
    }

    public Persona getRemitente() {
        return remitente;
    }

    public String getTexto() {
        return texto;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Mensaje{");
        sb.append("remitente=").append(remitente);
        sb.append(", texto='").append(texto).append('\'');
        sb.append(", fecha=").append(fecha);
        sb.append('}');
        return sb.toString();
    }


    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
