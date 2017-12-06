package people;
import java.util.Random;

public class Runner 
{
	public static void main(String[] args) 
	{
		
		Classroom Classrooms = new Classroom(students, teacher);
		System.out.println(students);
		System.out.println(teacher);
		System.out.println(Classroom.classAverage);
	}


	private static String [] firstNames = {"Cleo" + "Etta" + "Kora" + "Remi" + "Mila" + "Anya" + "Bay" + "June" + "Juno" + "Uma" 
									+ "Nora" + "Vera" + "Zadie"};
	private static String [] familyNames = {"Caverly" + "Danvers" + "Degray" + "Delgado" + "Devlin" + "Falkov" + "Glen" + "Haze" + "ldine"
									+ "Husher" + "Jensen" + "Lowell"+ "Mayfair" + "Mercier" + "Moreau" + "Ramirez" + "Rye" + "Voge"
									+ "Willoughby"};	
	private static String [] title = {"Mr." + "Mrs." + "Dr." + "Miss"};
	private static String [] major = {"LAS" + "BioSci" + "Chem" + "Electrical" + "Mechanical" + "Industrial" + "Media" + "College Prep" + ""}; 
	private static String [] gender = {"Male" + "Female"};
	private static String [] subject = {"Math" + "Science" + "English" + "LOTE" + "History" + "Engineering"};
	private static Person[] students = new Person[35];
	private static Person teacher;
	
	public static Student randomStudent() 
	{
		int age = (int)Math.random() * 18;
		double GPA = Math.random() *4;
		int gradelevel = (int)(Math.random() *12);
		
		Random r2 = new Random();
		return new Student (firstNames [r2.nextInt(firstNames.length)], familyNames [r2.nextInt(familyNames.length)], age, gender [r2.nextInt(gender.length)], GPA, gradelevel, major [r2.nextInt(major.length)]);
	}
	
	public static Teacher randomTeacher()
	{
		int age = 28;
		
		Random r1 = new Random();;
		return new Teacher(firstNames [r1.nextInt(firstNames.length)], familyNames [r1.nextInt(familyNames.length)],  age, gender [r1.nextInt(gender.length)], subject [r1.nextInt(subject.length)], title [r1.nextInt(title.length)]);
	}

}
