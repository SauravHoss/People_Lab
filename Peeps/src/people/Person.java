package people;

public abstract class Person
{ 
	private String firstName;
	private String familyName;
	private int age;
	private String gender;
	
	public Person(String firstName, String familyName, int age, String gender)
	{	
		this.firstName = firstName;
		this.familyName = familyName;
		this.age = age;
		this.gender = gender;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() 
	{
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}

	/**
	 * @return the familyName
	 */
	public String getFamilyName() 
	{
		return familyName;
	}

	/**
	 * @param familyName the familyName to set
	 */
	public void setFamilyName(String familyName) 
	{
		this.familyName = familyName;
	}

	/**
	 * @return the age
	 */
	public int getAge() 
	{
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) 
	{
		this.age = age;
	}

	/**
	 * @return the gender
	 */
	public String getGender() 
	{
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) 
	{
		this.gender = gender;
	}

	public String toString()
	{
		return "Person [firstName=" + firstName + ", familyName=" + familyName + ", age=" + age + ", gender=" + gender
				+ "]";
	}


}
