public class Ejercicio5 {
    public static void main(String[] args) {
        String textoOriginal = "El lenguaje Java es un lenguaje de alto nivel";
        String palabraBuscar = "lenguaje";
        String palabraReemplazar = "lenguaje de programación";

        String textoModificado = reemplazarPalabra(textoOriginal + "\n ", palabraBuscar, palabraReemplazar);

        System.out.println("El texto modificado es:");
        System.out.println(textoModificado);
    }

    public static String reemplazarPalabra(String texto, String palabraBuscar, String palabraReemplazar) {
        StringBuilder resultado = new StringBuilder(texto);
        int indiceInicio = 0;

        while (indiceInicio < texto.length()) {
            int indiceFin = texto.indexOf(palabraBuscar, indiceInicio);

            if (indiceFin == -1) {
                resultado.append(texto.substring(indiceInicio));
                break;
            }

            resultado.append(texto.substring(indiceInicio, indiceFin)).append(palabraReemplazar);
            indiceInicio = indiceFin + palabraBuscar.length();
        }

        return resultado.toString();
        /** for (int i = 0; i != 1; i += palabraReemplazar.length()){
         i = resultado.indexOf(palabraBuscar, i);

         if(i != -1){
         resultado.delete(i, i + palabraBuscar.length());
         resultado.insert(i, palabraReemplazar);
         } else{
         //i = -1 - palabraReemplazar.length();
         break;
         }
         }
         return String.valueOf(texto);**/
    }
}
