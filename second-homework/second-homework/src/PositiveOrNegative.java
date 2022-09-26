import java.util.Scanner;

// Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo
public class PositiveOrNegative {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1; 
		Scanner number  = new Scanner(System.in);
		
		n1 = number.nextInt();
		
		if(n1>0) {
			System.out.println("The "+n1+" it's positive");
		}else {
			System.out.println("The "+n1+" it's negative");
		}
		

	}
}
