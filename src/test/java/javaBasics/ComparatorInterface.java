package javaBasics;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorInterface {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		TreeSet t11 = new TreeSet(new MyComparator1());
		// TreeSet t2 = new TreeSet();
		/*
		 * By passing Comparator object (here for example, new MyComparator()) JVM will
		 * call Compare() which is meant for Customized Sorting Order i.e., descending
		 * order [20, 15, 10, 5, 0]. If we are not passing Comparator object, then JVM
		 * will call CompareTo() method which is meant for Default Natural Sorting
		 * order. [0, 5, 10, 15, 20]
		 */

		t11.add(10);
		t11.add(0);
		t11.add(15);
		t11.add(5);
		t11.add(20);
		t11.add(20);

		System.out.println(t11);

	}

	@SuppressWarnings("rawtypes")
	static class MyComparator1 implements Comparator {

		public int compare(Object o1, Object o2) {

			Integer I1 = (Integer) o1;
			Integer I2 = (Integer) o2;

			/*
			 * if (I1 < I2) return +1; else if (I1 > I2) return -1; else return 0;
			 */

			// return I1.compareTo(I2);
			return -I1.compareTo(I2);
		}

	}

}
