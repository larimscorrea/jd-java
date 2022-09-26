import java.util.Scanner;

public class PassedOrFailed {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1, n2, n3;
		Scanner number  = new Scanner(System.in);
		
		n1 = number.nextInt();
		n2 = number.nextInt();
		n3 = number.nextInt();
		
		double sumup = n1 + n2 + n3;
		double media = sumup/3; 
		
		if(sumup >= 7) {
			System.out.println("You've passed");
		}else if(sumup<7) {
			System.out.println("You've faleid");
		} else if(sumup==10) {
			System.out.println("You've passed with distinction");
		} else {
			System.out.println("Erro no sistema");
		}
		

	}
}
