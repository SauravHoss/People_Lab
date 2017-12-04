package people;

public class Runner 
{
	public static void main(String[] args) 
	{
		String students [] = new String[32];
		Person Teacher = new Teacher(firstNames, familyNames, title);
		Classroom classroomv2 = new Classroom(classAverage);
		
		System.out.println(students);
		System.out.println(Teacher);
		System.out.println(classroomv2.classAverage);
		
	}


	static String [] firstNames = {"Cleo" + "Etta" + "Kora" + "Remi" + "Mila" + "Anya" + "Bay" + "June" + "Juno" + "Uma" 
									+ "Nora" + "Vera" + "Zadie"};
	static String [] familyNames = {"Caverly" + "Danvers" + "Degray" + "Delgado" + "Devlin" + "Falkov" + "Glen" + "Haze" + "ldine"
									+ "Husher" + "Jensen" + "Lowell"+ "Mayfair" + "Mercier" + "Moreau" + "Ramirez" + "Rye" + "Voge"
									+ "Willoughby"};	
	static String [] title = {"Mr." + "Mrs." + "Dr." + "Miss"};
	static String [] major = {"LAS" + "BioSci" + "Chem" + "Electrical" + "Mechanical" + "Industrial" + "Media" + "College Prep" + ""}; 

public String randomStudent() 
	{
	return Student.class.getName() + Student.getGPA();	
	}

}
