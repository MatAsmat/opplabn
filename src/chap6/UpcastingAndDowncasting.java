//บทที่6 โพลีมอร์ฟิซึม ==> Personnel, Manager, PolymorphismExample, UpcastingAndDowncasting ;
package chap6;

public class UpcastingAndDowncasting {

    static void display(Personnel[] person) {
        for (int i = 0; i < person.length; i++) {
            person[i].printName();
            person[i].getAddress();
            //person[i].getDepartment(); //compile error
            if (person[i] instanceof Manager) {//แก้ไขcompile error ด้วยคีย์เวิร์ด instanceof
                ((Manager) person[i]).getDepartment();//dowcasting

            }

        }
    }

    public static void main(String[] args) {
        Personnel psArr[] = new Personnel[2];
        psArr[0] = new Manager();
        psArr[1] = new Personnel();
        display(psArr);
    }

}
