//Write a java program to check whether a given number is even or odd?
import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		
		if(num%2 == 0) {
			System.out.println("Number is even");
		}
		else System.out.println("Number is odd");
		sc.close();
	}

}