package org.apache.commons.lang3.builder;

public class Student implements Comparable<Object>
{
	int id;
	String name;
	int age;

	public Student(int id, String name, int age)
	{
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int compareTo(Object o)
	{
		Student student = (Student) o;
		return new CompareToBuilder().append(this.id, student.id).append(this.name, student.name)
				.append(this.age, student.age).toComparison();
	}

	public static void main(String[] args)
	{
		Student stu1 = new Student(1, "wxf", 20);
		Student stu2 = new Student(1, "fxw", 18);
		int rest = stu1.compareTo(stu2);
		System.out.println(rest);

	}
}
