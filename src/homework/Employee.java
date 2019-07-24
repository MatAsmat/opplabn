package homework;

import java.util.Scanner;

public class Employee {

    public static void main(String[] args) {
        int length;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number : ");
        length = input.nextInt();

        String[] names = new String[length];

        for (int counter = 0; counter < length; counter++){
            System.out.print("Enter Name : "  + (counter + 1 ));
            names[counter] = input.next();
        }
        input.close();
        
        System.out.println("Show data");
        for(int counter = 0; counter < length; counter++){
            System.out.println(names[counter]);
        }
    }
}//end class
