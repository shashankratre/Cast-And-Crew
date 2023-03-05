package com.practice4;

import java.util.TreeSet;

class test implements Comparable<test> 
{
	String name;
	int rollno;

	test(String name, int rollno) {
		this.name = name;
		this.rollno = rollno;
	}

	public int compareTo(test t) {
		return rollno > t.rollno ? -1 : 1;
	}
}

public class ComparableTreeSet {

	public static void main(String[] args) {
		TreeSet<test> l1 = new TreeSet<>();

		l1.add(new test("Aarav", 101));
		l1.add(new test("Zuhi", 111));
		l1.add(new test("Prerna", 106));
		l1.add(new test("Avinash", 110));

		for (test tt : l1) {
			System.out.println("\nName : " + tt.name);
			System.out.println("\nRollNo : " + tt.rollno);

		}

	}

}
