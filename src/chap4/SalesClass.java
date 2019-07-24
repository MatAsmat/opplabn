package chap4;

import java.util.Scanner;

public class SalesClass {

    public static void main(String[] args) {
        Scanner sa = new Scanner(System.in);
        System.out.print("Please Enter Name : ");
        String name = sa.next();
        System.out.println("Hello Ms. : " + name);
      
        System.out.print("Please Enter Sale Class : ");
        int saleClass = sa.nextInt();
        
        System.out.print("You are Normal Sale : " + saleClass);
        getSaleClassName(saleClass);
        System.out.println("\n");

        System.out.print("Please Enter Sale Total : ");
        double saleTotal = sa.nextDouble();
        switch (saleClass) {
            case 1:
                if (saleTotal < 10000) {
                    System.out.println("Your commission is :" + saleTotal * 0.05);
                } else {
                    System.out.println("Your commission is :" + saleTotal * 0.10);
                }
                break;
            case 2:
                if (saleTotal < 10000) {
                    System.out.println("Your commission is :" + saleTotal * 0.15);
                } else {
                    System.out.println("Your commission is :" + saleTotal * 0.20);
                }
                break;
            case 3:
                if (saleTotal < 10000) {
                    System.out.println("Your commission is :" + saleTotal * 0.25);
                } else {
                    System.out.println("Your commission is :" + saleTotal * 0.30);
                }
                break;
        }
    }

    public static String getSaleClassName(int saleClass) {
        String output = "";
        if (saleClass == 1) {
         output = "Normal Sale " ;
        } else if (saleClass == 2) {
         output = " Sale Leadre";
        } else if (saleClass == 3) {
          output = "Sale Manager";
        }
        return output;
    }  
}
