
    // Java code to illustrate iterating
// over a Collection

import java.util.*;

public class IteratingExample {

	public static void main(String[] args)
	{
		// Create and populate the list
		Collection<String> list = new LinkedList<>();

		list.add("Geeks");
		list.add("for");
		list.add("Geeks");
		list.add("is");
		list.add("a");
		list.add("CS");
		list.add("Students");
		list.add("Portal");

		// Displaying the list
		System.out.println("The list is: " + list);
		Collection<String> list1 = new ArrayList<>();

		list1.add("for");
		list1.add("Geeks");

		list.removeAll(list1);
		System.out.println("The list1 is: " + list);

		// Create an iterator for the list
		// using iterator() method
		Iterator<String> iter = list.iterator();

		// Displaying the values after iterating
		// through the list
		System.out.println("\nThe iterator values" + " of list are: ");
		while (iter.hasNext()) {
			System.out.print(iter.next() + " ");
		}
	}
}

