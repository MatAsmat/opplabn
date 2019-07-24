//Home work2 type1
package homework;

import java.util.Scanner;

public class Menu {

    public static int number;

    public static void main(String[] args) {
        do {
            System.out.println("------MENU------");
            System.out.println("1 : Normal Letter");
            System.out.println("2 : Register Letter");
            System.out.println("3 : EMS Letter");
            System.out.println("0 : Exit\t");

            Scanner sc = new Scanner(System.in);
            System.out.println("--------------------------------------------------------");
            System.out.print("Please Enter Menu : ");
            number = sc.nextInt();
            if (number==1){
                System.out.println("1.Normal Letter");
            }else if(number==2){
                System.out.println("2.Register Letter");
            }else if(number==3){
                System.out.println("3.EMS letter");
            }
            
            switch (number) {
                case 1:
                    System.out.print("\tEnter Weight(g) : ");
                    int weight = sc.nextInt();
                    if (0 <= weight && weight <= 20) {
                        System.out.println("\tNormal Letter Service Price : 3 baht");

                    } else if (weight <= 100) {
                        System.out.println("\tNormal Letter Service Price : 5 baht");

                    } else if (weight <= 250) {
                        System.out.println("\tNormal Letter Service Price : 9 baht");

                    } else if (weight <= 500) {
                        System.out.println("\tNormal Letter Service Price : 15 baht");

                    } else if (weight <= 1000) {
                        System.out.println("\tNormal Letter Service Price : 25 baht");

                    } else if (weight <= 2000) {
                        System.out.println("\tNormal Letter Service Price : 45 baht");

                    }
                    
                    break;
                case 2:
                    System.out.print("\tEnter Weight(g) : ");
                    int weight1 = sc.nextInt();
                    if (0 <= weight1 && weight1 <= 20) {
                        System.out.println("RegisterLetter Service Price : 16 baht");

                    } else if (weight1 <= 100) {
                        System.out.println("RegisterLetter Service Price : 18 baht");

                    } else if (weight1 <= 250) {
                        System.out.println("RegisterLetter Service Price : 22 baht");

                    } else if (weight1 <= 500) {
                        System.out.println("RegisterLetter Service Price : 28 baht");

                    } else if (weight1 <= 1000) {
                        System.out.println("RegisterLetter Service Price : 38 baht");

                    } else if (weight1 <= 2000) {
                        System.out.println("RegisterLetter Service Price : 58 baht");

                    }
                    break;
                case 3:
                    System.out.print("\tEnter Weight(g) : ");
                    int weight2 = sc.nextInt();
                    if (0 <= weight2 && weight2 <= 20) {
                        System.out.println("EmsLetter Service Price : 27 baht");

                    } else if (weight2 <= 100) {
                        System.out.println("EmsLetter Service Price : 32 baht");

                    } else if (weight2 <= 250) {
                        System.out.println("EmsLetter Service Price : 37 baht");

                    } else if (weight2 <= 500) {
                        System.out.println("EmsLetter Service Price : 47 baht");

                    } else if (weight2 <= 1000) {
                        System.out.println("EmsLetter Service Price : 62 baht");

                    } else if (weight2 <= 2000) {
                        System.out.println("EmsLetter Service Price : 77 baht");

                        break;
                    }
            }
        } while (0 < number && number < 4);
        System.out.println("------EXIT PROGRAM------");

    }
}
