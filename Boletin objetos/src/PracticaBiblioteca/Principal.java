package PracticaBiblioteca;

public class Principal {
    public static void main(String[] args) {
        Biblioteca b = new Biblioteca("Biblioteca");
        Usuario u = new Usuario("Jose", "Seda", "29618135T");
        Usuario u2 = new Usuario("Fran", "Martin", "29685439V");
        Libro l = new Libro("Platero y yo", "Juan Ramon Jimenez", "Burro", 10);
        try {
            b.altaSocio(u);
            b.altaSocio(u2);
            b.agregarNuevoLibro(l);
            System.out.println(b);
        } catch (BibliotecaException e) {
            System.out.println(e.getMessage());
        }
    }
}
