public class Ejercicio10 {
    public static void main(String[] args) {
        System.out.println(esDireccionValida("http://www.marca.es"));;
    }
    public static boolean esDireccionValida(String direccion){
        String comienzoCorrecto = "http://www";
        String[] direccionDividida = direccion.split("\\.");

        //for (String s : direccionDividida){
        //    System.out.println(s);
        //}
        if (direccionDividida.length != 3){
            return false;
        }
        if (!comienzoCorrecto.equals(direccionDividida[0])){
            return false;
        }
        if (direccionDividida[1].contains(" ")){
            return false;
        }
        if (Character.isDigit(direccionDividida[1].charAt(0))){
            return false;
        }
        if (!direccionDividida[2].equals("es") && !direccionDividida[2].equals("com")){
            return false;
        }
        return true;
    }
}
