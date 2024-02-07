package Ejercicio1Boletin52;

public class Main {
    public static void main(String[] args) {
        Gamer [] players = {new FPSGamer(), new MOBAGamer(), new SportsGamer()};

        EsportsTournament tournament = new EsportsTournament();
        tournament.startTournament(players);
    }
}
