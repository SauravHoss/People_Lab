package people;

public abstract class Teacher extends Person
{
	private static String subject;
	private static String title; 
	
	@SuppressWarnings("static-access")
	public Teacher(String firstName, String familyName, int age, String gender, String subject, String title)
	{
		super(firstName, familyName, age, gender);
		this.subject = subject;
		this.title = title;
	}

	public static String getSubject()
	{
		return subject; 
	}

	@SuppressWarnings("static-access")
	public void setSubject(String subject)
	{
		this.subject = subject;
	}

	public static String getTitle()
	{
		return title;
	}

	public void setTitle(String title)
	{
		this.title = title;
	}

	@Override
	public String toString() {
		return "Teacher [title=" + title + ", getFamilyName()=" + getFamilyName()
				+ ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	

}
