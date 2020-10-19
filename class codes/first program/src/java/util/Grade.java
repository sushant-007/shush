import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		System.out.println("enter the marks of 3 subjects");
	 Scanner sc = new Scanner(System.in);
	 int a = sc.nextInt();
	 int b = sc.nextInt();
	 int c = sc.nextInt();
	 int avg = (a+b+c)/3;
	 if(avg>90 && avg<100)
	 {
		 System.out.println("A");	 
	 }
	 else if(avg>80 && avg<89)
	 {
		 System.out.println("B");
	 }
	 else if(avg>70 && avg<79)
	 {
System.out.println("C");
	}

}
}
