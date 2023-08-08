package domain;

import java.util.Random;

public class Car {
	private Name name;
	private Position position;
	private static final int INIT_POSITION = 0;

	public Car(String name) {
		this.name = new Name(name);
		this.position = new Position(INIT_POSITION);
	}

	public String getName() {
		return this.name.getName();
	}

	public int getPosition() {
		return this.position.getPosition();
	}

	public void goForward() {
		this.position = position.changePosition();
	}

	public boolean isSamePosition(int maxPosition) {
		return this.position.equals(new Position(maxPosition));
	}
}