public class CatTest {
    public static void main(String[] args) {
        Main Cat1 = new Main("Domestic cat", 5, "Human friendly", 4.5, "Black stripes with brown background");
        Main Cat2 = new Main("Mountain cat", 1, "Unpredictable, dangerous to human", 8.2, "pale gray in winter and darker brown in summer");

        Cat1.displayInfo();
        System.out.println();
        Cat2.displayInfo();
    }
}