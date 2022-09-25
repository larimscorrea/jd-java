import java.util.Scanner;

public class SuccessorPredecessor {
	public static void main(String[] args) {
		//TODO Auto-generated method stub 
		Scanner numberOne = new Scanner(System.in);
		System.out.println("Enter an number");
		double successor = numberOne.nextInt() + 1;
		System.out.println("The successor it's " + successor);
		Scanner numberTwo = new Scanner(System.in);
		System.out.println("Enter an other number");
		double predecessor = numberOne.nextInt() - 1;
		System.out.println("The predecessor it's " + predecessor);
		}
}
