package chap4;

import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name : ");
        String name = sc.next();
        System.out.println("Name is :" + name);

        System.out.print("Enter Age : ");
        int age = sc.nextInt();
        System.out.println("Age is :" + age);
        if (age >= 1 && age <= 11) {
            System.out.println("วัยเด็ก");
        } else if (age >= 12 && age <= 20) {
            System.out.println("วัยรุ่น");
        } else if (age >= 21 && age <= 40) {
            System.out.println("วัยผู้ใหญ่");
        } else if (age >= 41 && age <= 60) {
            System.out.println("วัยกลางคน");
        } else if (age >= 61 && age <= 65) {
            System.out.println("วัยสูงอายุ");
        }

        System.out.print("Enter Salary : ");
        double salary = sc.nextDouble();
        System.out.println("Salary is :" + salary);
        if (salary >= 1 && salary <= 20000) {
            System.out.println("Programmer");
        } else if (salary >= 20001 && salary <= 35000) {
            System.out.println("System Analyst");
        } else if (salary >= 35001 && salary <= 50000) {
            System.out.println("Project Manager");
        } else if (salary >= 50001 && salary <= 70000) {
            System.out.println("Assistant Manager");
        } else if (salary >= 70001) {
            System.out.println("Manager");
        }

        System.out.print("Enter degree");
        int degree = sc.nextInt();
        System.out.println("Degree is :" + degree);

        switch (degree) {
            case 1:
                System.out.println("ปริญญาตรี");
                break;
            case 2:
                System.out.println("ปริญญาโท");
                break;
            case 3:
                System.out.println("ปริญญาเอก");
                break;
            default:
                System.out.println("ไม่ระบุ");
                break;
               
        }
        System.out.println("Name is :" + name+", Age is :" + age+",Salary is :" + salary+", Degree is :" + degree);
    }
}
