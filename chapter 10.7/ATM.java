import java.sql.Date;
import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int accountOption;
		int i;
		int accountNum;
		Date date = null;
		Account[] account = new Account[10];
		for(i = 0; i < 10; i++) {
			account[i] = new Account(i, 100, 0, date);
		}
		do {
			i = 0;
			accountOption = 0;
			accountNum = 0;
			do {
				System.out.print("Enter an id: ");
				accountNum = input.nextInt();
				switch(accountNum) {
				case 0: i = 1;
				break;
				case 1: i = 1;
				break;
				case 2: i = 1;
				break;
				case 3: i = 1;
				break;
				case 4: i = 1;
				break;
				case 5: i = 1;
				break;
				case 6: i = 1;
				break;
				case 7: i = 1;
				break;
				case 8: i = 1;
				break;
				case 9: i = 1;
				break;
				default: i = 0;
				System.out.println("Invalid try again");
				break;
				}
			}while(i != 1);
			do {
				System.out.print("Main menu\n1: view current balance\n2: deposit money\n3: withdraw money\n4: go back to account selection\nEnter a choice: ");
				accountOption = input.nextInt();
				if(accountOption == 1) {
					System.out.println(account[accountNum].getBalance());
				}else if(accountOption == 2) {
					System.out.print("enter amount to deposit: ");
					i = input.nextInt();
					account[accountNum].deposit(i);
				}else if(accountOption == 3) {
					System.out.print("enter amount to withdraw: ");
					i = input.nextInt();
					account[accountNum].withdraw(i);
				}else if(accountOption == 4) {
					
				}else {
					System.out.print("Invalid try again");
				}
			}while(accountOption != 4);
		}while(1 < 2);
		
	}

}
