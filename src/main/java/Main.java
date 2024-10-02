public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Point point1 = new Point(2,5);
        Point point2 = new Point(2,5);
        System.out.println(point1.equals(point2));
        Point point3 = point2.clone();
        System.out.println(point3);
    }
}
