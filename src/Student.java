public class Student {
    String name;
    double gpa;
    double height;
    public Student(String n, double g, double h) {
        name = n;
        gpa = g;
        height = h;
    }
    public void info() {
        System.out.println("This person's name is " + name);
    }

    public void ifFailing() {
        if (gpa >= 65) {
            System.out.println("not fail");
        }
    }
}
