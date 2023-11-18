package mygame.model.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import mygame.model.api.Floor;
import mygame.model.api.Room;

public class FloorImpl implements Floor{

    private final List<Room> rooms;

    public FloorImpl() {
        this.rooms = new ArrayList<>();
    }

	@Override
	public void addRoom(Room room) {
        Objects.requireNonNull(room);
        this.rooms.add(room);
	}

	@Override
	public void updateState(long elapsedTime) {
		this.rooms.stream().forEach( (o) -> o.updateState(elapsedTime));
	}

	@Override
	public List<Room> getAllRooms() {
		return List.copyOf(this.rooms);
	}

	@Override
	public Room getMainRoom() {
		return new RoomImpl(this.rooms.get(0));
	}
    
}
