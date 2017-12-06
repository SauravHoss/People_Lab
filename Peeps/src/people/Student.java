package people;

public class Student extends Person
{
	private static double GPA;
	private int gradelevel;
	private String Major;
	
	public Student(String firstName, String familyName, int age, String gender, double gPA, int gradelevel, String Major) 
	{
		super(firstName, familyName, age, gender);
		Student.GPA = gPA;
		this.gradelevel = gradelevel;
		this.Major = Major;
	}

	public static double getGPA() 
	{
		return GPA; 
	}

	public void setGPA(double gPA) 
	{
		GPA = gPA;
	}

	public int getGradelevel() 
	{
		return gradelevel;
	}

	public void setGradelevel(int gradelevel) 
	{
		this.gradelevel = gradelevel;
	}

	public String getMajor() 
	{
		return Major;
	}

	public void setSubject(String major) 
	{
		Major = major;
	}

	@Override
	public String toString() {
		return "Student [getFirstName()=" + getFirstName() + ", getFamilyName()=" + getFamilyName()  + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}

	
}
