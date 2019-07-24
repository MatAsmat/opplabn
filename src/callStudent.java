//***encapsulation***//

public class callStudent {

    public static void main(String[] args) {
        student mat = new student();
        mat.studentId = "594234054";
        mat.studentName = "asmat";
        mat.faculty = "Science and technology";
        mat.major = "Computer Science";

        mat.enrollment(mat.studentId);
        mat.payment(mat.studentId);
        mat.addCourse(mat.studentId);
        mat.dropCourse(mat.studentId);
    }
}
