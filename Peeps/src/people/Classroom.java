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
	
	public String getMajor() 
	{
		return Teacher.getMajor();
	}
	

	@Override
	public String toString() 
	{
		return "Classroom [students=" + Arrays.toString(students) + ", teacher=" + teacher + ", getMajor()="
				+ getMajor() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
}
