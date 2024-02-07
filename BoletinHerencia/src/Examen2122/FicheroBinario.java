package Examen2122;

public class FicheroBinario extends Fichero{

    private byte[] contenido;

    public FicheroBinario(String nombre, long size, byte[] contenido) {
        super(nombre, contenido.length);
        setContenido(contenido);
    }

    private void setContenido(byte[] contenido) {
        this.contenido = contenido;
    }

}
