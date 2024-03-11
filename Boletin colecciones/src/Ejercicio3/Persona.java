package Ejercicio3;

import java.util.ArrayList;
import java.util.List;

public abstract class Persona {
    private final String nombre;
    private final List<Mensaje> bandejaEntrada;

    public Persona(String nombre) {
        this.nombre = nombre;
        this.bandejaEntrada = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void sendMensaje(Persona receptor, String mensaje) throws MensajeException {
        receptor.bandejaEntrada.add(new Mensaje(this, mensaje));
    }

    public String leerMensaje() {
        StringBuilder mensajes = new StringBuilder();

        for (int i = 0; i < bandejaEntrada.size(); i++) {
            mensajes.append(bandejaEntrada.get(i)).append("\n");
        }

        return mensajes.toString();
    }

    public String leerMensajesOrdenados() {
        List<Mensaje> bandejaOrdenada = new ArrayList<>(bandejaEntrada);
        bandejaEntrada.sort(null);
        StringBuilder mensajes = new StringBuilder();

        for (int i = 0; i < bandejaEntrada.size(); i++) {
            mensajes.append(bandejaEntrada.get(i)).append("\n");
        }

        return mensajes.toString();
    }
}
