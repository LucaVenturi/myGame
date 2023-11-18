package mygame.model.api;

import java.util.List;

public interface Room {
    void addGameObject(GameObject gameObject);
    void removeGameObject(GameObject gameObject);
    void updateState(long elapsedTime);
    List<GameObject> getAllGameObjects();
}
