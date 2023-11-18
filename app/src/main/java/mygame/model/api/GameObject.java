package mygame.model.api;

import mygame.commons.Point2D;
import mygame.commons.Vector2D;

public interface GameObject {
    Point2D getPosition();
    void setPosition(final Point2D position);
    Vector2D getVector();
    void setVector(final Vector2D position);
    void updateState(final long elapsedTime);
}
