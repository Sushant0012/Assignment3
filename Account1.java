

Package Assign5;
	import java.util.Scanner;  
			class Account1 {  
			    private String accno;  
			    private String name;  
			    private String acc_type;  
			    private long balance;  
			    Scanner sc = new Scanner(System.in);   
			    public void openAccount() {  
			        System.out.print("Enter Account No: ");  
			        accno = sc.next();  
			        System.out.print("Enter Account type: ");  
			        acc_type = sc.next();  
			        System.out.print("Enter Name: ");  
			        name = sc.next();  
			        System.out.print("Enter Balance: ");  
			        balance = sc.nextLong();  
			    }   
			    public void showAccount() {  
			        System.out.println("Name of account holder: " + name);  
			        System.out.println("Account no.: " + accno);  
			        System.out.println("Account type: " + acc_type);  
			        System.out.println("Balance: " + balance);  
			    }  
		

			    public void deposit() {  
			        long amt;  
			        System.out.println("Enter the amount you want to deposit: ");  
			        amt = sc.nextLong();  
			        balance = balance + amt;  
			    }  
		

			    public void withdrawal() {  
			        long amt;  
			        System.out.println("Enter the amount you want to withdraw: ");  
			        amt = sc.nextLong();  
			        if (balance >= amt) {  
			            balance = balance - amt;  
			            System.out.println("Balance after withdrawal: " + balance);  
			        } else {  
			            System.out.println("Your balance is less than " + amt + "\tTransaction failed...!!" );  
			        }  
			    }  
			    public boolean search(String ac_no) {  
			        if (accno.equals(ac_no)) {  
			            showAccount();  
			            return (true);  
			        }  
			        return (false);  
			    }  
			}  
			public class Bank1 {  
			    public static void main(String arg[]) {  
			        Scanner sc = new Scanner(System.in);   
			        System.out.print("How many number of customers do you want to input? ");  
			        int n = sc.nextInt();  
			        Account1 C[] = new Account1[n];  
			        for (int i = 0; i < C.length; i++) {  
			            C[i] = new Account1();  
			            C[i].openAccount();  
			        }   
			        int ch;  
			        do {  
			            System.out.println("\n ***Banking System Application***");  
			            System.out.println("1. Display all account details \n 2. Search by Account number\n 3. Deposit the amount \n 4. Withdraw the amount \n 5.Exit ");  
			            System.out.println("Enter your choice: ");  
			            ch = sc.nextInt();  
			                switch (ch) {  
			           case 1:  
			             for (int i = 0; i < C.length; i++) {  
			         C[i].showAccount();  
			             }  
			            break; 
			         case 2:  
			          System.out.print("Enter account no. you want to search: ");  
			         String ac_no = sc.next();  
			          boolean found = false;  
			          for (int i = 0; i < C.length; i++) {  
			               found = C[i].search(ac_no);  
			               if (found){  
			                break;  
			                   }  
			                        }  
			        if (!found) {  
			          System.out.println("Search failed! Account doesn't exist..!!");  
			         }  
			         break;  
			           case 3:  
			          System.out.print("Enter Account no. : ");  
			           ac_no = sc.next();  
			            found = false;  
			              for (int i = 0; i < C.length; i++) {  
			              found = C[i].search(ac_no);  
			                     if (found) {  
			               C[i].deposit();  
			                break;  
			                 }  
			                        }  
			            if (!found) {  
			             System.out.println("Search failed! Account doesn't exist..!!");  
			                        }  
			                break;  
			          case 4:  
			       System.out.print("Enter Account No : ");  
			          ac_no = sc.next();  
			         found = false;  
			            for (int i = 0; i < C.length; i++) {  
			               found = C[i].search(ac_no);  
			                if (found) {  
			              C[i].withdrawal();  
			               break;  
			                }  
			                        }  
			              if (!found) {  
			           System.out.println("Search failed! Account doesn't exist..!!");  
			              }  
			              break;  
			           case 5:  
			           System.out.println("See you soon...");  
			           break;  
			  }  
			   }  
		           while (ch != 5);  
		  }  
		}  
		

 

/*Output:
java -cp /tmp/lmsXc05RpS Bank1
How many number of customers do you want to input? 2
Enter Account No: 456778
Enter Account type: saving
Enter Name: Sushant
Enter Balance: 55000
Enter Account No: 456780
Enter Account type: current
Enter Name: Sushh
Enter Balance: 50000
***Banking System Application***1. Display all account details 
 2. Search by Account number
 3. Deposit the amount 
 4. Withdraw the amount 
 5.Exit 
Enter your choice: 
3
Enter Account no. : 456778
Name of account holder: SushantAccount no.: 456778Account type: savingBalance: 55000
Enter the amount you want to deposit: 10000
***Banking System Application***
1. Display all account details 
 2. Search by Account number
 3. Deposit the amount 
 4. Withdraw the amount 
 5.Exit 
Enter your choice: 
1
Name of account holder: Sushant
Account no.: 456778
Account type: savingBalance: 65000
Name of account holder: Sushh
Account no.: 456780
Account type: current
Balance: 50000

 ***Banking System Application***
1. Display all account details 
 2. Search by Account number
 3. Deposit the amount 
 4. Withdraw the amount 
 5.Exit 
Enter your choice: 
2
Enter account no. you want to search: 456780
Name of account holder: Sushh
Account no.: 456780
Account type: current
Balance: 50000

 ***Banking System Application***
1. Display all account details 
 2. Search by Account number
 3. Deposit the amount 
 4. Withdraw the amount 
 5.Exit 
Enter your choice: 
4
Enter Account No : 456780
Name of account holder: Sushh
Account no.: 456780
Account type: current
Balance: 50000
Enter the amount you want to withdraw: 
20000
Balance after withdrawal: 30000***Banking System Application***
1. Display all account details 
 2. Search by Account number
 3. Deposit the amount 
 4. Withdraw the amount 
 5.Exit 
Enter your choice: 
1
Name of account holder: Sushant
Account no.: 456778
Account type: saving
Balance: 65000
Name of account holder: Sushh
Account no.: 456780
Account type: current
Balance: 30000

 ***Banking System Application***
1. Display all account details 
 2. Search by Account number
 3. Deposit the amount 
 4. Withdraw the amount 
 5.Exit 
Enter your choice: 
2
Enter account no. you want to search: 456781
Search failed! Account doesn't exist..!!

 ***Banking System Application***
1. Display all account details 
 2. Search by Account number
 3. Deposit the amount 
 4. Withdraw the amount 
 5.Exit 
Enter your choice: 
*/
