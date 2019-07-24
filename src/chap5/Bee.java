package chap5;

public class Bee extends Animal {

    public void beathe() {
        System.out.println("Bee : beathe()");
    }

    public static void main(String[] args) {
        Bee b = new Bee();
        System.out.println("Bee is a " + b.name);
        b.grow();
        b.reproduce();

        b.setColor("Yellow");
        System.out.println("Bee is a " + b.getColor());
        b.move();

        b.beathe();
    }

}


