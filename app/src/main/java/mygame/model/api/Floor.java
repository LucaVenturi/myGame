package mygame.model.api;

import java.util.List;

public interface Floor {
    void addRoom(Room room);
    Room getMainRoom();
    void updateState(long elapsedTime);
    List<Room> getAllRooms();
}
