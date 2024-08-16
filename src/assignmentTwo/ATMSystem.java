package assignmentTwo;

import java.util.Arrays;
import java.util.Scanner;

public class ATMSystem {
	static Scanner scanner = new Scanner(System.in);

	static boolean userAuthentication(String[] userDetails) {
		int pinTry = 3;
		do {
			System.out.print("Enter the PIN : ");
			String pin = scanner.nextLine();
			for (int i = 0; i < userDetails.length; i++) {

				if (userDetails[i].equals(pin)) {
					System.out.println("PIN match");
					return true;
				}
			}
			pinTry--;
			System.out.println("incorrect PIN\n\n");

		} while (pinTry > 0);
		System.out.println("Your account has Been blocked!!");
		return false;
	}

	static void balanceInquary(String[] userDetails) {
		for (int i = 0; i < userDetails.length; i++) {
			switch (i) {
			case 0:
				System.out.print("AccountHolderName : \t" + userDetails[i]);
				break;
			case 1:
				System.out.print("AccountNumber : \t" + userDetails[i]);
				break;
			case 2:
				System.out.print("AccountBalance : \t" + userDetails[i]);
				break;
			default:
				break;
			}
			System.out.println();
		}
//		for(String value : userDetails) {
//			System.out.println(value.toString());
//		}
	}

	static void cashWithdraw(String[] userDetails) {
		System.out.println("Enter the Withdrawal Amount");
		float withDrawAmount = Float.parseFloat(scanner.nextLine());
		if (Float.parseFloat(userDetails[2]) > withDrawAmount) {
			float updateAmount = Float.parseFloat(userDetails[2]) - withDrawAmount;
			userDetails[2] = String.valueOf(updateAmount);  //update value 
			System.out.println("WithDrawal Success!!");
			
			// displaying the value 
			System.out.println(Arrays.toString(userDetails));
		} else {
			System.out.println("Insufficient Balance");
		}
	}

	static void fundsTransfer(String[] senderDetails, String[] reciverDetails) {
		boolean check = false;
		System.out.print("Enter the Reciver AccountNumber : ");
		String reciverAccountNumber = scanner.nextLine();

		// to check the reciver account number is avaliable or not and sender money must
		// be greate than sending money
		// one sender array and another reciver array
		for (int i = 0; i < reciverDetails.length; i++) {
			if (reciverAccountNumber.equals(reciverDetails[i])) {
				System.out.print("Enter the Amount to Transfer : ");
				float amount = Float.parseFloat(scanner.nextLine());
				float senderCurrentAmount = Float.parseFloat(senderDetails[2]);
				float reciverCurrentAmount = Float.parseFloat(reciverDetails[2]);

				if (senderCurrentAmount > amount) {
					float updateReciverAmount = amount + reciverCurrentAmount;
					float updateSenderAmount = senderCurrentAmount - amount;
					senderDetails[2] = String.valueOf(updateSenderAmount);
					reciverDetails[2] = String.valueOf(updateReciverAmount);
					System.out.println("Successful Transfer");
					check = true;
				} else {
					System.out.println("Insufficient Funds");
				}
			}
		}
		if (!(check)) {
			System.out.println("Invalid Account");
		}
		System.out.println("--------------------------------------");
		System.out.println("Sender : " + Arrays.toString(senderDetails));
		System.out.println("--------------------------------------");
		System.out.println("Reciver : " + Arrays.toString(reciverDetails));
		System.out.println("--------------------------------------");

	}

	public static void main(String[] args) {

		String[] userDetails = { "Grishya", "BBBBBB", "6000", "111111" };
		String[] reciverDetails = { "Bishwas", "AAAAAA", "500", "222222" };
		boolean status = userAuthentication(userDetails);
		while (status) {
			System.out.println("-------------------------");
			System.out.println("1. Balance Inquiry");
			System.out.println("2. Cash Withdrawal");
			System.out.println("3. Fund Transfer");
			System.out.println("4. Exit");
			System.out.println("-------------------------");
			int swich = scanner.nextInt();
			scanner.nextLine();
			
			switch (swich) {
			case 1:
				balanceInquary(userDetails);
				break;
			case 2:
				cashWithdraw(userDetails);
				break;
			case 3:
				fundsTransfer(userDetails, reciverDetails);
				break;
			case 4:
				status = false;
				break;
			default:
				System.out.println("Invalid Input");
			}
		}

	}

}
