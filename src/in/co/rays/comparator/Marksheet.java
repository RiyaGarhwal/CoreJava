package in.co.rays.comparator;

import java.util.Comparator;

public class Marksheet {

	public String name;
	public int id;
	public int marks;

	public Marksheet(String name, int id, int marks) {

		this.name = name;
		this.id = id;
		this.marks = marks;

	}

//	@Override
//	public int compare(Marksheet m1, Marksheet m2) {
//		if (m2.name.compareTo(m1.name) == 0) {
//			if (m1.marks - m2.marks == 0) {
//
//			}
//		}
//		return m1.id - m2.id;
//	}

	public String toString() {
		return name + " " + id + " " + marks;

	}

}
