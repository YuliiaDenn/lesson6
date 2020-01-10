package lesson4;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {

	@Override
	public int compare(Person a, Person b) {
		
		return a.getName().compareTo(b.getName());
	}

}
