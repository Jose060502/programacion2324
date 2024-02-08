package Examen2122;

public  abstract class FicheroTexto extends Fichero implements Convertible {
    private String[] parrafos;

    public FicheroTexto(String nombre, String[] parrafos) {
        super(nombre);
        this.parrafos = parrafos;
    }

    //Cada caracter suponemos que ocupa un byte
    public long getSize(){
        long acum = 0;
        for(int i = 0; i < parrafos.length; i++){
            acum += parrafos[i] == null ? 0 : parrafos[i].length();
        }
        return acum;
    }

    public String[] getParrafos() {
        return parrafos;
    }

    @Override
    public String convertir() {

        StringBuilder guardar = new StringBuilder();

        for(int i = 0; i < parrafos.length; i++){
            if (parrafos[i] != null) {
                guardar.append(parrafos[i]);
            }
        }
        return guardar.toString();
    }
}
