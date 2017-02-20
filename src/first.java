import java.util.Scanner;

public class first {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);

		double attempts;
		double completions;
		double total_yards;
		double touchdown;
		double interceptions;
		
		
		double completions_attempts;
		double yards_attempts;
		double touchdowns_attempts;
		double interceptions_attempts;
		double runner_rating;
		
		System.out.println(
				"Enter  number of passing attempts");
		attempts=scan.nextInt();
				
		System.out.println(
				"Enter the number of completions");
		completions=scan.nextInt();
		
		System.out.println(
				"Enter the number of passing yards");
		total_yards=scan.nextInt();
		
		System.out.println(
				"Enter the number of touchdown passes");
		touchdown=scan.nextInt();
		
		System.out.println(
				"Enter the number of interceptions");
		interceptions=scan.nextInt();
		
	
		completions_attempts=((completions/attempts)-.3)*5;
		
		yards_attempts=((total_yards/attempts)-3)*.25;
		
		touchdowns_attempts=(touchdown/attempts)*20;
		
		interceptions_attempts=2.375-((interceptions/attempts)*25);
		runner_rating=
				((completions_attempts*yards_attempts*touchdowns_attempts*interceptions_attempts)/6)*100;
		
		System.out.println("This quarterbacks passer rating is "+runner_rating+".");
				
	}

}
