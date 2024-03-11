package Ejercicio1;

import Ejercicio1.Alumno;
import Ejercicio1.AlumnoException;

import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class Principal {
    public static void main(String[] args){
        Equipo equipo1 = new Equipo("Real Betis");
        Equipo equipo2 = new Equipo("Granada");


        for (int i = 0; i < 10; i++){
            try {
                equipo1.addAlumno(generarAlumno());
            } catch (AlumnoException e) {
                System.out.println("Ejercicio1.Alumno repetido");
            }
            try {
                equipo2.addAlumno(generarAlumno());
            } catch (AlumnoException e) {
                System.out.println("Ejercicio1.Alumno repetido");
            }
        }
        System.out.println("Ejercicio1.Equipo 1");
        mostrarConjuntoPersonas(equipo1.getAlumnos());
        System.out.println("Ejercicio1.Equipo 2");
        mostrarConjuntoPersonas(equipo2.getAlumnos());

        System.out.println("Equi U");
        Equipo equipoU = equipo1.unionEquipos(equipo2);
        mostrarConjuntoPersonas(equipoU.getAlumnos());
        System.out.println("Ejercicio1.Equipo I");
        Equipo equipoI = equipo1.interseccionEquipos(equipo2);
        mostrarConjuntoPersonas(equipoI.getAlumnos());
    }
    public static void mostrarConjuntoPersonas(Set<Alumno> alumnos){
        Iterator<Alumno> it = alumnos.iterator();

        while (it.hasNext()){
            Alumno al = it.next();
            System.out.println(al);
        }
    }

    public static Alumno generarAlumno(){
        String nombre;
        Random r = new Random();
        nombre = "" + r.nextInt(14);

        return new Alumno(nombre, nombre);
    }
}
