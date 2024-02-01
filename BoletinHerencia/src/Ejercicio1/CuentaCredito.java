package Ejercicio1;

public class CuentaCredito extends Cuenta {
    public static final double CREDITO_DEFAULT = 100;
    public static final double CREDITO_MAX = 300;
    private double credito;

    public CuentaCredito(double saldo, double credito) throws CuentaException {
        super(saldo);
        setCredito(credito);
    }

    public CuentaCredito(double credito) throws CuentaException {
        setCredito(credito);
    }

    public CuentaCredito() {
        this.credito = CREDITO_DEFAULT;
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) throws CuentaException {
        if (credito > CREDITO_MAX){
            throw new CuentaException("No puedes superar el credito máximo");
        }
        if (credito < 0){
            throw new CuentaException("El credito no puede ser negativo");
        }
        this.credito = credito;
    }

    @Override
    public void ingresarDinero(double dineroAIngresar) throws CuentaException {

    }

    @Override
    public void sacarDinero(double dineroASacar) throws CuentaException {
        if (dineroASacar > getSaldo() + getCredito()){
            throw new CuentaException("Has llegado al limite que puedes sacar");
        }
        if (dineroASacar <= getSaldo()){
            super.sacarDinero(dineroASacar);
        } else{
           dineroASacar -= getSaldo();
           super.sacarDinero(getSaldo());
           this.credito -= dineroASacar;
        }
    }
}
