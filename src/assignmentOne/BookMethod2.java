package assignmentOne;

import java.util.Scanner;

public class BookMethod2 {

	String title;
	String author;
	float price;
	String publisher;
	String isbn;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the no. of Book to Store : ");
		int size = scanner.nextInt();
		scanner.nextLine();

		String[] forTitle = new String[size];
		String[] forAuthor = new String[size];
		float[] forPrice = new float[size];
		String[] forPublisher = new String[size];
		String[] forIsbn = new String[size];

		for (int i = 0; i < size; i++) {
			System.out.print("Enter the Book Title " + (i + 1) + ": ");
			forTitle[i] = scanner.nextLine();
			System.out.print("Enter the Book Author " + (i + 1) + ": ");
			forAuthor[i] = scanner.nextLine();
			System.out.print("Enter the Book Price : ");
			forPrice[i] = scanner.nextFloat();
			scanner.nextLine();// for break
			System.out.print("Enter the Book Publisher : ");
			forPublisher[i] = scanner.nextLine();
			System.out.print("Enter the Book ISBN : ");
			forIsbn[i] = scanner.nextLine();
		}

		// for Display

		int totalBook = 0;
		float totalCost = 0;
		float maximumCost = 0;
		float minimumCost = forPrice[1];

		System.out.println("Title\t\tAuthor\t\tPrice\t\tPublisher\t ISBN");
		System.out.println("======\t\t======\t\t======\t\t======\t\t======");
		for (int j = 0; j < size; j++) {
			System.out.println(forTitle[j] + "\t\t" 
								+ forAuthor[j] + "\t\t$" 
								+ forPrice[j] + "\t\t" 
								+ forPublisher[j]+ "\t\t" 
								+ forIsbn[j]);
			
			totalBook++;
			totalCost += forPrice[j];
			if (maximumCost < forPrice[j]) {
				maximumCost = forPrice[j];
			}
			if (minimumCost > forPrice[j]) {
				minimumCost = forPrice[j];
			}
		}
		System.out.println("Total Number Of Books : " + totalBook);
		System.out.println("Total Cost Of Books : $" + totalCost);
		System.out.println("Maximum Cost Of Book : $" + maximumCost);
		System.out.println("Minimum Cost Of Book : $" + minimumCost);
		System.out.println("Average Cost Of Book : $" + (totalCost) / totalBook);

		scanner.close();
	}
}
