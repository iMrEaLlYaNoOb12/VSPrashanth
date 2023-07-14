package com.vastpro.corejavalabassignmentmain;

import java.util.ArrayList;
import java.util.List;
import com.vastpro.corejavalabassignmentmodel.Person;

public class PersonMain {
	public static void main(String[] args) {
		Person person1 = new Person();

		person1.setName("Naren");
		person1.setAge(22);
		person1.setAddress("Tamil Nadu");
		System.out.println("Displaying using get method...");
		System.out.println(person1.getName() + " " + person1.getAge() + " " + person1.getAddress());
		System.out.println();
		Person person2 = new Person("Lakshmi", 21, "Andhra");
		Person person3 = new Person("Priya", 23, "Punjab");
		Person person4 = new Person("Ganesan", 24, "Kerala");

		List<Person> persons = new ArrayList<Person>();
		persons.add(person1);
		persons.add(person2);
		persons.add(person3);
		persons.add(person4);

		for (Person person : persons) {
			System.out.println(person.getName() + " " + person.getAge() + " " + person.getAddress());

		}
		System.out.println("\nPersons count using constructors : " + Person.count);
	}

}
