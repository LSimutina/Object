public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Sauce sauce1 = new Sauce("Chili", Spice.VERYSHARP);
        Sauce sauce2 = new Sauce("Red pepper", Spice.SHARP);
        Sauce sauce3 = new Sauce("Bell pepper", Spice.NOTSHARP);

        System.out.println(sauce1);
        System.out.println(sauce2);
        System.out.println(sauce3);
    }
}
