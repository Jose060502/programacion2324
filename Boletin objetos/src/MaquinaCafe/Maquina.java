package MaquinaCafe;
public class Maquina {
    public static final int MAX_CAFE = 50;
    public static final int MAX_LECHE = 50;
    public static final int MAX_VASOS = 80;
    public static final double MONEDERO_INICIAL = 10;
    public static final double PRECIO_CAFE = 1;
    public static final double PRECIO_LECHE = 0.8;
    public static final double PRECIO_CAFE_LECHE = 1.5;

    private int cafeRestantes;
    private int lecheRestantes;
    private int vasosRestantes;
    private double monedero;

    public Maquina(){
        rellenarDepositos();
        monedero = MONEDERO_INICIAL;
    }

    public void rellenarDepositos(){
        cafeRestantes = MAX_CAFE;
        lecheRestantes = MAX_LECHE;
        vasosRestantes = MAX_VASOS;
    }
    public boolean puedoServirCafe(){
        return cafeRestantes > 0 && vasosRestantes > 0;
    }
    public boolean puedoServirLeche(){
        return lecheRestantes > 0 && vasosRestantes > 0;
    }
    public boolean puedoServirCafeConLeche(){
        return cafeRestantes > 0 && vasosRestantes > 0 && lecheRestantes > 0;
    }

    public void servirCafe(){
        System.out.println("Aqui tienes tu cafe");
        cafeRestantes--;
        vasosRestantes--;
    }
    public void servirLeche(){
        System.out.println("Aqui tienes tu leche");
        lecheRestantes--;
        vasosRestantes--;
    }
    public void servirCafeConLeche(){
        System.out.println("Aqui tienes tu cafe con leche");
        cafeRestantes--;
        vasosRestantes--;
        lecheRestantes--;
    }

    public String darCambio(double pago , double precio) throws MaquinaException {
        if(pago == precio){
            monedero = monedero + precio;
           return "Gracias por su compra.";
        } else if (pago > precio && monedero >= pago - precio) {
           monedero = monedero + precio;
            return String.format("Gracias por su compra, recoge tu cambio de %.2f euros", pago - precio);
        } else if (precio > pago) {
            throw new MaquinaException("Pago Insuficiente");
        }else{
            throw new MaquinaException("Disculpe , no tenemos cambio");
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Maquina{");
        sb.append("cafeRestantes=").append(cafeRestantes);
        sb.append(", lecheRestantes=").append(lecheRestantes);
        sb.append(", vasosRestantes=").append(vasosRestantes);
        sb.append(", monedero=").append(monedero);
        sb.append('}');
        return sb.toString();
    }
}
