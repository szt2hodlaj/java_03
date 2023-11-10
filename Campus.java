public class Campus {
    private String name;
    private int age;
    private String gender;
    private String school;
    private int skippedDays;
    private boolean mentor;
    private String company;
    private int hiredStudents;
    private String goal;

    public Campus(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.school = null;
        this.skippedDays = 0;
        this.mentor = false;
        this.company = null;
        this.hiredStudents = 0;
        this.goal = "Live for the moment";
    }

    public Campus(String name, int age, String gender, String school, int skippedDays, boolean mentor, String company, int hiredStudents, String goal) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.school = school;
        this.skippedDays = skippedDays;
        this.mentor = mentor;
        this.company = company;
        this.hiredStudents = hiredStudents;
        this.goal = goal;
    }

    public String introduction() {
        StringBuilder introductionStr = new StringBuilder("Hi, I'm " + name + ", a " + age + " year old " + gender + ".");

        if (school != null) {
            introductionStr.append(" from ").append(school);
        }

        if (skippedDays > 0) {
            introductionStr.append(" who skipped ").append(skippedDays).append(" days from the course already.");
        }

        introductionStr.append("\nMy goal is: ").append(goal);

        if (mentor) {
            introductionStr.replace(11, 12, "a senior mentor").append("\nMy goal is: Educate brilliant junior software developers.");
        }

        if (company != null) {
            introductionStr.replace(11, 11, "who represents " + company);
            introductionStr.append(" and hired ").append(hiredStudents).append(" students so far.\nMy goal is: Hire brilliant junior software developers.");
        }

        return introductionStr.toString();
    }

    public static void main(String[] args) {
        Campus mark = new Campus("Mark", 46, "male");
        Campus jane = new Campus("Jane Doe", 30, "female");
        Campus john = new Campus("John Doe", 20, "male", "BME", 0, false, null, 0, "Be a junior software developer");
        Campus janeSchool = new Campus("Jane Doe", 30, "female", "The School of Life", 3, false, null, 0, "Be a junior software developer");
        Campus gandhi = new Campus("Gandhi", 148, "male", null, 0, true, null, 0, "Educate brilliant junior software developers");
        Campus janeMentor = new Campus("Jane Doe", 30, "female", null, 0, true, null, 0, "Educate brilliant junior software developers");
        Campus janeGoogle = new Campus("Jane Doe", 30, "female", null, 0, false, "Google", 3, "Hire brilliant junior software developers");
        Campus elonMusk = new Campus("Elon Musk", 46, "male", null, 0, false, "SpaceX", 5, "Hire brilliant junior software developers");

        System.out.println(mark.introduction());
        System.out.println(jane.introduction());
        System.out.println(john.introduction());
        System.out.println(janeSchool.introduction());
        System.out.println(gandhi.introduction());
        System.out.println(janeMentor.introduction());
        System.out.println(janeGoogle.introduction());
        System.out.println(elonMusk.introduction());
    }
}
