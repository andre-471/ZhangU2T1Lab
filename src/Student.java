public class Student {
    private String name;
    private double gpa;
    private double height;
    public Student(String n, double g, double h) {
        name = n;
        gpa = g;
        height = h; // in inches
    }
    public void info() {
        System.out.println("This person's name is " + name);
        System.out.println("This person's GPA is " + gpa);
        System.out.println("This person's height is " + (int) (height / 12) + " ft " + height % 12 + " in");
    }

    public void ifFailing() {
        if (gpa >= 65) {
            System.out.println(name + " is not currently failing");
        } else {
            System.out.println(name + " is currently failing");
        }
    }
}
