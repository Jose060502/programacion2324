package Ejercicio3;

public class Main {
    public static void main(String[] args) {
        try {
            Mago magoA = new Mago("Manolo", TRaza.enano, 14, 18, 21);
            Mago magoB = new Mago("Jaimito", TRaza.elfo, 12, 19, 19);
            Clerigo clerigoC = new Clerigo("Andres", TRaza.humano, 19,14,23, "Antonio");
            System.out.println(magoA);
            System.out.println(magoB);
            System.out.println(clerigoC);

            magoA.aprendeHechizo("Pyro");
            magoA.aprendeHechizo("Aqua");
            magoB.aprendeHechizo("Pyro");

            System.out.println(magoA);
            System.out.println(magoB);
            System.out.println(clerigoC);

            magoA.lanzaHechizo(magoB, "Aqua");
            magoB.lanzaHechizo(magoA, "Pyro");
            clerigoC.curar(magoB);
            magoA.lanzaHechizo(magoB, "Pyro");

            System.out.println(magoA);
            System.out.println(magoB);
            System.out.println(clerigoC);

        } catch (PersonajeException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
