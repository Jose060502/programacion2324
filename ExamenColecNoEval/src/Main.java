public class Main {
    public static final String TOKEN_FIN = "fin";
    public static void main(String[] args) {
        Restaurante r = new Restaurante();
    }

    private static void nuevaReceta() throws RestauranteException {
        String nombre = MiEntradaSalida.leerCadena("Nombre de la receta");
        double duracion = MiEntradaSalida.leerDoublePositivo("Duracion de la receta");

        Plato plato = new Plato(nombre, duracion);
        String cadena = null;
        int cantidad;
        do {
            cadena = MiEntradaSalida.leerCadena("Introduce el nombre del ingrediente");
            if (!cadena.equals(TOKEN_FIN)) {
                cantidad = MiEntradaSalida.leerEnteroPositivo("Introduzca la cantidad del ingrediente");
                plato.nuevoIngrediente(cadena, cantidad);
            }
        }while(!cadena.equals(TOKEN_FIN));

        do {
            cadena = MiEntradaSalida.leerCadena("Introduce el paso a seguir");
            if (!cadena.equals(TOKEN_FIN)){
                plato.nuevoPaso(cadena);
            }
        }while(!cadena.equals(TOKEN_FIN));

        //TODO: Añadir la receta al menu


    }
}
