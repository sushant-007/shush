import java.util.Scanner;

public class Noofdigits {

	public static void main(String[] args) {
		System.out.println("Enter the number");
	Scanner sc= new Scanner(System.in);
	int value1 = sc.nextInt();
	int counter =0;
	while(value1 != 0) {
		value1=value1/10;
		counter = counter + 1;
		
		
	}
	System.out.println(counter);
	

	}

}
