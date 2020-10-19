import java.util.Scanner;

public class Pyramidpattern {

	public static void main(String[] args) {
		System.out.println("Enter the n value");
		Scanner sc=new  Scanner(System.in);
		int n= sc.nextInt();
		for (int k=0;k<=n;k++)
			
		for(int i=1;i<=n-i;i++) {
			
			for(int j=1;j<=i;j++)
				System.out.print("* ");
			
		}
		System.out.println(" ");

	}

}
