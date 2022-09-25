import java.util.Scanner;

public class TwoNumbersAndSumup {
	public static void main(String[] args) {
		//TODO Auto-generated method stub 
		Scanner numberOne = new Scanner(System.in);
		System.out.println("Enter an number");
		Scanner numberTwo = new Scanner(System.in);
		System.out.println("Enter an other number");
		double sumup = numberOne.nextInt() + numberTwo.nextInt();
		System.out.println("The number it's informed was " + sumup);
		}
}
