//
//Add all the names of our class students randomly to a collection, iterate through them and print.
//Observe that collection is maintaining the order that you add.
//
//
//Add all the names of our class students randomly to a collection, iterate through them and print. 
//Observe that collection keeps these elements in a natural order.
//
//
//Create few instances of Car and add them to a collection. Have Car implements Comparable interface
//and override compareTo() to order them by ascending order of make of the Car.
// Observe the fact that you need to provide the order criteria in compareTo().
//
//
//Create a simple map to store all of our class students’ names and their favorite fruits.
//Try to get their favorite fruit by giving their name. 
//Also, list all the names and their favorite fruits saperately.
//

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class CollectionTest {

	@Test
	public void test() {

		Car car1 = new Car(100, "Satyen", 111, 555);
		Car car2 = new Car(102, "Dinesh", 3545, 321321);
		Car car3 = new Car(101, "Satyen", 32131, 3313);

		Set<Car> set = new HashSet<Car>();

		set.add(car1);
		set.add(car2);
		set.add(car3);

		for (Object car : set) {
			System.out.println(car);
		}

	}

	@Test
	public void test1() {
		List<School> list = new ArrayList<School>();
		list.add(new School("Satyen School", "Badlapur", "Navi Mumbai", 1));
		list.add(new School("Vikram School", "Bandra", " Mumbai", 100));
		list.add(new School("Dinesh School", "Mumbai", "Mumbai", 109));
		list.add(new School("Dinesh School", "Gandhinagaer", "Jhajjar", 111));
		list.add(new School("Vibhu School", "Delhi", "Bhiwani"
				+ "", 3));
		for (Object object : list) {
			System.out.println(object);
		}

	}

	@Test
	public void test2() {
		HashMap<String, String> student = new HashMap<>();
		student.put("Kanak", "Mango");
		student.put("Unnati", "Litchi");
		student.put("Poonam", "Plum");
		student.put("Avi", "Mango");
		student.put("Punam", "Apple");
		student.put("Satyen", "Peach");
		String val = (String) student.get("Kanak");
		System.out.println("Favorite fruit of Kanak is: " + val);
	}

}
