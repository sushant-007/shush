import java.util.Scanner;

public class Sumofevenodd {

	public static void main(String[] args) {
		int sum1=0;
		int sum2=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		int n=sc.nextInt();
		int[] a= new int[n];
		System.out.println("Enter the array elements");
		
		for(int i=0;i<n;i++)
		{
		a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			
		if(a[i]%2==0)
		{
			sum1=sum1+a[i];
			
		}
		else 
		{
			sum2=sum2+a[i];
		}
				

	}
System.out.println(sum1);
System.out.println(sum2);
}
}
