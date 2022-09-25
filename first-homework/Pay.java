import java.util.Scanner;

public class Pay {
		public static void main(String[] args) {
			//TODO Auto-generated method stub 
			Scanner payPerHour = new Scanner(System.in);
			System.out.println("How much you win for hour?");
			Scanner hoursPerMonth = new Scanner(System.in);
			System.out.println("How much hours you work for month?");
			double calculate = payPerHour.nextInt() * hoursPerMonth.nextInt();
			System.out.println("The salary it's " + calculate);
		
			}
}
