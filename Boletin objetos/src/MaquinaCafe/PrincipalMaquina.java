package MaquinaCafe;

public class PrincipalMaquina {
    public static void main(String[] args){
        int opcionElegida;

        Maquina maq = new Maquina();

        do {
            mostrarMenu();
            opcionElegida = MiEntradaSalida.leerEnteroDeRango("Seleccione una opción", 1, 5);
            switch (opcionElegida){
                case 1:
                    if(maq.puedoServirCafe()){
                        double pago = MiEntradaSalida.leerDoublePositivo("Introduce el pago");
                        try {
                            System.out.println(maq.darCambio(pago, Maquina.PRECIO_CAFE));
                            maq.servirCafe();
                        } catch (MaquinaException e) {
                            System.out.println(e.getMessage());
                        }

                    }else{
                        System.out.println("Producto Agotado");
                    }
                    break;
                case 2:
                    if(maq.puedoServirLeche()){
                        double pago = MiEntradaSalida.leerDoublePositivo("Introduce el pago");
                        try {
                            System.out.println(maq.darCambio(pago, Maquina.PRECIO_LECHE));
                            maq.servirLeche();
                        } catch (MaquinaException e) {
                            System.out.println(e.getMessage());
                        }

                    }else{
                        System.out.println("Producto Agotado");
                    }
                    break;
                case 3:
                    if(maq.puedoServirCafeConLeche()){
                        double pago = MiEntradaSalida.leerDoublePositivo("Introduce el pago");
                        try {
                            System.out.println(maq.darCambio(pago, Maquina.PRECIO_CAFE_LECHE));
                            maq.servirCafeConLeche();
                        } catch (MaquinaException e) {
                            System.out.println(e.getMessage());
                        }

                    }else{
                        System.out.println("Producto Agotado");
                    }
                    break;
                case 4:
                    System.out.println(maq);
                    break;
                case 5:
                    System.out.println("Gracias por su compra, vuelva a visitarnos");
                    break;
            }
        }while(opcionElegida != 5);
    }

    public static void mostrarMenu() {
        System.out.println("Bienvenido a la máquina de cafe , elija la siguiente opción");
        System.out.println("1. Servir café (" + Maquina.PRECIO_CAFE + "euro)");
        System.out.println("2. Servir leche (" + Maquina.PRECIO_LECHE + "euro)");
        System.out.println("3. Servir café con leche (" + Maquina.PRECIO_CAFE_LECHE + "euro)");
        System.out.println("4.Consultar estado de la máquina");
        System.out.println("5. Salir");
    }
}
