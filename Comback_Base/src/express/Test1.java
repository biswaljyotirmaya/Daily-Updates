package express;

import java.util.ArrayList;
import java.util.Collection;

class User {
	String name;

	User(String name) {
		this.name = name;
	}
}

public class Test1 {
	public static void main(String[] args) {
		Collection<String> strings = new ArrayList<>();
		strings.add("one");
		strings.add("two");
		if (strings.contains("one")) {
			IO.println("one is here");
		}
		if (!strings.contains("three")) {
			IO.println("three is not here");
		}

		User rebecca = new User("Rebecca");
		if (!strings.contains(new Integer(33))) {
			IO.println("Rebecca is not here");
		}
	}

}
