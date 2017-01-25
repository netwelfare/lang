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

	public int hashCode()
	{
		return new HashCodeBuilder(17, 37).append(name).append(age).append(id).toHashCode();
	}

	public String toString()
	{
		return new ReflectionToStringBuilder(this, ToStringStyle.DEFAULT_STYLE).append("name", name).append("age", age)
				.append("id", id).toString();
	}

	public static void main(String[] args)
	{
		Student stu1 = new Student(1, "wxf", 20);
		System.out.println(stu1.toString());
		//		Student stu2 = new Student(1, "wxf", 20);
		//		int rest = stu1.compareTo(stu2);
		//		System.out.println(rest);
		//		System.out.println(stu1.hashCode());
		//		System.out.println(stu2.hashCode());
		//		int temp = HashCodeBuilder.reflectionHashCode(stu1, "name");
		//		System.out.println(temp);

	}
}
