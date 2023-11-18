package mygame.commons;

public class Point2D {

    public static final Point2D ZERO = new Point2D(0, 0);

    private final double x;
    private final double y;

    public Point2D(final double x, final double y) {
        this.x = x;
        this.y = y;
    }

    public static Point2D getZero() {
        return ZERO;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public Point2D sum(Vector2D vector) {
        return new Point2D(this.x + vector.getX(), this.y + vector.getY());
    }

    @Override
    public String toString() {
        return "Point2D [x=" + x + ", y=" + y + "]";
    }

}
