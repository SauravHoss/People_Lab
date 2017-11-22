package people;

public class Student extends Person
{
	private double GPA;
	private int gradelevel;
	private String Major;
	
	public Student(String firstName, String familyName, int age, String gender, double gPA, int gradelevel, String major) 
	{
		super(firstName, familyName, age, gender);
		GPA = gPA;
		this.gradelevel = gradelevel;
		Major = major;
	}

	public double getGPA() 
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

	public void setMajor(String major) 
	{
		Major = major;
	} 
	
}
