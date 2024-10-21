package ch.hslu.sw04;

public class Line {
    private Point start;
    private Point end;

    public Line(int x1, int y1, int x2, int y2) {
        this.start = new Point(x1, y1);
        this.end = new Point(x2, y2);
    }

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public Point getStart() {
        return new Point(start.getX(), start.getY());
    }

    public Point getEnd() {
        return new Point(end.getX(), end.getY());
    }

    public void setStart(Point start) {
        this.start = start;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public void setStart(int x, int y) {
        this.start.setX(x);
        this.start.setY(y);
    }

    public void setEnd(int x, int y) {
        this.end.setX(x);
        this.end.setY(y);
    }
}