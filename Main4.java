class Student extends Person {
    private String previousOrganization;
    private int skippedDays;

    public Student(String name, int age, String gender, String previousOrganization) {
        super(name, age, gender);
        this.previousOrganization = previousOrganization;
        this.skippedDays = 0;
    }

    public Student() {
        super("Jane Doe", 30, "female");
        this.previousOrganization = "The School of Life";
        this.skippedDays = 0;
    }

    public void introduce() {
        System.out.println("Hi, I'm " + getName() + ", a " + getAge() + " year old " + getGender() +
                " from " + previousOrganization + " who skipped " + skippedDays + " days from the course already.");
    }

    public void skipDays(int numberOfDays) {
        skippedDays += numberOfDays;
    }

    @Override
    public void getGoal() {
        System.out.println("Be a junior software developer.");
    }
}

public class Main4 {
    public static void main(String[] args) {
        Student student1 = new Student("John Smith", 25, "male", "ABC University");
        Student student2 = new Student();

        student1.introduce();
        student1.getGoal();
        student1.skipDays(5);

        student2.introduce();
        student2.getGoal();
        student2.skipDays(3);
    }
}
