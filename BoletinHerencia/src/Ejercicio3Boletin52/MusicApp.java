package Ejercicio3Boletin52;

public class MusicApp {
    public static void startMusic(MusicPlayer [] players){
        for (MusicPlayer player : players){
            if(player instanceof OnlineMusicPlayer){
                ((OnlineMusicPlayer) player).stream();
            }
            if(player instanceof OfflineMusicPlayer){
                ((OfflineMusicPlayer) player).load();
            }
            player.play();
            player.stop();
        }
    }

    public static void main(String[] args) {
        MusicPlayer[] players = {new Spotify(), new ITunes(), new MP3Player()};

        startMusic(players);
    }
}
