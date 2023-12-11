package Buzon;
public class Principal {
    public static void main(String[] args) {
        // Crear personas
        Persona persona1 = new Persona("Juan");
        Persona persona2 = new Persona("Maria");

        // Enviar mensajes
        persona1.enviarMensaje("Saludo", "¡Hola Maria!", persona2);
        persona2.enviarMensaje("Respuesta", "Hola Juan, ¿cómo estás?", persona1);

        // Mostrar mensajes recibidos y enviados
        persona1.mostrarMensajesRecibidos();
        persona1.mostrarMensajesEnviados();

        persona2.mostrarMensajesRecibidos();
        persona2.mostrarMensajesEnviados();

        // Intentar enviar mensajes cuando los buzones están llenos
        for (int i = 0; i < 8; i++) {
            persona1.enviarMensaje("Prueba", "Mensaje de prueba " + (i + 1), persona2);
        }

        // Mostrar mensajes recibidos y enviados después de intentar enviar mensajes con buzones llenos
        persona1.mostrarMensajesRecibidos();
        persona1.mostrarMensajesEnviados();

        persona2.mostrarMensajesRecibidos();
        persona2.mostrarMensajesEnviados();
    }
}
