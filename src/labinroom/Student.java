package labinroom;

public class Student {

    private String id;
    private String name;
    char grade;

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        if ((grade == 'A') || (grade == 'B') || (grade == 'C') || (grade == 'D') || (grade == 'F')) {
            this.grade = grade;
            System.out.println("=================================================");
            System.out.println("Complete : set grade  is " + grade);
            System.out.println("=================================================");
            System.out.println("Hell, " + id + " " + name + "\nYour grade is " + grade);
        } else {
            System.out.println("Error : not is a grade " + grade);
            
        }
    }

}
