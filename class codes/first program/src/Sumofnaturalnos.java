import java.util.Scanner;

public class Sumofnaturalnos {

	public static void main(String[] args) {
		System.out.println("Enter the number ");
		Scanner sc = new Scanner(System.in);
		int sum=0;
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			sum=sum+i;
		}
        System.out.println(sum);
	}

}
