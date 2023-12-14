package PracticaBiblioteca;

public class Biblioteca {
    public static final int MAX_USUARIOS = 2;
    public static final int MAX_LIBROS = 2;
    private String nombre;
    private Libro[] libros;
    private Usuario[] usuarios;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new Libro[MAX_LIBROS];
        this.usuarios = new Usuario[MAX_USUARIOS];
    }

    public void altaSocio(String nombre ,String apellidos ,String dni) throws BibliotecaException {
        Usuario u = new Usuario(nombre, apellidos, dni);
        if(existeUsuario(u)){
            throw new BibliotecaException("Ya existe un usuario con este dni");
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
}
