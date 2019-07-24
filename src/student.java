//***data abstraction***//
public class student {
//attribute
    protected String studentId;
    protected String studentName;
    protected String faculty;
    protected String major;
//method
    public void enrollment(String studentId) {
        System.out.println(studentId + "enrollment");
    }

    public void payment(String studentId) {
        System.out.println(studentId + "payment(Package)");
    }

    public void addCourse(String studentId) {
        System.out.println(studentId + "addCourse");
    }

    public void dropCourse(String studentId) {
        System.out.println(studentId + "dropCourse");
    }

    public static void main(String[] args) {
        student mat = new student();
        mat.studentId = "594234054";
        mat.studentName = "asmat";
        mat.faculty = "Science and technology";
        mat.major = "Computer Science";

        System.out.println("ID : " + mat.studentId);
        System.out.println("Name : " + mat.studentName);
        System.out.println("Faculty : " + mat.faculty);
        System.out.println("Majer : " + mat.major);
//call all methods
        mat.enrollment(mat.studentId);
        mat.payment(mat.studentId);
        mat.addCourse(mat.studentId);
        mat.dropCourse(mat.studentId);
    }

 }//end class
