import java.util.Random;

public class Televisor {

    private int width;
    private int heigth;
    private String conexiones;
    private String protocolos;
    private boolean defectuoso;
    private String [][] pantalla;
    public Televisor(int width, int heigth, String conexiones, String protocolos) {
        this.width = width;
        this.heigth = heigth;
        this.conexiones = conexiones;
        this.protocolos = protocolos;
        this.pantalla = new String[width][heigth];

    }

    public boolean inicializarDefectuoso(){
        return false;
    }
    public void setImagen(String[][]imagen){
        this.pantalla = imagen;
    }

    public int getWidth() {
        return width;
    }

    public int getHeigth() {
        return heigth;
    }

    public boolean isDefectuoso() {
        return defectuoso;
    }

    /**
     * En este metodo se comprueba si los dispositivos introducidos son compatibles con el televisor
     * @param dispositivo
     * @return
     * @throws DispositivoNoCompatibleException
     */
    public String conectar(Dispositivo dispositivo) throws DispositivoNoCompatibleException{

        if(conexiones.contains(dispositivo.getConexiones()) || protocolos.contains(dispositivo.getProtocolos())){
            return String.format("Dispositivo %s conectado con el puerto %s usando el protocolo %s", dispositivo.getNombre(), dispositivo.getConexiones(), dispositivo.getProtocolos());
        } else if (!(conexiones.contains(dispositivo.getConexiones())) || protocolos.contains(dispositivo.getProtocolos())){
            return String.format("El dispositivo %s no tiene ninguna conexión compatible", dispositivo.getNombre());
        } else if (conexiones.contains(dispositivo.getConexiones()) || !(protocolos.contains(dispositivo.getProtocolos()))) {
            return String.format("El dispositivo %s no tiene ningún protocolo compatible", dispositivo.getNombre());
        } else {
            throw new DispositivoNoCompatibleException("El dispositivo %s no es compatible con el televisor", dispositivo.getNombre());
        }
    }

    /**
     * Este metedo lo que hace es generar un color para cada pixel que tiene la pantalla
     * @return
     */
    public String getColorPromedio() {
        Random rnd = new Random();
        int colorRojo = 0;
        int colorVerde = 0;
        int colorAzul = 0;
        int pixelesTotales = 0;

        // Este for lo que hace es recorrer la fila para ir rellenando la pantalla de los colores que obtenemos
        for(String [] fila: pantalla){
            for (String color : fila){
                if(color != null){
                    int rojo = Integer.parseInt(color.substring(1,3),16);
                    int verde = Integer.parseInt(color.substring(3,5),16);
                    int azul = Integer.parseInt(color.substring(5,7),16);

                    colorRojo = colorRojo + rojo;
                    colorVerde = colorVerde + verde;
                    colorAzul = colorAzul + azul;
                    pixelesTotales++;

                }
            }
        }
        //Este if lo que hace es comprobar si tiene pixeles y añadirle el color a la imagen
        if (pixelesTotales > 0){
            int rojoPromedio = colorRojo / pixelesTotales;
            int verdePromedio = colorVerde / pixelesTotales;
            int azulPromedio = colorAzul / pixelesTotales;

            return String.format("#%02X%02X%02X" , rojoPromedio, verdePromedio, azulPromedio);
        }
        return null;
    }
}
