package arrayTasks;

import java.util.Scanner;

public class MultiDimensionalArrayTask {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		 System.out.println("Enter the number of student : ");
		 int sizeRow = scanner.nextInt();
		 scanner.nextLine();

		// [0][1][2][3][4][5][6][7][8]
		// [0][1][2][3][4][5][6][7][8]

		String[][] multiDimeArray = new String[sizeRow][9];

		for (int i = 0; i < multiDimeArray.length; i++) {
			float totalMarks = 0;
			boolean passFail = true;
			for (int j = 0; j < 9; j++) {
				if (j == 0) {
					System.out.print("Enter the Student Name "+(i+1)+" : ");
					String name = scanner.nextLine();
					multiDimeArray[i][j] = name;
				}
				if (j == 1) {
					System.out.print("Enter the English Marks : ");
					String english = scanner.nextLine();
					multiDimeArray[i][j] = english;
					totalMarks = Float.parseFloat(english);
					if (passFail && Float.parseFloat(english) < 40) {
						passFail = false;
					}
				}
				if (j == 2) {
					System.out.print("Enter the Science Marks : ");
					String science = scanner.nextLine();
					multiDimeArray[i][j] = science;
					totalMarks += Float.parseFloat(science);
					if (passFail && Float.parseFloat(science) < 40) {
						passFail = false;
					}
				}
				if (j == 3) {
					System.out.print("Enter the Math Marks : ");
					String math = scanner.nextLine();
					multiDimeArray[i][j] = math;
					totalMarks += Float.parseFloat(math);
					if (passFail && Float.parseFloat(math) < 40) {
						passFail = false;
					}
				}
				if (j == 4) {
					System.out.print("Enter the Social Marks : ");
					String social = scanner.nextLine();
					multiDimeArray[i][j] = social;
					totalMarks += Float.parseFloat(social);
					if (passFail && Float.parseFloat(social) < 40) {
						passFail = false;
					}
				}
				if (j == 5) {
					System.out.print("Enter the OPT Marks : ");
					String opt = scanner.nextLine();
					multiDimeArray[i][j] = opt;
					totalMarks += Float.parseFloat(opt);
					if (passFail && Float.parseFloat(opt) < 40) {
						passFail = false;
					}
				}
				if (j == 6) {
					multiDimeArray[i][j] = Float.toString(totalMarks);
				}
				if (j == 7) {
					multiDimeArray[i][j] = Float.toString(totalMarks / 5);
				}
				if (j == 8) {
					if (passFail) {
						multiDimeArray[i][j] = "PASS";
					} else {
						multiDimeArray[i][j] = "FAIL";
					}
				}
			}
			System.out.println("-------------------------------");
		}
		scanner.close();

		System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("|StudentName\t|								Subject								|");
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("		| English \t| Science\t| Math \t\t| Social\t| OPT\t\t|Total Marks\t| Percentage\t| Remarks\t|");
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------");
		for (int i = 0; i < sizeRow; i++) {
			for (int j = 0; j < 9; j++) {
				System.out.print(multiDimeArray[i][j] + "		|");
			}
			System.out.println();
			System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------");
		}
	}

}
