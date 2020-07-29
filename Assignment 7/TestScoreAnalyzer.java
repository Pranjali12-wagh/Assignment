package Demo;

import java.util.Scanner;

public class TestScoreAnalyzer {

	public static void main(String[] args) {
		ScoreAnalyzer sa=new ScoreAnalyzer();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of Players :");
		int no=sc.nextInt();
		System.out.println("Enter Runs");
		for(int i=0;i<no;i++)
		{
			sa.addRunsToList(sc.nextInt());
		}
		
		
		System.out.println("\nRunrate: "+sa.calcRunRate());
		System.out.println("Lowest Runs:"+ sa.lowestRunsScored());
		System.out.println("Count of player who batted:"+no);
		sc.close();
		sa.displayRuns();
	}

}