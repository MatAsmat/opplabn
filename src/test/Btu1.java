//INCORRECT 
package test;

import java.util.Scanner;

public class Btu1 {

    public static void main(String[] args) {
        System.out.println("--------Menu---------");
        System.out.println("0 : Exit");
        System.out.println("1 : Compute Air Condition BTU");
        System.out.println("---------------------");
        Scanner Menu = new Scanner(System.in);
        System.out.print("Please Enter Menu [0-2] : ");
        int input = Menu.nextInt();
        if (input == 0) {
            System.out.println("---------Exit program---------");
        } else if (input == 1) {
            Scanner mul = new Scanner(System.in);

            int w, l, sum;

            System.out.print("\tPlease Enter Room Width : ");
            w = mul.nextInt();

            System.out.print("\tPlease Enter Room Long :");
            l = mul.nextInt();

            System.out.print("\tPlease Enter Room Type (1=ปกติ,2=โดนแดด) : ");
            int Type = Menu.nextInt();

            sum = w * l;

            if (sum >= 12 && sum <= 15 || sum >= 11 && sum <= 14) {
                if (Type == 1) {
                    System.out.println("\nOutput\n\tRoom Area is " + sum + " ตร.ม, Type is  ปกติ  \n\tBTU = 9,000 ");
                } else if (Type == 2) {
                    System.out.println("\nOutput\n\tRoom Area is " + sum + " ตร.ม, Type is  โดนแดด  \n\tBTU = 9,000");
                }

            } else if (sum >= 16 && sum <= 20 || sum >= 14 && sum <= 18) {
                if (Type == 1) {
                    System.out.println("\nOutput\n\tRoom Area is " + sum + " ตร.ม, Type is  ปกติ  \n\tBTU = 12,000");
                } else if (Type == 2) {
                    System.out.println("\nOutput\n\tRoom Area is " + sum + " ตร.ม, Type is  โดนแดด  \n\tBTU = 12,000");
                }
            } else if (sum >= 24 && sum <= 30 || sum >= 21 && sum <= 27) {
                if (Type == 1) {
                    System.out.println("\nOutput\n\tRoom Area is " + sum + " ตร.ม, Type is  ปกติ  \n\tBTU = 18,000");
                } else if (Type == 2) {
                    System.out.println("\nOutput\n\tRoom Area is " + sum + " ตร.ม, Type is  โดนแดด  \n\tBTU = 18,000");
                }
            } else if (sum >= 28 && sum <= 35 || sum >= 25 && sum <= 32) {
                if (Type == 1) {
                    System.out.println("\nOutput\n\tRoom Area is " + sum + " ตร.ม, Type is  ปกติ  \n\tBTU = 21,000");
                } else if (Type == 2) {
                    System.out.println("\nOutput\n\tRoom Area is " + sum + " ตร.ม, Type is  โดนแดด  \n\tBTU = 21,000");
                }
            } else if (sum >= 32 && sum <= 40 || sum >= 28 && sum <= 36) {
                if (Type == 1) {
                    System.out.println("\nOutput\n\tRoom Area is " + sum + " ตร.ม, Type is  ปกติ  \n\tBTU = 24,000");
                } else if (Type == 2) {
                    System.out.println("\nOutput\n\tRoom Area is " + sum + " ตร.ม, Type is  โดนแดด  \n\tBTU = 24,000");
                }
            } else if (sum >= 35 && sum <= 44 || sum >= 30 && sum <= 39) {
                if (Type == 1) {
                    System.out.println("\nOutput\n\tRoom Area is " + sum + " ตร.ม, Type is  ปกติ  \n\tBTU = 25,000");
                } else if (Type == 2) {
                    System.out.println("\nOutput\n\tRoom Area is " + sum + " ตร.ม, Type is  โดนแดด  \n\tBTU = 25,000");
                }
            } else if (sum >= 40 && sum <= 50 || sum >= 35 && sum <= 45) {
                if (Type == 1) {
                    System.out.println("\nOutput\n\tRoom Area is " + sum + " ตร.ม, Type is  ปกติ  \n\tBTU = 30,000");
                } else if (Type == 2) {
                    System.out.println("\nOutput\n\tRoom Area is " + sum + " ตร.ม, Type is  โดนแดด  \n\tBTU = 30,000");
                }
            } else if (sum >= 48 && sum <= 60 || sum >= 42 && sum <= 54) {
                if (Type == 1) {
                    System.out.println("\nOutput\n\tRoom Area is " + sum + " ตร.ม, Type is  ปกติ  \n\tBTU = 35,000");
                } else if (Type == 2) {
                    System.out.println("\nOutput\n\tRoom Area is " + sum + " ตร.ม, Type is  โดนแดด  \n\tBTU = 35,000");
                }
            } else if (sum >= 64 && sum <= 80 || sum >= 56 && sum <= 72) {
                if (Type == 1) {
                    System.out.println("\nOutput\n\tRoom Area is " + sum + " ตร.ม, Type is  ปกติ  \n\tBTU = 48,000");
                } else if (Type == 2) {
                    System.out.println("\nOutput\n\tRoom Area is " + sum + " ตร.ม, Type is  โดนแดด  \n\tBTU = 48,000");
                }
            } else if (sum >= 80 && sum <= 100 || sum >= 70 && sum <= 90) {
                if (Type == 1) {
                    System.out.println("\nOutput\n\tRoom Area is " + sum + " ตร.ม, Type is  ปกติ  \n\tBTU = 80,000");
                } else if (Type == 2) {
                    System.out.println("\nOutput\n\tRoom Area is " + sum + " ตร.ม, Type is  โดนแดด  \n\tBTU = 80,000");
                }

            }
        }
    }
}//end class




            


