package ch.hslu.sw04;

public class Main {
    public static void main(String[] args) {
        Line line1 = new Line(0, 0, 3, 4);
        Point start = line1.getStart();
        Point end = line1.getEnd();

        line1.setStart(1, 1);
        line1.setEnd(5, 5);

        Line line2 = new Line(new Point(2, 2), new Point(6, 7));
        line2.setStart(new Point(3, 3));
        line2.setEnd(new Point(8, 8));
    }
}
