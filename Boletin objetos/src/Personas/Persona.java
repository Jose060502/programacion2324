package Personas;
import java.time.LocalDate;
public class Persona {
    public static final char[] LETRAS_DNI = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
    private String nombre;
    private LocalDate fechaNacimineto;
    private int dni;
    private char sexo;
    private float altura;
    private float peso;
    public Persona(String nombre, LocalDate fechaNacimineto, int dni, char sexo, float altura, float peso) {
        this.nombre = nombre;
        this.fechaNacimineto = fechaNacimineto;
        this.dni = dni;
        this.sexo = sexo;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaNacimineto() {
        return fechaNacimineto;
    }

    public int getDni() {
        return dni;
    }

    public char getSexo() {
        return sexo;
    }

    public float getAltura() {
        return altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
    public char getLetraDni(){
        return LETRAS_DNI[dni % 23];
    }
    public float getIMC(){
        return peso/(altura*altura);
    }
}
