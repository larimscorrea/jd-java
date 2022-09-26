import java.util.Scanner;

public class SmallestNumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1, n2, n3; 
		Scanner number  = new Scanner(System.in);
		
		n1 = number.nextInt();
		n2 = number.nextInt();
		n3 = number.nextInt();
		
		if(n1<n2 && n3<n2) {
			System.out.println("The "+n2+" it's the smallest number");
		}if (n2<n1 && n3<n1) {
			System.out.println("The "+n1+" it's the smallest number");
		} else {
			System.out.println("The "+n3+" it's the smallest number");
		}
		

	}
}
