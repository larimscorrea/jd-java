
import java.util.Scanner;

public class TwoNumbers {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1,n2;
		Scanner number  = new Scanner(System.in);
		
		n1 = number.nextInt();
		n2 = number.nextInt();
		
		if(n1>n2) {
			System.out.println("The "+n1+" it's biggest that the "+n2);
		}else {
			System.out.println("The "+n2+" it's biggest that the "+n1);
		}
		

	}

}
