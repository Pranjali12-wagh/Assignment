package Demo;

import java.util.*;

public class Scorecard {
	public static void main(String args[]) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		Scanner sc = new Scanner(System.in);
		int ar[] = new int[5];
		System.out.println("Scores by players");
		for (int i = 0; i < ar.length; i++)
			ar[i] = sc.nextInt();

		map.put("Lokesh", ar[0]);
		map.put("Suresh", ar[1]);
		map.put("Rahul", ar[2]);
		map.put("Sachin", ar[3]);
		map.put("Dhoni", ar[4]);

		int max = 0, sum = 0;

		for (Map.Entry<String, Integer> sr : map.entrySet()) {
			System.out.print(sr.getKey() + ":");
			System.out.println(sr.getValue());
			if (max < sr.getValue()) {
				max = sr.getValue();
			}
			sum = sum + sr.getValue();
		}
		System.out.println("Total score"+sum);
		
		System.out.println("Highest score"+max);
		
		
		

	}
}