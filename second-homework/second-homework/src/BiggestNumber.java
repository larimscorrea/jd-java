import java.util.Scanner;
//Faça um Programa que leia três números e mostre o maior deles.
public class BiggestNumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1, n2, n3; 
		Scanner number  = new Scanner(System.in);
		
		n1 = number.nextInt();
		n2 = number.nextInt();
		n3 = number.nextInt();
		
		if(n1>n2 && n1>n3) {
			System.out.println("The "+n1+" it's the biggest number");
		}if (n2>n1 && n2>n3) {
			System.out.println("The "+n2+" it's the biggest number");
		} else {
			System.out.println("The "+n3+" it's the biggest number");
		}
		

	}
}
