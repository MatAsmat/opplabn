package chap4;

import java.util.ArrayList;
import java.util.Scanner;

public class SaleCommissionArray {

    static void printMenu() {
        System.out.println("---Menu---");
        System.out.println("0 : Exit");
        System.out.println("1 : Sale Information Entry");
        System.out.println("2 : Commission Summary");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu = 0;
        ArrayList<SaleMan> list = new ArrayList<SaleMan>();
        do {
            printMenu();
            System.out.println("Enter Menu[0,1,2] : ");
            menu = sc.nextInt();
            switch (menu) {
                case 1:
                    SaleMan sale = new SaleMan();
                    System.out.print("Enter ID : ");
                    String id = sc.next();
                    System.out.print("Enter name : ");
                    String name = sc.next();
                    System.out.print("Enter sername : ");
                    String sername = sc.next();
                    System.out.print("Enter Saleclass : ");
                    int saleClass = sc.nextInt();
                    System.out.print("Enter Saletotal : ");
                    double saleTotal = sc.nextDouble();
                    sale.setId(id);
                    sale.setName(name);
                    sale.setSername(sername);
                    sale.setSaleClass(saleClass);
                    sale.setSaleTotal(saleTotal);
                    list.add(sale);
                   
                break;
                case 2:
                    System.out.println("show Data");
                    int ac = 0;
                    int tt =0;
                   // tt = saleTotal+saleTotal;
                    int co = 0;
                    for (int i = 0; i < list.size(); i++) {
                        SaleMan sm = list.get(i);
                        System.out.println("ID : "+sm.getId()+ "\tName : "+sm.getName()+ "\tSername : "+sm.getSername()+
                                "\tPosition : "+sm.getSaleClass()+"\tSalary : "+sm.getSaleTotal());
                        ac++;
                        tt++;
                       
                       
                    }
                      System.out.println("Summary");
                        System.out.println("Sale Count : "+ac);
                        System.out.println("Sale Total : "+tt);
                        System.out.println("Commission Total : ");
                    break;
            }
        } while (menu != 0);
    }
}
