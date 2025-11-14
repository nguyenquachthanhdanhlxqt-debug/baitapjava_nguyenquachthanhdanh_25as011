public class TestLine {
    public static void main(String[] args) {
        Line l1 = new Line(1, 2, 3, 4);
        System.out.println(l1);

        Point p1 = new Point(2, 2);
        Point p2 = new Point(10, 40);
        Line l2 = new Line(p1, p2);
        System.out.println(l2);
        Line l3 = new Line(p1, p2);
        System.out.println(l3);
        Point p3 = new Point(5, 7);
        Point p4 = new Point(62, 7);
        Line l4 = new Line(p3, p4);
        System.out.println(l4);

    }

}
