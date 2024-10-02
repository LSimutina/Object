public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Point point1 = new Point(2, 5);
        Point point2 = new Point(3, 5);
        Point point3 = new Point(1, 6);
        Point point4 = new Point(1, 3);

        PolyLine polyLine1 = new PolyLine(point1, point2, point3, point4);
        PolyLine polyLine2 = new PolyLine(new Point(2, 5), new Point(3, 5), new Point(1, 6), new Point(1, 3));

        System.out.println(polyLine1.equals(polyLine2));
    }
}
