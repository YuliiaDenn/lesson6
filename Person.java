package lesson4;

public class Person  {

	private String name;

	Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Student [name: " + name + "]";
	}

	
	
}
