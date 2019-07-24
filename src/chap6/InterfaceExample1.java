package chap6;

abstract class TicTacToeAbst implements Game {

    @Override
    public void start() {
        System.out.println("TicTacToe : start()");

    }

    @Override
    public void pause() {
        System.out.println("TicTacToe : pause()");

    }

    @Override
    public void play() {
        System.out.println("TicTacToe : play()");
    }

}

class TicTacToe extends TicTacToeAbst {

    @Override
    public void toContinue() {
        System.out.println("TicTacToe : toContinue()");

    }

    @Override
    public void stop() {
        System.out.println("TicTacToe : stop()");

    }

}

public class InterfaceExample1 {

    public static void main(String[] args) {
        //new TicTacToeAbst();   error
        TicTacToe tt = new TicTacToe();
        tt.start();
        tt.stop();

    }
}

    
    
    

