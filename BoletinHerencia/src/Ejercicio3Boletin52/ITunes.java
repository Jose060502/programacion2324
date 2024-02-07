package Ejercicio3Boletin52;

public class ITunes implements OfflineMusicPlayer{
    @Override
    public void play() {
        System.out.println("Playing music on iTunes");
    }

    @Override
    public void stop() {
        System.out.println("Stopping music on iTunes");
    }

    @Override
    public void load() {
        System.out.println("Loading music on iTunes");
    }
}
