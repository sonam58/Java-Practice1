/* Calculate 15% Discount on a price */

import java.util.Scanner;

public class Discount
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the price in $");
		double price = input.nextDouble();
		double discountPrice = price * 0.85;
		System.out.format("your price is $%.2f after 15%% of discount.\n", discountPrice);
	}
}