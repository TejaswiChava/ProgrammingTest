package info.Programs;

public class Kitten implements Ikitten {
	String name;
	Person owner;
	int age;

	public Kitten(String name, Person owner) {
		age = 0;
		setName(name);
		setOwner(owner);

	}

	public void setName(String newName) {
		name = newName + " the Feline";
	}

	public void setOwner(Person newOwner) {
		owner = newOwner;
	}

	public String getName() {
		return name;
	}

	public Person getOwner() {
		return owner;
	}

	public int getAge() {
		return age;
	}

	public void haveBirthDay() {
		age++;
	}

	public String toString() {
		return name + " is " + age + " and belongs to " + owner.getName();
	}

}
