

class Person {
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

    public void getGoal() {
        System.out.println("My goal is: Live for the moment!");
    }
}

class Sponsor extends Person {
    private String company;
    private int hiredStudents;

    public Sponsor(String name, int age, String gender, String company) {
        super(name, age, gender);
        this.company = company;
        this.hiredStudents = 0;
    }

    public Sponsor() {
        super("Jane Doe", 30, "female");
        this.company = "Google";
        this.hiredStudents = 0;
    }

    public void introduce() {
        System.out.println("Hi, I'm " + getName() + ", a " + getAge() + " year old " + getGender() + " who represents " + company + " and hired " + hiredStudents + " students so far.");
    }

    public void hire() {
        hiredStudents++;
    }

    @Override
    public void getGoal() {
        System.out.println("Hire brilliant junior software developers.");
    }
}

public class Main {
    public static void main(String[] args) {
        Sponsor sponsor1 = new Sponsor("John Smith", 35, "male", "Microsoft");
        Sponsor sponsor2 = new Sponsor();

        sponsor1.introduce();
        sponsor1.getGoal();
        sponsor1.hire();

        sponsor2.introduce();
        sponsor2.getGoal();
    }
}

class Person {
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

    public void getGoal() {
        System.out.println("My goal is: Live for the moment!");
    }
}
