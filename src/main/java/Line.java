import java.util.Objects;

class Line {
    Point start, end;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public String toString() {
        return "Line{" +
                "start=" + start +
                ", end=" + end +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Point)) return false;
        Line line = (Line) o;
        return Objects.equals(start, line.start) && Objects.equals(end, line.end);
    }

    @Override
    public int hashCode() {
        return Objects.hash(start, end);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        int xS, xE, yS, yE;
        xS = start.x;
        xE = end.x;
        yS = start.y;
        yE = end.y;
        return new Line(new Point(xS, yS), new Point(xE, yE));
    }
}