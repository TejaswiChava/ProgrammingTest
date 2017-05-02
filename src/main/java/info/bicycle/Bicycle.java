package info.bicycle;

public class Bicycle implements Ibycycle {
	int currentSpeed;
	boolean isMoving;

	public Bicycle() {
		isMoving = false;
		currentSpeed = 0;
	}

	public Bicycle(int speed) {
		if (speed > 0) {
			isMoving = true;
			currentSpeed = speed;
		} else {
			isMoving = false;
			currentSpeed = 0;
		}
	}

	public void increaseSpeed() {
		if (!isMoving) {
			isMoving = true;
			currentSpeed++;
		}
	}

	public void decreaseSpeed() {
		if (isMoving) {
			currentSpeed--;
		if(currentSpeed==0)
		
			isMoving=false;
		}

	}

	public boolean isMoving() {
		return isMoving;
	}


}
