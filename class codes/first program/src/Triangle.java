import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
	System.out.println("Enter the  sides of triangle");
	Scanner sc= new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	int result = a+b+c;
	if(result==180)
	{
		System.out.println("valid");
	}
	else
		System.out.println("invalid");
	

	}

}
