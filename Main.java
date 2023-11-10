import java.util.ArrayList;
import java.util.List;

class Cohort {
    private String name;
    private List<Student> students;
    private List<Mentor> mentors;

    public Cohort(String name) {
        this.name = name;
        this.students = new ArrayList<>();
        this.mentors = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addMentor(Mentor mentor) {
        mentors.add(mentor);
    }

    public void info() {
        System.out.println("The " + name + " cohort has " + students.size() + " students and " + mentors.size() + " mentors.");
    }
}

class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Mentor {
    private String name;

    public Mentor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create a cohort and add students and mentors
        Cohort awesomeCohort = new Cohort("AWESOME");
        awesomeCohort.addStudent(new Student("Student1"));
        awesomeCohort.addStudent(new Student("Student2"));
        awesomeCohort.addMentor(new Mentor("Mentor1"));
        awesomeCohort.addMentor(new Mentor("Mentor2"));

        // Display cohort information
        awesomeCohort.info();
    }
}
