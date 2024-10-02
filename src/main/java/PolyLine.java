import java.util.Arrays;
import java.util.Objects;

public class PolyLine {
    Point[] points;

    public PolyLine(Point... points) {
        this.points = points;
    }

    public double length() {
        double sum = 0, len1, len2;

        for (int i = 0; i < points.length - 1; i++) {
            len1 = points[i].x - points[i - 1].x;
            len2 = points[i].y - points[i - 1].y;
            sum += Math.sqrt(len1 * len1 + len2 * len2);
        }

        return sum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PolyLine)) return false;
        PolyLine polyLine = (PolyLine) o;
        for(int i=0;i< points.length;i++){
            if((points[i].x!=polyLine.points[i].x)||(points[i].y!=polyLine.points[i].y)){
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(points);
    }
}