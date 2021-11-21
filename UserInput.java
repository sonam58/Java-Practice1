import java.util.Scanner;
public class UserInput
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = input.next();
		System.out.print("Enter your age: ");
		int ageInYear = input.nextInt();
		int ageInDays = ageInYear*365;
		
		System.out.format("My name is " + name +" and I am %d years old and which is about %d days.\n ",ageInYear, ageInDays);
	}
}