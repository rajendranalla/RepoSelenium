package javaBasics;

import java.util.Comparator;
import java.util.TreeSet;

class Employee implements Comparable<Object> {

	String name;
	int eid;

	Employee(String name, int eid) {
		this.name = name;
		this.eid = eid;
	}

	public String toString() {
		return name + " -- " + eid;
	}

	@Override
	public int compareTo(Object o) {

		int eid = this.eid;
		Employee e = (Employee) o;
		int eid2 = e.eid;

		if (eid < eid2)
			return -1;
		else if (eid > eid2)
			return 1;
		else
			return 0;
	}
}

 class ComparableAndComparator {

	public static void main(String[] args) {

		Employee e1 = new Employee("Jr NTR", 10);
		Employee e2 = new Employee("Mahesh", 80);
		Employee e3 = new Employee("Nani", 60);
		Employee e4 = new Employee("Vijay", 90);
		Employee e5 = new Employee("Mahesh", 80);

		TreeSet<Employee> ts1 = new TreeSet<Employee>();

		ts1.add(e1);
		ts1.add(e2);
		ts1.add(e3);
		ts1.add(e4);
		ts1.add(e5);

		System.out.println(ts1);

		@SuppressWarnings({ "unchecked" })
		TreeSet<Employee> ts2 = new TreeSet<Employee>(new MyComparator5());

		ts2.add(e1);
		ts2.add(e2);
		ts2.add(e3);
		ts2.add(e4);
		ts2.add(e5);

		System.out.println(ts2);

	}

	@SuppressWarnings("rawtypes")
	static class MyComparator5 implements Comparator {

		@Override
		public int compare(Object o1, Object o2) {

			Employee e1 = (Employee) o1;
			Employee e2 = (Employee) o2;
			String s1 = e1.name;
			String s2 = e2.name;
			return s1.compareTo(s2);
		}
	}
}
