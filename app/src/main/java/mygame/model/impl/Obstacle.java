package mygame.model.impl;

import mygame.commons.Point2D;
import mygame.commons.Vector2D;

public class Obstacle extends GameObjectImpl{
    public Obstacle(Point2D point) {
        super(point, Vector2D.ZERO);
    }
}
