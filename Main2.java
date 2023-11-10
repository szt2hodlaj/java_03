

class Person2 {
    private String name;
    private int age;
    private String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void introduce() {
        System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender + ".");
    }

    public String getName() {
        return name;
    }
}

class Mentor extends Person {
    private String level;

    public Mentor(String name, int age, String gender, String level) {
        super(name, age, gender);
        this.level = level;
    }

    public Mentor() {
        super("Jane Doe", 30, "female");
        this.level = "intermediate";
    }

    public void getGoal() {
        System.out.println("Educate brilliant junior software developers.");
    }

    @Override
    public void introduce() {
        System.out.println("Hi, I'm " + getName() + ", a " + getAge() + " year old " + getGender() + " " + level + " mentor.");
    }
}

public class Main2 {
    public static void main(String[] args) {
        Mentor juniorMentor = new Mentor("John Smith", 35, "male", "junior");
        Mentor defaultMentor = new Mentor();

        juniorMentor.introduce();
        juniorMentor.getGoal();
        defaultMentor.introduce();
        defaultMentor.getGoal();
    }
}



