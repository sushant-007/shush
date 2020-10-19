import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
		System.out.println("Enter year to check whether it is yeap year or not");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		if(year%4==0 && year%400==0 && (year%100)== 0)
		{ 
			System.out.println("leap year");
		}
		
		else
		{
			System.out.println("Not a leap year");
			
		}

	}
 
}
