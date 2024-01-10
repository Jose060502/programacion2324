public class Ejercicio5 {
    public static void main(String[] args) {
        String textoOriginal = "El lenguaje Java es un lenguaje de alto nivel";
        String palabraBuscar = "lenguaje";
        String palabraReemplazar = "lenguaje de programación";

        String textoModificado = reemplazarPalabra(textoOriginal, palabraBuscar, palabraReemplazar);

        System.out.println("El texto modificado es:");
        System.out.println(textoModificado);
    }

    public static String reemplazarPalabra(String texto, String palabraBuscar, String palabraReemplazar) {
        /**StringBuilder resultado = new StringBuilder();
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
         */
        for (int i = texto.indexOf(palabraBuscar); i != -1; i += palabraReemplazar.length()){

        }
        return string;
    }
}
