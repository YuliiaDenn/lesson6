package lesson4;

import java.util.TreeSet;

public class School {

	public static void main(String[] args) {

		PersonComparator pcomp = new PersonComparator();
		TreeSet<Person> student = new TreeSet<Person>(pcomp);

		student.add(new Person("Trocenko Ben"));
		student.add(new Person("Kosh Ivan"));
		student.add(new Person("Show Nik"));
		student.add(new Person("Tuz Olga"));

		System.out.println("All students: ");

		for (Person p : student) {
			System.out.println(p);
		}

		System.out.println();
		System.out.println("Such a student is at school: " + student.contains(new Person("Tuz Olga")));

	}

}
