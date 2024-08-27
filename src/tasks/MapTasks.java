package tasks;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTasks {
	/*
	 * Q> find Total marks, Avg.Marks and Percentage of following subjects.(Solve
	 * this using Map)
	 * 
	 * T1 T2 T3 T4 TM Avg. Percent Math = 88,78,90,60 Nepali = 70,80,87,69 English=
	 * 90,60,70,80 Computer=99,69,79,89 Social = 50,70,80,55
	 * 
	 * Hint : Map<String, List<Integer>> map = new HashMap<>();
	 * 
	 * map.put("Nepali",List.of(88,78,90,60));
	 */

	public static void main(String[] args) {
		Map<String, List<Integer>> map = new HashMap<>();
		map.put("Math", List.of(88, 78, 90, 60));
		map.put("Nepali", List.of(70, 80, 87, 69));
		map.put("English", List.of(90, 60, 70, 80));
		map.put("Computer", List.of(99, 69, 79, 89));
		map.put("Social", List.of(50, 70, 80, 55));


		System.out.println("Subjects\tTotalMarks\tAverageMarks\tPercentage");
		for (String key : map.keySet()) {
			List<Integer> marksList = map.get(key);
			int totalMarks = 0;
			for(Integer value : marksList) {
				totalMarks += value;
			}
			System.out.print(key+"     ");
			System.out.print("\t"+totalMarks);
			System.out.print("\t\t"+(totalMarks)/4);
			float percentage = (float)totalMarks/400*100;
			System.out.println("\t\t"+percentage+"%");
		}

	}
}
