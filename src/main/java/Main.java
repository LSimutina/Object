public class Main {
    public static void main(String[] args) {
        Fraction fraction1 = new Fraction(2,5);
        Fraction fraction2 = new Fraction(2,5);
        System.out.println(fraction1.equals(fraction2));
        Fraction fraction3 = fraction2.clone();
        System.out.println(fraction3);
    }
}
