package mygame.model.impl;

import mygame.commons.Point2D;
import mygame.commons.Vector2D;
import mygame.model.api.GameObject;

public class GameObjectImpl implements GameObject{

    private static double MOVEMENT_PER_MILLIS = 0.001;

    private Point2D position;
    private Vector2D vector;

    @Override
    public Point2D getPosition() {
        return new Point2D(this.position);
    }

    @Override
    public void setPosition(final Point2D position) {
        this.position = new Point2D(position);
    }

    @Override
    public Vector2D getVector() {
        return new Vector2D(0, 0);
    }

    @Override
    public void setVector(final Vector2D vector) {
        this.vector = new Vector2D(vector);
    }

    @Override
    public void updateState(final long elapsedTime) {
        this.position = this.position.sum(vector.multiplyByScalar(elapsedTime * MOVEMENT_PER_MILLIS));
    }
    
}
