public class Ejercicio2 {
    public static void main ( String []args){
        int [] miArray = {2,8,35,-3,-2,41,45,-5,-4,46};

        int numNegativos = 0;

        for(int i = 0; i < miArray.length; i++){
            if (miArray[i] < 0 ){
                numNegativos++;
            }
        }
        System.out.println("La cantiadad de numeros negativos en el array es de "+ numNegativos);
    }
}
