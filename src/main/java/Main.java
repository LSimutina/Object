public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Point point1 = new Point(2, 5);
        Point point2 = new Point(3, 5);
        Line l1 = new Line(point1, point2);
        Line l2 = new Line(new Point(2,5), new Point(3,5));

        System.out.println(l1.equals(l2));
        Line l3 = (Line) l2.clone();
        System.out.println(l3);
    }
}