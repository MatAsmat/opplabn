//home work1
package homework;

public class Multiplication {

    public static void main(String[] args) {
        int i,j, a = 0 , t = 13;
        System.out.println("________________________________________Multiplication Table _____________________________________");
        for (i = 1; i <= 12; i++) {
            System.out.print("\t" + i);
        }
        System.out.println("");
        System.out.println("__________________________________________________________________________________________________");
        for (i = 2; i < t; i++) {
            for (j= 1; j < t; j++) {

                if (i != a) {
                    System.out.print(i);
                }
                a = i;
                System.out.print("\t" + i * j);
                if (j == 12) {
                    System.out.println("\n");
                }
            }

        }
    }
}
