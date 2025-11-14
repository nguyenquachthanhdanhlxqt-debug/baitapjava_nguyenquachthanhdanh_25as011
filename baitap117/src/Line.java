public class Line {
    private Point begin;
    private Point end;
    public Line(Point begin, Point end) {
        this.begin = begin;
        this.end = end;
    }
    public Line(int beginX, int beginY, int endX, int endY) {
        begin = new Point(beginX, beginY);
        end = new Point(endX, endY);
    }
    public String toString() {
        return begin + " " + end;
    }
    public Point getBegin() {
        return begin;
    }
    public Point getEnd() {
        return end;
    }
    public void setBegin(Point begin) {
        this.begin = begin;
    }
    public void setEnd(Point end) {
        this.end = end;
    }
    public int getBeginX() {
        return begin.getX();
    }
    public int getBeginY() {
        return begin.getY();
    }
    public int getEndX() {
        return end.getX();
    }
    public int getEndY() {
        return end.getY();
    }
    public void setBeginX(int beginX) {
        this.begin.setX(beginX);
    }
    public void setBeginY(int beginY) {
        this.begin.setY(beginY);
    }
    public void getBeginXY(int beginX, int beginY, int endX, int endY) {
        begin.setX(beginX);
        begin.setY(beginY);
    }
    public void setEndX(int endX) {
        this.end.setX(endX);
    }
    public void setEndY(int endY) {
        this.end.setY(endY);
    }
    public void geyEndXY(int beginX, int beginY, int endX, int endY) {
        begin.setX(beginX);
        begin.setY(beginY);
    }
    public double getLength() {
        return Math.sqrt(Math.pow( end.getX() - begin.getX(), 2) + Math.pow(end.getY() - begin.getY(), 2));
    }
    public double getGradient() {
        return Math.atan2(end.getY() - begin.getY(), end.getX() - begin.getX());
    }
}
