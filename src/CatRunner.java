public class CatRunner {
    public static void main(String[] args) {
        Cat cat1 = new Cat("joe", 47, 204.12);
        cat1.printCatInfo();
        cat1.introduce();

        Cat cat2 = new Cat("bill",2, 10.2);
        cat2.printCatInfo();
        cat2.introduce();
    }
}
