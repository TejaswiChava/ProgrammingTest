import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import info.bicycle.Bicycle;
import info.bicycle.Ibycycle;

public class BicycleTest {


	@Test
	public void decreseSpeedTest() {
		Ibycycle b = new Bicycle(2);
		b.increaseSpeed();
		b.decreaseSpeed();
		b.decreaseSpeed();
		b.decreaseSpeed();
		boolean result = b.isMoving();
		assertEquals(false, result);
	}

	public void increaseSpeedTest() {
		Ibycycle b = new Bicycle(-1);
		b.decreaseSpeed();
		b.increaseSpeed();
		b.increaseSpeed();
		boolean result = b.isMoving();
		assertEquals(false, result);

	}

	public void decreaseAndIncreaseSpeedTest() {
		Ibycycle b = new Bicycle(-10);
		b.decreaseSpeed();
		b.increaseSpeed();
		b.increaseSpeed();
		boolean result = b.isMoving();
		assertEquals(false, result);

	}

	public void isMovingTest() {
		Ibycycle b = new Bicycle(0);
		boolean result = b.isMoving();
		assertEquals(false, result);

	}


}
