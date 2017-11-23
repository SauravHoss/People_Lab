package people;

import java.util.Arrays;

public class Classroom 
{
	Person[] students;
	Person teacher;
	
	public Classroom(Person[] students, Person teacher) 
	{	
		this.students = students;
		this.teacher = teacher;
	}
	
	public double classAverage(Person[] students) 
	{
		double avggpa = 0;
	
		for(int i = 0; i < students.length; i++)
		{
			
			avggpa += Student.getGPA();
		}
		
		return (avggpa/students.length);
	}
	
	public String getSubject() 
	{
		return Teacher.getSubject();
	}
	

	@Override
	public String toString() 
	{
		return "Classroom [students=" + Arrays.toString(students) + ", teacher=" + teacher + ", getSubject()="
				+ getSubject() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
}
