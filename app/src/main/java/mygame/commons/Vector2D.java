package mygame.commons;

public class Vector2D {

    public static final Vector2D ZERO = new Vector2D(0, 0); 

    private final double x;
    private final double y;

    public Vector2D(final double x, final double y) {
        this.x = x;
        this.y = y;
    }

    public Vector2D(final Vector2D vector) {
        this.x = vector.getX();
        this.y = vector.getY();
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public Vector2D sum(Vector2D vector) {
        return new Vector2D(this.x + vector.getX(), this.y + vector.getY());
    }

    public double getModule() {
        return Math.sqrt(this.x * this.x + this.y * this.y);
    }

    public Vector2D getNormalized() {
        var module = getModule();
        return new Vector2D(this.x / module, this.y / module);
    }

    public Vector2D multiplyByScalar(final double scalar) {
        return new Vector2D(this.x * scalar, this.y * scalar);
    }

    @Override
    public String toString() {
        return "Vector2D [x=" + x + ", y=" + y + "]";
    }
}
