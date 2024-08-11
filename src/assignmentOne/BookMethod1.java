package assignmentOne;

import java.util.Scanner;

public class BookMethod1 {

	/*
	 * 
	 * A Book having following properties :
	 * 
	 * 1. title 
	 * 2. author 
	 * 3. price, 
	 * 4. publisher 
	 * 5. ISBN
	 * 
	 * User should enter all the data(10 books) from keyboard and store in a array.
	 * The book data should be displayed in given format :
	 * 
	 * Title 	Author 			Price 	Publisher 	ISBN 
	 * ==== 	======== 		====== 	======= 	===== 
	 * OOP		Graham Winter 	£32.50 	OReilly 	0471974555 
	 * QoS 		Geoff Ferguson 	£12.99 	Wiley		1991974123 
	 * Java 	Anthony Jones 	£8.00 	Pearson 	4321567321
	 */

	static String[] readBooks() {
		String[] array = new String[10];
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			System.out.println("Enter the following details for book : " + i);

			System.out.println("Enter the BookTitle : ");
			String title = scanner.nextLine();

			System.out.println("Enter the BookAuthor : ");
			String author = scanner.nextLine();
			
			System.out.println("Enter the BookPrice : ");
			float price = scanner.nextFloat();
			scanner.nextLine();

			System.out.println("Enter the Book Publisher : ");
			String publisher = scanner.nextLine();
			
			System.out.println("Enter the Book ISBN : ");
			String isbn = scanner.nextLine();
			
			String value =  title +','+ author +','+ price +','+ publisher +','+ isbn;
			
			array[i] = value;

			
		}
		scanner.close();
		return array;
	}

	public static void main(String[] args) {
		String[] arrays =  readBooks();
		System.out.println("\t  Title  \t  Author  \t  Price  \t  Publisher  \t  ISBN  \t");
		System.out.println("\t ======== \t ======== \t ======== \t ========= \t ======== \t");
		
		int bookCount = 0;
		float totalPrice = 0;
		float maximumCost = 0;
		float  minimumCost = 0;
	
		for(int i =0;i<arrays.length;i++) {
			if(arrays[i] !=null) {				
			String[] singleline = arrays[i].split(",");
			System.out.print("\t "+singleline[0]+"\t");
			System.out.print("\t "+singleline[1]+"\t");
			System.out.print("\t "+singleline[2]+"\t");			
			System.out.print("\t "+singleline[3]+"\t");
			System.out.print("\t "+singleline[4]+"\t");
			System.out.println();
			
			
			float bookCost = Float.parseFloat(singleline[2]); 
			if(maximumCost<=bookCost) {
				maximumCost = bookCost;
			}
			
			minimumCost = bookCost;
			if(minimumCost<=bookCost) {
				 minimumCost=bookCost;
			}
			totalPrice += bookCost;
			bookCount++;
			}
			
			
		}
		
		System.out.println("Total Number of Books : "+bookCount);
		System.out.println("Total Cost of Books : $"+totalPrice);
		System.out.println("Maximum Cost of Books : $"+maximumCost);
		System.out.println("Minimum Cost of Books : $"+minimumCost);
		System.out.println("Average Cost of Books : $"+(totalPrice)/bookCount);

	}

}
