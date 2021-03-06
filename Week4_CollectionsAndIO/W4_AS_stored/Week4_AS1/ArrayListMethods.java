package Week4_AS1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class ArrayListMethods {
	// #1
	private static List<String> al = null;

	public ArrayListMethods() {
		al = new ArrayList<String>();
	}
		
	public void add(String string) {
		System.out.println("Adding an element...");
		
		al.add(string);
		System.out.println(al);
	}
	
	// #2-1
	public static void iterator() {
		System.out.println("Iterating ArrayList...");
		
		for(String s : al)
			System.out.println("Today's Color is " + s + "!");
	}
	
	// #2-2: Another way: Iterator
	public static void iterator2() {
		Iterator<String> iterator = al.iterator();
		while(iterator.hasNext()) {
			String str = (String)iterator.next();
			System.out.println("Today's Color is " + str + "!");
		}
	}
	// #3
	public static void updateElement(int i, String string) {
		al.set(i,string);
		
		System.out.println("Element: " + i + "'s color updated to " + string);
		System.out.println(al);
	}
	// #4
	public static void removeElement(int i) {
		al.remove(i);
		
		System.out.println("Element: " + i + " has removed.");
		System.out.println(al);
	}
	// #5
	public static void searchElement(String string) {
		System.out.println("Searching " + string + "...");
		
		if(al.contains(string))
		{
			System.out.println("There is the value in the array");
		}
		System.out.println("The index of " + string + " is " + al.indexOf(string));
	}
	
	// #6
	public static void sortArrayListAscend() {
		System.out.println("Sorting ArraysList in Ascending order...");
		
		Collections.sort(al);
		System.out.println(al);
	}
	
	// #7
	public static void reverseArrayList() {
		System.out.println("Reversing ArrayList...");
		
		Collections.reverse(al);
		System.out.println(al);
	}
	
	// #8
	public static void copyArrayList() {
		System.out.println("Generated new Empty ArrayList...");
		List<String> al_copy = new ArrayList<String>(al.size());
		System.out.println(al_copy);
		System.out.println("Deep copying ArrayList...");
		
	    for (String s : al) {
	        al_copy.add(new String(s));
	    }
	    System.out.println("Copied ArrayList: " + al_copy);
	}
	
	// #9
	public static void compareTwoArrayList(List<Integer> list1, List<Integer> list2) {
		System.out.println("List1: " + list1);
		System.out.println("List2: " + list2);
		
		Set<Integer> list3 = new HashSet<Integer>(list1);
		list3.retainAll(list2);
		System.out.println("Elements they have in common are " + list3);
	}

	public static void appendContentsToAnother() {
		ArrayList<String> apd = new ArrayList<String>();
		System.out.println("Generated new Empty ArrayList...");
		System.out.println(apd);
		
		for(String s : al)
			apd.add(s);
		
		System.out.println("Appended the contents of one ArrayList to new Empty List...");
		System.out.println(apd);
		
	}

	public static void printByforEachLoop() {
		System.out.println("Iterating ArrayList using for loop...");
		al.forEach(s->{
			System.out.println(s);		
		});
	}
	

	
	public <T> ArrayList<T> convertArray(T[] arr){
		
		return new ArrayList<T>(Arrays.asList(arr));
	}
	

	
	
}

