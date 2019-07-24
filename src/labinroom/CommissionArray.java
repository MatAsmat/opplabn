package labinroom;

import java.util.Scanner;

public class CommissionArray {

    public static void main(String[] args) {
        String str[][] = new String[4][5];
        int count = 0;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter ID : ");
            String id = sc.next();
            System.out.print("Enter name : ");
            String name = sc.next();
            System.out.print("Enter sername : ");
            String sername = sc.next();
            System.out.print("Enter Saleclass : ");
            String saleClass = sc.next();
            System.out.print("Enter Saletotal : ");
            String saleTotal = sc.next();
            str[count][0] = id;
            str[count][1] = name;
            str[count][2] = sername;
            str[count][3] = saleClass;
            str[count][4] = saleTotal;
            count++;
        } while (count < 4);
        for (int i = 0; i < str.length; i++) {
        
            System.out.println(str[i][0] + "\t" + str[i][1] + "\t" + str[i][2] + "\t" + str[i][3] + "\t" + str[i][4]);

        }

    }

}//end class

