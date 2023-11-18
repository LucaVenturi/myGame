package mygame.model.impl;

import mygame.commons.Point2D;
import mygame.commons.Vector2D;
import mygame.model.api.Entity;

public class EntityImpl extends GameObjectImpl implements Entity{

    // private int HP; //Health Points.
    // private double speed;

	public EntityImpl(Point2D position, Vector2D vector) {
		super(position, vector);
	}
    
}
