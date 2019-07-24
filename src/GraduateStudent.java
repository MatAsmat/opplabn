//***inheritance***//

public class GraduateStudent extends student {

//attribute
    private String studyLevel;
    private String thesisAdviser;

//method
    public void oralExaminination(String studentId) {
        System.out.println(studentId + "oralExaminination");
    }

    public void thesisExaminition(String studentId) {
        System.out.println(studentId + "thesisExaminition");
    }

    public void payment(String studentId) {
        System.out.println(studentId + "payment(Package)");
    }
//set

    public static void main(String[] args) {
        GraduateStudent mat = new GraduateStudent();//การสร้าง object
        //super attribute
        mat.studentId = "5942340544";
        mat.studentName = "John";
        mat.faculty = "Accounting";
        mat.major = "MBA";
        mat.studyLevel = "Master Degree";
        mat.thesisAdviser = "Dr.Martin";
        //myself        
        mat.studyLevel = "Master Degree";
        mat.thesisAdviser = "Dr.Martin";

        //show super attribute
        System.out.println("ID :+gs.studentId");
        System.out.println("Name :+gs.studentName");
        System.out.println("Faculty :+gs.faculty");
        System.out.println("Major :+gs.major");

        //show my attribute
        System.out.println("Level : " + mat.studyLevel);
        System.out.println("Adviser :" + mat.thesisAdviser);

        //call my methods
        mat.oralExaminination(mat.studentId);
        mat.thesisExaminition(mat.studentId);

        //call super methods
        mat.enrollment(mat.studentId);
        mat.payment(mat.studentId);
        mat.addCourse(mat.studentId);
        mat.dropCourse(mat.studentId);
    }

}//end class
