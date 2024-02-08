package Examen2122;

public class FicheroTextoPlano extends FicheroTexto implements Representable{
    public FicheroTextoPlano(String nombre, String[] parrafos) {
        super(nombre, parrafos);
    }

    @Override
    public void representar() {
       for (int i = 0; i < getParrafos().length; i++){
           if (getParrafos()[i] != null){
               System.out.println(getParrafos()[i]);
           }
       }
    }
}
