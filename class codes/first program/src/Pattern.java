import java.util.Scanner;


public class Pattern {

	public static void main(String[] args) {
		System.out.println("enter the n value");
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int i;
		int j;
		for(i=1;i<=n;i++)
		{
			System.out.println(" ");
			for(j=1;j<=i+1;j++)
				System.out.print(i);
		}
		System.out.print(" ");
		
		
		

	}
 
}
