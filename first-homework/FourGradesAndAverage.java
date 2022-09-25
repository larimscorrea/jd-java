import java.util.Scanner;

public class FourGradesAndAverage {
	public static void main(String[] args) {
		//TODO Auto-generated method stub 
		Scanner gradeOne = new Scanner(System.in);
		System.out.println("Enter an first grade");
		Scanner gradeTwo = new Scanner(System.in);
		System.out.println("Enter an second grade");
		Scanner gradeThree = new Scanner(System.in);
		System.out.println("Enter a third grade");
		Scanner gradeFour = new Scanner(System.in);
		System.out.println("Enter a fourth grade");
		double media = (gradeOne.nextInt() + gradeTwo.nextInt() + gradeThree.nextInt() + gradeFour.nextInt())/4;
		System.out.println("The total media was " +media + ".");
		}
}
