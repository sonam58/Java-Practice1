import java.util.Scanner ;

public class PersonInfo
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = input.next();
		System.out.print("Enter your gender: ");
		char Gender = input.next().charAt(0);
		System.out.print("Enter your phone no.: ");
		Long phno = input.nextLong();
		System.out.print("Enter your age in years: ");
		int ageInYears = input.nextInt();
		int ageInDays = ageInYears * 365;
		System.out.println("......................................................");
		System.out.println("My name is: "+name);
		System.out.println("Gender: "+Gender);
		System.out.println("I am about "+ageInDays+ " Days old.");
		System.out.println("and my phone no.is: "+phno);
		
		
	}
}