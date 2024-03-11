package Ejercicio3;

import java.time.LocalDate;

public class Alumno extends Persona{
    private static final int MAYORIA_EDAD = 18;
    private LocalDate fechaNac;

    public Alumno(String nombre, LocalDate fecha) {
        super(nombre);
        fechaNac = fecha;
    }

    @Override
    public void sendMensaje(Persona receptor, String mensaje) throws MensajeException{
        LocalDate fechaMin = LocalDate.now().minusYears(MAYORIA_EDAD);
        //if (receptor.getClass().equals(Alumno.class) && fechaNac.isAfter(fechaMin)){
        if (receptor instanceof Alumno && fechaNac.isAfter(fechaMin)){
            throw new MensajeException("Los alumnos menores de edad no pueden enviar mensaje a otros alumnos");
        }
        super.sendMensaje(receptor, mensaje);
    }
}
