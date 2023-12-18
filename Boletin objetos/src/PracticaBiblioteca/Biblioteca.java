package PracticaBiblioteca;

import java.util.Arrays;

public class Biblioteca {
    public static final int MAX_USUARIOS = 2;
    public static final int MAX_LIBROS = 2;
    public static final int NUM_MAX_PRESTAMO = 5;
    private String nombre;
    private Libro[] libros;
    private Usuario[] usuarios;

    private final Préstamo[] prestamos;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new Libro[MAX_LIBROS];
        this.usuarios = new Usuario[MAX_USUARIOS];
        this.prestamos = new Préstamo[NUM_MAX_PRESTAMO];
    }

    public void altaSocio(Usuario u) throws BibliotecaException {

        if(existeUsuario(u)){
            throw new BibliotecaException("Ya existe un usuario con este dni");
        }
        int cuentaUsuarios = cuentaUsuarios();
        if (cuentaUsuarios >= MAX_USUARIOS){
            throw new BibliotecaException("No podmeos admitir mas usuarios");
        }
        u.setNumSocio(cuentaUsuarios() + 1);

        for(int i = 0; i < usuarios.length; i++){
            if (usuarios[i] == null){
                usuarios[i]=u;
                break;
            }
        }
    }

    public boolean existeUsuario(Usuario u){
        boolean encontrado = false;

        for (int i = 0; i < usuarios.length && !encontrado; i++){
            if (u.equals(usuarios[i])){
                encontrado = true;
            }
        }
        return encontrado;
    }

    public int cuentaUsuarios(){
        int contador = 0;
        for (int i = 0; i < usuarios.length; i++){
            if (usuarios[i] != null){
                contador++;
            }
        }
        return contador;
    }
    public void realizarPrestamo(Usuario u, Libro l) throws BibliotecaException {
        /**
         * 1 No repetir 2 veces el mismo prestamo a la vez
         * 2.Disponibilidad del libro
         * 3.No superar el numero maximo de prestamos simultaneos
         */
        if (l.getEjemplaresDisponibles()== 0){
            throw new BibliotecaException("No hay más ejemplares");
        }
    }
    public int getNumPrestamosActivosUsuario(Usuario u){
        int contadorPretamos = 0;
        for (int i = 0; i < prestamos.length; i++){
            if(prestamos[i] == null){
                break;
            }
            if (prestamos[i] != null && prestamos[i].getUsuario().equals(u) && prestamos[i].estaActivo()){
                contadorPretamos++;
            }
        }
        return contadorPretamos;
    }

    public void agregarNuevoLibro(Libro l) throws BibliotecaException {
        if (existeLibro(l)){
            throw new BibliotecaException("Este libro ya esta dado de alta");
        }
        if (cuentaLibros() == MAX_LIBROS){
            throw new BibliotecaException("No podemos admitir mas libros");
        }
        for(int i = 0; i < libros.length; i++){
            if (libros[i] == null){
                libros[i]=l;
                break;
            }
        }
    }
    public boolean existeLibro(Libro l){
        boolean encontrado = false;

        for (int i = 0; i < libros.length && !encontrado; i++){
            if (l.equals(libros[i])){
                encontrado = true;
            }
        }
        return encontrado;
    }
    public int cuentaLibros(){
        int contador = 0;
        for (int i = 0; i < libros.length; i++){
            if (libros[i] != null){
                contador++;
            }
        }
        return contador;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Biblioteca{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", libros=").append(Arrays.toString(libros));
        sb.append(", usuarios=").append(Arrays.toString(usuarios));
        sb.append('}');
        return sb.toString();
    }
}
