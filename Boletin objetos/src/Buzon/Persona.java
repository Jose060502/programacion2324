package Buzon;

public class Persona {
    private String nombre;
    private Mensaje[] mensajesRecibidos;
    private Mensaje[] mensajesEnviados;
    private int mensajesRecibidosCount;
    private int mensajesEnviadosCount;

    public Persona(String nombre) {
        this.nombre = nombre;
        this.mensajesRecibidos = new Mensaje[5];
        this.mensajesEnviados = new Mensaje[5];
        this.mensajesRecibidosCount = 0;
        this.mensajesEnviadosCount = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void enviarMensaje(String asunto, String cuerpo, Persona destinatario) {
        if (asunto != null && cuerpo != null && destinatario != null) {
            Mensaje mensaje = new Mensaje(asunto, cuerpo, this, destinatario);

            if (mensajesEnviadosCount < 5) {
                mensajesEnviados[mensajesEnviadosCount++] = mensaje;
                destinatario.recibirMensaje(mensaje);
                System.out.println("Mensaje enviado con éxito.");
            } else {
                System.out.println("Error: Buzón de mensajes enviados lleno.");
            }
        } else {
            System.out.println("Error: Asunto, cuerpo o destinatario nulos.");
        }
    }

    public void recibirMensaje(Mensaje mensaje) {
        if (mensajesRecibidosCount < 5) {
            mensajesRecibidos[mensajesRecibidosCount++] = mensaje;
            System.out.println("Mensaje recibido con éxito.");
        } else {
            System.out.println("Error: Buzón de mensajes recibidos lleno.");
        }
    }

    public void borrarMensajeEnviadoMásAntiguo() {
        if (mensajesEnviadosCount > 0) {
            for (int i = 0; i < mensajesEnviadosCount - 1; i++) {
                mensajesEnviados[i] = mensajesEnviados[i + 1];
            }
            mensajesEnviadosCount--;
            System.out.println("Mensaje enviado más antiguo borrado con éxito.");
        } else {
            System.out.println("Error: Buzón de mensajes enviados vacío.");
        }
    }

    public void borrarMensajeRecibidoMásAntiguo() {
        if (mensajesRecibidosCount > 0) {
            for (int i = 0; i < mensajesRecibidosCount - 1; i++) {
                mensajesRecibidos[i] = mensajesRecibidos[i + 1];
            }
            mensajesRecibidosCount--;
            System.out.println("Mensaje recibido más antiguo borrado con éxito.");
        } else {
            System.out.println("Error: Buzón de mensajes recibidos vacío.");
        }
    }

    public void mostrarMensajesRecibidos() {
        System.out.println("Mensajes recibidos por " + nombre + ":");
        for (int i = 0; i < mensajesRecibidosCount; i++) {
            System.out.println(mensajesRecibidos[i]);
            System.out.println("------");
        }
    }

    public void mostrarMensajesEnviados() {
        System.out.println("Mensajes enviados por " + nombre + ":");
        for (int i = 0; i < mensajesEnviadosCount; i++) {
            System.out.println(mensajesEnviados[i]);
            System.out.println("------");
        }
    }
}
