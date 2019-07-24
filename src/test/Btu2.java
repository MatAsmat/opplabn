//CORRECT(FINISH)
package test;

import java.util.Scanner;

public class Btu2 {

    public static void main(String[] args) {

        System.out.println("--------------------Menu--------------------");
        System.out.println("0 : Exit");
        System.out.println("1 : Compute Air Condition BTU");
        System.out.println("--------------------------------------------");
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter Menu [0-2] : ");
        int Menu = sc.nextInt();
        if (Menu == 0) {
            System.out.println("----------------Exit program----------------");
        } else if (Menu == 1) {
            Scanner mul = new Scanner(System.in);

            int w, l, sum;
            System.out.print("\tPlease Enter Room Width : ");
            w = mul.nextInt();

            System.out.print("\tPlease Enter Room Long : ");
            l = mul.nextInt();

            System.out.print("\tPlease Enter Room Type (1=ปกติ,2=โดนแดด) : ");
            int Type = sc.nextInt();
            sum = w * l;
            switch (Type) {
                case 1:
                    if (sum >= 12 && sum <= 15) {
                        System.out.println("\nOutput\n\tRoom Area is " + sum + " ตร.ม, Type is  ปกติ  \n\tBTU = 9,000 ");

                    } else if (sum >= 16 && sum <= 20) {
                        System.out.println("\nOutput\n\tRoom Area is " + sum + " ตร.ม, Type is  ปกติ  \n\tBTU = 12,000");

                    } else if (sum >= 24 && sum <= 30) {
                        System.out.println("\nOutput\n\tRoom Area is " + sum + " ตร.ม, Type is  ปกติ  \n\tBTU = 18,000");

                    } else if (sum >= 28 && sum <= 35) {
                        System.out.println("\nOutput\n\tRoom Area is " + sum + " ตร.ม, Type is  ปกติ  \n\tBTU = 21,000");

                    } else if (sum >= 32 && sum <= 40) {
                        System.out.println("\nOutput\n\tRoom Area is " + sum + " ตร.ม, Type is  ปกติ  \n\tBTU = 24,000");

                    } else if (sum >= 35 && sum <= 44) {
                        System.out.println("\nOutput\n\tRoom Area is " + sum + " ตร.ม, Type is  ปกติ  \n\tBTU = 25,000");

                    } else if (sum >= 40 && sum <= 50) {
                        System.out.println("\nOutput\n\tRoom Area is " + sum + " ตร.ม, Type is  ปกติ  \n\tBTU = 30,000");

                    } else if (sum >= 48 && sum <= 60) {
                        System.out.println("\nOutput\n\tRoom Area is " + sum + " ตร.ม, Type is  ปกติ  \n\tBTU = 35,000");

                    } else if (sum >= 64 && sum <= 80) {
                        System.out.println("\nOutput\n\tRoom Area is " + sum + " ตร.ม, Type is  ปกติ  \n\tBTU = 48,000");

                    } else if (sum >= 80 && sum <= 100) {
                        System.out.println("\nOutput\n\tRoom Area is " + sum + " ตร.ม, Type is  ปกติ  \n\tBTU = 80,000");
                        break;
                    }
                case 2:
                    if (sum >= 11 && sum <= 14) {
                        System.out.println("\nOutput\n\tRoom Area is " + sum + " ตร.ม, Type is  ปกติ  \n\tBTU = 9,000 ");

                    } else if (sum >= 14 && sum <= 18) {
                        System.out.println("\nOutput\n\tRoom Area is " + sum + " ตร.ม, Type is  ปกติ  \n\tBTU = 12,000");

                    } else if (sum >= 21 && sum <= 27) {
                        System.out.println("\nOutput\n\tRoom Area is " + sum + " ตร.ม, Type is  ปกติ  \n\tBTU = 18,000");

                    } else if (sum >= 25 && sum <= 32) {
                        System.out.println("\nOutput\n\tRoom Area is " + sum + " ตร.ม, Type is  ปกติ  \n\tBTU = 21,000");

                    } else if (sum >= 28 && sum <= 36) {
                        System.out.println("\nOutput\n\tRoom Area is " + sum + " ตร.ม, Type is  ปกติ  \n\tBTU = 24,000");

                    } else if (sum >= 30 && sum <= 39) {
                        System.out.println("\nOutput\n\tRoom Area is " + sum + " ตร.ม, Type is  ปกติ  \n\tBTU = 25,000");

                    } else if (sum >= 35 && sum <= 45) {
                        System.out.println("\nOutput\n\tRoom Area is " + sum + " ตร.ม, Type is  ปกติ  \n\tBTU = 30,000");

                    } else if (sum >= 42 && sum <= 54) {
                        System.out.println("\nOutput\n\tRoom Area is " + sum + " ตร.ม, Type is  ปกติ  \n\tBTU = 35,000");

                    } else if (sum >= 56 && sum <= 72) {
                        System.out.println("\nOutput\n\tRoom Area is " + sum + " ตร.ม, Type is  ปกติ  \n\tBTU = 48,000");

                    } else if (sum >= 70 && sum <= 90) {
                        System.out.println("\nOutput\n\tRoom Area is " + sum + " ตร.ม, Type is  ปกติ  \n\tBTU = 80,000");
                        break;
                    }
            }
        }

    }
}
