package day24;

public class Pilot implements HondaAc, HondaEngine, HondaSecurity{
    @Override
    public void cool() {
        System.out.println("Pilot uses digital climate AC");
    }

    @Override
    public void run() {
        System.out.println("Pilot runs well");
    }
}
