//homework3
package homework;

import java.util.Scanner;

public class EmployeeArray {

    public static void main(String[] args) {
        int menu, count = 0;
        int id[] = new int[100];
        String name[] = new String[100];
        String surname[] = new String[100];
        String position[] = new String[100];
        double salary[] = new double[100];
        double bonus[] = new double[100];
        do {
            System.out.println("__________________________________");
            System.out.println("---------------Menu---------------");
            System.out.println("0 : Exit");
            System.out.println("1 : Employee Infromation Entry");
            System.out.println("2 : Employee Summary");
            System.out.println("----------------------------------");
            Scanner input = new Scanner(System.in);
            System.out.print("Please Enter Menu[0-2] : ");
            menu = input.nextInt();
            switch (menu) {
                case 0:
                    System.out.println("---------------Exit---------------");
                    break;
                case 1:
                    Scanner input2 = new Scanner(System.in);
                    System.out.print("Enter ID : ");
                    id[count] = input.nextInt();
                    System.out.print("Enter Name : ");
                    String name2 = input2.nextLine();
                    name[count] = name2;
                    System.out.print("Enter Surname : ");
                    String surname2 = input2.nextLine();
                    surname[count] = surname2;
                    System.out.print("Enter Position Type : ");
                    int posit = input.nextInt();
                    System.out.print("Enter Salary : ");
                    salary[count] = input.nextInt();

                    switch (posit) {
                        case 1:
                            position[count] = "Manager";
                            break;
                        case 2:
                            position[count] = "Assistant manager";
                            break;
                        case 3:
                            position[count] = "General";
                            break;
                        default:
                            break;
                    }

                    switch (posit) {
                        case 1:
                            if (salary[count] < 10000) {
                                bonus[count] = salary[count] * 0.05;
                            } else if (salary[count] >= 10000) {
                                bonus[count] = salary[count] * 0.10;
                            }
                            break;
                        case 2:
                            if (salary[count] < 10000) {
                                bonus[count] = salary[count] * 0.15;
                            } else if (salary[count] >= 10000) {
                                bonus[count] = salary[count] * 0.20;
                            }
                            break;
                        case 3:
                            if (salary[count] < 10000) {
                                bonus[count] = salary[count] * 0.25;
                            } else if (salary[count] >= 10000) {
                                bonus[count] = salary[count] * 0.30;
                            }
                            break;
                    }
                    count++;
                    break;

                case 2:
                    double sum = 0.0;
                    double total = 0;
                    for (int i = 0; i < count; i++) {

                        System.out.println("Show Data");
                        System.out.println("ID : " + id[i] + "\tName : " + name[i] + "\tSurname : " + surname[i]
                                + "\tPosition :" + " " + position[i] + "\tSalary : " + salary[i] + "\tBonus : " + bonus[i]);
                        sum = sum + bonus[i];
                        total = total + salary[i];
                    }
                    System.out.println("____________________________________________________________________________________________________");
                    System.out.println("Summary");
                    System.out.println("Employee Count : " + count);
                    System.out.println("Salary Total : " + total + " Baht");
                    System.out.println("Bonus Total : " + sum + " Baht");
                    break;
            }
        } while (0 < menu && menu < 3);
    }
}//end class

