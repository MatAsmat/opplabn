
package chap4;

import java.util.ArrayList;
import java.util.Scanner;
public class Array2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu = 0,count=0;
        String id = "";
        String name = "";
        String sername = "";
        int position = 0;
        double salary =0.0;
        ArrayList<Employee> list = new ArrayList<Employee>();//Fix Imports
        do{
            
            System.out.print("Enter Menu[0,1,2] : ");
            menu = sc.nextInt();
            switch (menu){
                case 0:
                    System.out.println("Exit");
                    break;
                case 1:
                    Employee em = new Employee();//สร้างออบเจ็ค
                    System.out.print("Enter ID : ");
                    id = sc.next();
                    em.setId(id);
                    System.out.print("Enter Name : ");
                    name = sc.next();
                    em.setName(name);
                    System.out.print("Enter Sername : ");
                    sername = sc.next();
                    em.setSername(sername);
                    System.out.print("Enter Position : ");
                    position = sc.nextInt();
                    em.setPosition(position);
                    System.out.print("Enter Salary : ");
                    salary = sc.nextDouble();
                    em.setSalary(salary);
                    list.add(em);//ออบเจ็ค em
            
            switch (position) {
                case 1:
                    System.out.println("Manager");
                    break;
                case 2:
                    System.out.println("Assistant manager");
                    break;
                case 3:
                    System.out.println("General");
                    break;
                default:
                    break;
            }

                    case 2:
                    System.out.println("Show Data");
                  
                    for (int i = 0; i < list.size(); i++) {
                        Employee data = list.get(i);
                        System.out.println("ID : "+data.getId()+ "\tName : "+data.getName()+ "\tSername : "+data.getSername()+
                                "\tPosition : "+data.getPosition()+"\tSalary : "+data.getSalary());
                       
                    }
                    break;
            }
            
        }while (menu != 0);
        
    }
    
}//end class
