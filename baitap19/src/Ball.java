public class Ball {
    private float x;
    private float y;
    private int radius;
    private float xDelta;
    private float yDelta;
    public Ball(float x, float y, int radius, float xDelta, float yDelta) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.xDelta = xDelta;
        this.yDelta = yDelta;
    }
    public float getX() {
        return x;
    }
    public void setX(float x) {
        this.x = x;
    }
    public float getY() {
        return y;
    }
    public void setY(float y) {
        this.y = y;
    }
    public int getRadius() {
        return radius;
    }
    public void getRadius(int radius) {
        this.radius = radius;
    }


    public float getXDelta() {
        return xDelta;
    }
    public void setxDelta(float xDelta) {
        this.xDelta = xDelta;
    }
    public int setXDelta(float xDelta) {
        this.xDelta = xDelta;
        return radius;


    }
    public float getYDelta() {
        return yDelta;
    }
    public void setYDelta(float yDelta) {
        this.yDelta = yDelta;
    }
    public void move() {
        x += xDelta;
        y += yDelta;
    }
    public void reflectHorizontal() {
        x += xDelta;
    }
    public void reflectVertical() {
        y += yDelta;
    }
    public String toString() {
        return String.format( "Ball[(%.2f,%.2f),speed=(%.2f,%.2f) ]", x, y, xDelta,  yDelta);
    }
}
