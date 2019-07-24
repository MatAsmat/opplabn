//homework2 typy2(method)
package homework;
import java.util.Scanner;

public class Menu2 {

    public static int number;

    public static void main(String[] args) {
        do {
            System.out.println("------MENU------");
            System.out.println("0 : Exit\t"); 
            System.out.println("1 : Normal Letter");
            System.out.println("2 : Register Letter");
            System.out.println("3 : EMS Letter");
         

            Scanner sc = new Scanner(System.in);
            System.out.println("--------------------------------------------------------");
            System.out.print("Please Enter Menu [0-3] : ");
            number = sc.nextInt();
            System.out.println("--------------------------------------------------------");
            if (0<=number&&number<=3) {
                System.out.println("" + Menu(number, sc));
            System.out.println("--------------------------------------------------------\n");
            } else {
                System.out.println("----------ERROR---------");
            }
        } while (0 < number && number < 4);

        System.out.println("------END PROGRAM------");
    }

    public static String Menu(int number01, Scanner sc) {
        String output = "";
        switch (number01) {
            case 1:
                System.out.print("/tEnter Weight(g) : ");
                int weight = sc.nextInt();
                output = NormalLetter(weight);
                break;
            case 2:
                System.out.print("/tEnter Weight(g) : ");
                int weight1 = sc.nextInt();
                output = RegisterLetter(weight1);
                break;
            case 3:
                System.out.print("/tEnter Weight(g) : ");
                int weight2 = sc.nextInt();
                output = EmsLetter(weight2);
                break;
        }
        return output;
    }

    public static String EmsLetter(int weight) {
        String output = "";
        if (0 <= weight && weight <= 20) {
            output = "EmsLetter Service Price : 27 baht";
        } else if (weight <= 100) {
            output = "EmsLetter Service Price : 32 baht";
        } else if (weight <= 250) {
            output = "EmsLetter Service Price : 37 baht";
        } else if (weight <= 500) {
            output = "EmsLetter Service Price : 47 baht";
        } else if (weight <= 1000) {
            output = "EmsLetter Service Price : 62 baht";
        } else if (weight <= 2000) {
            output = "EmsLetter Service Price : 77 baht";
        }
        return output;
    }

    public static String RegisterLetter(int weight) {
        String output = "";
        if (0 <= weight && weight <= 20) {
            output = "RegisterLetter Service Price : 16 baht";
        } else if (weight <= 100) {
            output = "RegisterLetter Service Price : 18 baht";
        } else if (weight <= 250) {
            output = "RegisterLetter Service Price : 22 baht";
        } else if (weight <= 500) {
            output = "RegisterLetter Service Price : 28 baht";
        } else if (weight <= 1000) {
            output = "RegisterLetter Service Price : 38 baht";
        } else if (weight <= 2000) {
            output = "RegisterLetter Service Price : 58 baht";
        }
        return output;
    }

    public static String NormalLetter(int weight) {
        String output = "";
        if (0 <= weight && weight <= 20) {
            output = "Normal Letter Service Price : 3 baht";
        } else if (weight <= 100) {
            output = "Normal Letter Service Price : 5 baht";
        } else if (weight <= 250) {
            output = "Normal Letter Service Price : 9 baht";
        } else if (weight <= 500) {
            output = "Normal Letter Service Price : 15 baht";
        } else if (weight <= 1000) {
            output = "Normal Letter Service Price : 25 baht";
        } else if (weight <= 2000) {
            output = "Normal Letter Service Price : 45 baht";
        }
        return output;
    }

}//end