/*Home Work4
คลาสหลักของ Counsellor,Parent;*/
package homework;

public class Student {

    private String studentId;
    private String studentName;
    private Counsellor counsellor;
    private Parent parent;

    public Student(String studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Counsellor getCounsellor() {
        return counsellor;
    }

    public void setCounsellor(Counsellor counsellor) {
        this.counsellor = counsellor;
    }

    public Parent getParent() {
        return parent;
    }

    public void setParent(Parent parent) {
        this.parent = parent;
    }

    public void printDetails() {
        System.out.println("StudentId       : 594234054");
        System.out.println("StudentName     : Asmat Saleah");
        System.out.println("Counsellor id   : 185");
        System.out.println("Counsellor Name : Nalinee Inthamano");
        System.out.println("Telephon        : 0889551234");
        System.out.println("Parent Name     : Hama Saleah");
        System.out.println("Address         : 100 Natawee Natawee Songkhla 90000");
        System.out.println("Telephon        : 0831416434");

    }

}
