public class StudentRunner {
    public static void main(String[] args) {
        Student student1 = new Student("Marc", 62, 69);
        student1.info();
        student1.ifFailing();

        Student student2 = new Student("Joe", 92, 72);
        student2.info();
        student2.ifFailing();
    }
}
