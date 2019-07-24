//**constructure**//(default,overloaded)
package chap3;

public class Student {

    private String studentId;
    private String studentName;
    private String faculty;
    private String major;

    public Student() {
    }

    public Student(String studentId) {
        this.studentId = studentId;
    }

    public Student(String studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public Student(String studentId, String studentName, String faculty) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.faculty = faculty;
    }

    public Student(String studentId, String studentName, String faculty, String major) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.faculty = faculty;
        this.major = major;
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println("s1 : " + s1);
        System.out.println("s1 ID: " + s1.studentId);
        System.out.println("s1 Name: " + s1.studentName);
        System.out.println("s1 Faculty: " + s1.faculty);
        System.out.println("s1 Major: " + s1.major);
        System.out.println("---------------------------------");
        
        Student s2 = new Student("594234054");
        System.out.println("s2 : " + s2);
        System.out.println("s2 ID: " + s2.studentId);
        System.out.println("s2 Name: " + s2.studentName);
        System.out.println("s2 Faculty: " + s2.faculty);
        System.out.println("s2 Major: " + s2.major);
        System.out.println("---------------------------------");
        
        Student s3 = new Student("594234054", "asmat");
        System.out.println("s3 : " + s3);
        System.out.println("s3 ID: " + s3.studentId);
        System.out.println("s3 Name: " + s3.studentName);
        System.out.println("s3 Faculty: " + s3.faculty);
        System.out.println("s3 Major: " + s3.major);
        System.out.println("---------------------------------");
        
        Student s4 = new Student("594234054", "asmat", "Science and technology");
        System.out.println("s4 : " + s4);
        System.out.println("s4 ID: " + s4.studentId);
        System.out.println("s4 Name: " + s4.studentName);
        System.out.println("s4 Faculty: " + s4.faculty);
        System.out.println("s4 Major: " + s4.major);
        System.out.println("---------------------------------");
        Student s5 = new Student("594234054", "asmat", "Science and technology", "computer science");
        System.out.println("s5 : " + s5);
        System.out.println("s5 ID: " + s5.studentId);
        System.out.println("s5 Name: " + s5.studentName);
        System.out.println("s5 Faculty: " + s5.faculty);
        System.out.println("s5 Major: " + s5.major);
        System.out.println("---------------------------------");

    }

}//end
