import java.util.Scanner;

public class FOrM {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sex; 
		Scanner scanner= new Scanner(System.in);
		
		sex=scanner.next();
		
		
		if(sex.equalsIgnoreCase("F")) {
			System.out.println("It's feminine");
		}else if(sex.equalsIgnoreCase("M")){
			System.out.println("It's masculine");
		} else {
			System.out.println("Invalid sex");
		}
		

	}
}
