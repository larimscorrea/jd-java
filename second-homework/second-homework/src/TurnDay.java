import java.util.Scanner;

public class TurnDay {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String turn; 
		Scanner scanner = new Scanner(System.in);
		
		turn=scanner.next();
		
		
		if(turn.equalsIgnoreCase("M")) {
			System.out.println("Good morning");
		}else if(turn.equalsIgnoreCase("A")){
			System.out.println("Good afternoon");
		} else if(turn.equalsIgnoreCase("N")){
			System.out.println("Good night");
		} else {
			System.out.println("Invalid");
		}
		

	}
}
