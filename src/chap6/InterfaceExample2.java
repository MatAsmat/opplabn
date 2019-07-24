package chap6;

interface Score {

    public void compute();

    public void save();

}

class Player {

    private String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class FishingGame extends Player implements Game, Score {

    public FishingGame(String name) {
        super(name);
    }

    @Override
    public void start() {
        System.out.println("FishingGame : start()");
    }

    @Override
    public void pause() {
        System.out.println("FishingGame : pause()");
    }

    @Override
    public void toContinue() {
        System.out.println("FishingGame : toContinue()");
    }

    @Override
    public void stop() {
        System.out.println("FishingGame : stop()");
    }

    @Override
    public void play() {
        System.out.println("FishingGame : play()");
    }

    @Override
    public void compute() {
        System.out.println("FishingGame : compute()");
    }

    @Override
    public void save() {
        System.out.println("FishingGame : save()");
    }

}

public class InterfaceExample2 {

    public static void main(String[] args) {
        FishingGame play1 = new FishingGame("Asmat");
        System.out.println("Player : " + play1.getName());
        play1.start();
        play1.stop();
        play1.save();
    }

}
