package Examen2122;

public class FicheroBinario extends Fichero{

    private byte[] contenido;

    public FicheroBinario(String nombre, byte[] contenido) {
        super(nombre);
        setContenido(contenido);
    }

    private void setContenido(byte[] contenido) {
        this.contenido = contenido;
    }

    @Override
    public long getSize() {
        return contenido.length;
    }
}
