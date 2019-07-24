//Manager ==> Personnel
package chap6;

public class Manager extends Personnel {

    String name = "Manager";

    @Override
    void printName() {
        System.out.println("I,m " + name + ".");
    }

    void getDepartment() {
        System.out.println("I work in the accounting department.");
    }

}
