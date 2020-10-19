import java.util.Scanner;

public class Primenumber {

	public static void main(String[] args) {
	System.out.println("Enter the number ");
	Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
   
    while (n!=0)
    {
    	for(int i=2;i<n;i++)
    	{
    		if (n%i==1)
    		{
    			System.out.println("yes");
    		}
    		
    	  else
    		{
    			System.out.println("No");
    	}
    
    	}

}
}
}