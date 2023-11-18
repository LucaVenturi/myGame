package mygame.model.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import mygame.model.api.GameObject;
import mygame.model.api.Room;

class RoomImpl implements Room{

    private final List<GameObject> gameObjects;

    public RoomImpl() {
        this.gameObjects = new ArrayList<>();
    }

    public RoomImpl(final Room room) {
        this.gameObjects = room.getAllGameObjects();
    }

	@Override
	public void addGameObject(GameObject gameObject) {
        Objects.requireNonNull(gameObject);
        this.gameObjects.add(gameObject);
	}

	@Override
	public void removeGameObject(GameObject gameObject) {
		Objects.requireNonNull(gameObject);
        this.gameObjects.remove(gameObject);
	}

	@Override
	public void updateState(long elapsedTime) {
		gameObjects.stream().forEach((o) -> o.updateState(elapsedTime));
	}

	@Override
	public List<GameObject> getAllGameObjects() {
		return List.copyOf(this.gameObjects);
	}
    
}