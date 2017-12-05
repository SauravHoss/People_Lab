package people;

public class Runner 
{
	public static void main(String[] args) 
	{
		
		Classroom XClassroomX = new Classroom(students, teacher);
		System.out.println(students);
		System.out.println(teacher);
//		System.out.println(classAverage);
		
	}


	static String [] firstNames = {"Cleo" + "Etta" + "Kora" + "Remi" + "Mila" + "Anya" + "Bay" + "June" + "Juno" + "Uma" 
									+ "Nora" + "Vera" + "Zadie"};
	static String [] familyNames = {"Caverly" + "Danvers" + "Degray" + "Delgado" + "Devlin" + "Falkov" + "Glen" + "Haze" + "ldine"
									+ "Husher" + "Jensen" + "Lowell"+ "Mayfair" + "Mercier" + "Moreau" + "Ramirez" + "Rye" + "Voge"
									+ "Willoughby"};	
	static String [] title = {"Mr." + "Mrs." + "Dr." + "Miss"};
	static String [] major = {"LAS" + "BioSci" + "Chem" + "Electrical" + "Mechanical" + "Industrial" + "Media" + "College Prep" + ""}; 
	private static Person[] students = new Person[35];
	private static Person teacher;
	
public static String randomStudent() 
	{
	return Student.class.getName() + Student.getGPA();	
	}
public static String randomTeacher()
{
	return Teacher.class.getName() + Teacher.getTitle();
}
}
