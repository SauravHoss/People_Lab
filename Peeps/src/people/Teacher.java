package people;

public class Teacher extends Person
{
	private String subject;
	private String title;
	
	public Teacher(String firstName, String familyName, int age, String gender, String subject, String title)
	{
		super(firstName, familyName, age, gender);
		this.subject = subject;
		this.title = title;
	}

	public String getSubject()
	{
		return subject;
	}

	public void setSubject(String subject)
	{
		this.subject = subject;
	}

	public String getTitle()
	{
		return title;
	}

	public void setTitle(String title)
	{
		this.title = title;
	}
	

}
