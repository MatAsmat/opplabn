package labinroom;

public class testLoopFor {

    public static void main(String[] args) {
        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(j);
            }
            System.out.print("\n");
        }
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(j);
            }
            System.out.print("\n");
        }

    }
}



