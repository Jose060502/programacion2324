package EjercicioComplementario;

import java.util.List;

public class Paciente implements Comparable<Paciente>{

    public static final int MIN_PRIORIDAD = 5;
    public static final int MAX_PRIORIDAD = 1;

    private String dni;
    private String nombre;
    private int edad;
    private int prioridad;
    private int ordenLlegada;

    public Paciente(String dni, String nombre, int edad, int prioridad, int ordenLlegada) throws HospitalException {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        setPrioridad(prioridad);
        this.ordenLlegada = ordenLlegada;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) throws HospitalException {
        if (prioridad < MAX_PRIORIDAD || prioridad > MIN_PRIORIDAD){
            throw new HospitalException("Valor incorrecto");
        }
        this.prioridad = prioridad;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public int compareTo(Paciente otro) {
        if (prioridad - otro.prioridad == 0){
            return ordenLlegada - otro.ordenLlegada;
        }
        return prioridad - otro.prioridad;
    }
}
