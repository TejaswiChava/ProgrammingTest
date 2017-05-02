

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Quadratic.Ipair;
import Quadratic.Pair;

public class PairTest {

	@Test
	public void test() {
		Ipair ipair=new Pair();
		Pair pair=ipair.solveQuadratic(1,3,0);
		double x1=pair.getX();
		double x2=pair.getY();
		assertEquals(0,x1,0);
		assertEquals(-3,x2,0);
		
	}
	public void test2() {
		Ipair ipair=new Pair();
		Pair pair=ipair.solveQuadratic(2,6,0);
		double x1=pair.getX();
		double x2=pair.getY();
		assertEquals(0,x1,0);
		assertEquals(-3,x2,0);
		
	}
	public void test3() {
		Ipair ipair=new Pair();
		Pair pair=ipair.solveQuadratic(3,9,1);
		double x1=pair.getX();
		double x2=pair.getY();
		assertEquals(0,x1,0);
		assertEquals(-3,x2,0);
		
	}

}
