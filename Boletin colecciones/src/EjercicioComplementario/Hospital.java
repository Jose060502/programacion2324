package EjercicioComplementario;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Hospital {

    private static int ticket = 1;
    LinkedList<Paciente> pacientes;

    public Hospital() {
        this.pacientes = new LinkedList<>();
    }

    public void anadirPaciente(Paciente paciente){
        Iterator<Paciente> iterator = pacientes.iterator();
        int posicion = 0;
        boolean posEncontrada = false;

        while (iterator.hasNext() && !posEncontrada){
            Paciente paciente1 = iterator.next();
            if (paciente.compareTo(paciente1) < 0){
                posEncontrada = true;
            }else{
                posicion++;
            }

        }
        pacientes.add(posicion, paciente);
    }

    public LinkedList<Paciente> listadoPacientesPorPrioridad(){
        return (LinkedList<Paciente>)pacientes.clone();
    }

    public Paciente atenderPaciente(){
        return pacientes.poll();
    }

    public List<Paciente> listadoPacientesEdad(){
        return pacientes.stream().sorted((p1, p2) -> p2.getEdad() - p1.getEdad()).toList();
    }

    public String pacientes(){
        String pacientes = "hola";
        return pacientes;
    }
}
