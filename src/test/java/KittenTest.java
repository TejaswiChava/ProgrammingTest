import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import info.Programs.Ikitten;
import info.Programs.Kitten;
import info.Programs.Person;

public class KittenTest {
	

	@Test
	public void ownerTest() {
		Person person=new Person("Gregor Samsa");
		Ikitten kitten=new Kitten("Bob",person);
		kitten.haveBirthDay();
		String result=kitten.toString();
		assertEquals("Bob the Feline is 1 and belongs to Gregor Samsa",result);
	}
	public void nameTest() {
		Person person=new Person("Gregor Samsa");
		Ikitten kitten=new Kitten("Bob2",person);
		//k.haveBirthDay();
		String result=kitten.toString();
		assertEquals("Bob2 the Feline is 0 and belongs to Gregor Samsa",result);
	}
	public void ageTest() {
		Person person=new Person("Gregor Samsa");
		Ikitten kitten=new Kitten("Jhonson",person);
		kitten.haveBirthDay();
		kitten.haveBirthDay();
		kitten.haveBirthDay();
		kitten.haveBirthDay();
		String result=kitten.toString();
		assertEquals("Jhonson the Feline is 4 and belongs to Gregor Samsa",result);
	}

	}


