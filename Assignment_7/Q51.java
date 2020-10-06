/* 51.	Create a program that helps banks to maintain records. It should have following facilities. o Anybody can create current or saving account with following initial information: account number, name, balance, and branch. o display account detail for a particular accounts. o display total money deposited in bank. o allow deposit and  withdrawal in an account  . o for saving account opening balance and minimum balance must be 5000. o for current account opening balance and minimum balance must be 1000. o can not withdraw the amount from the account that makes balance less than the minimum balance. */
package bank_records;

import java.util.Scanner;

class Saving{
	
	public static int accNo;
	private String name;
	public static double balance;
	private String branch;
	
	public Saving(int accNo, String name, double balance, String branch) {
	
		super();
		this.accNo = accNo;
		this.name = name;
		this.balance = balance;
		this.branch = branch;
	}
	
	static void showDetails() {
		
		System.out.println("\nYour saving account number : "+accNo);
		System.out.println("Your total money in saving account is : "+balance);
	}
}

class Current{
	
	public static int accNo;
	private String name;
	public static double balance;
	private String branch;
	
	public Current(int accNo, String name, double balance, String branch) {
	
		super();
		this.accNo = accNo;
		this.name = name;
		this.balance = balance;
		this.branch = branch;
	}
	
	static void showDetails() {
		
		System.out.println("\nYour account number : "+accNo);
		System.out.println("Your total money in current account is : "+balance);
	}
}


public class BankRecords {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("\nPlease enter the number as per your requirements from the choice menu.");
		
		System.out.println("\nPlease Enter the choice : ");
		System.out.println("1. For saving account");
		System.out.println("2. For current account");
		System.out.println("0. Exit");
		
		int choice;
		while((choice = sc.nextInt()) != 0) {
			
			if(0<choice && choice<3) {
			
				switch(choice) {
				
					case 1: 
						System.out.println("\nPlease enter the choice : ");
						System.out.println("1. For creating new saving account.");
						System.out.println("2. For updating saving account balance.");
						System.out.println("0. To go home menu.");
						int ch1;
						
						while((ch1 = sc.nextInt()) != 0) {
							
							if(0<ch1 && ch1<3) {
								
								switch(ch1) {
								
									case 1: 
										System.out.print("Please enter the account number : ");
										int accNo = sc.nextInt();
										sc.nextLine();
										System.out.print("Please enter the account holder name : ");
										String name = sc.nextLine();
										System.out.print("Please enter the account balance greater than 5000 : ");
										double balance = sc.nextDouble();
										sc.nextLine();
										System.out.print("Please enter the branch name : ");
										String branch = sc.nextLine();
										
										if(balance >=5000) {
											
											Saving obj1 = new Saving(accNo, name, balance, branch);
											System.out.println("\nSaving account created successfully.");
											obj1.showDetails();
											
											System.out.println("\nPlease enter the choice : ");
											System.out.println("1. For creating new saving account.");
											System.out.println("2. For updating saving account balance.");
											System.out.println("0. To go home menu.");
										} else {
											
											System.out.println("\nPlease provide the correct balance.");
											System.out.println("\nPlease enter the choice : ");
											System.out.println("1. For creating new saving account.");
											System.out.println("2. For updating saving account balance.");
											System.out.println("0. To go home menu.");
										}
										
										break;
										
									case 2: 
										System.out.println("\nPlease enter the choice to perform below operation");
										System.out.println("1. For deposite the amount in saving account.");
										System.out.println("2. For withdraw the amount from saving account.");
										System.out.println("0. To go saving-account home menu.");
										int ch1_1;
										
										while((ch1_1 = sc.nextInt()) != 0) {
											
											if(0<ch1_1 && ch1_1<3) {
											
												switch(ch1_1) {
												
													case 1: 
														System.out.println("\nEnter the account number to perform deposite operation.");
														int accNo1 = sc.nextInt();
														
														if(accNo1 == Saving.accNo) {
															
															System.out.println("Enter the amount to deposite");
															double balance1 = sc.nextDouble();
															
															Saving.balance = Saving.balance + balance1;
															
															System.out.println("\nMoney deposited successfully.");
															Saving.showDetails();
															
															System.out.println("\nPlease enter the choice to perform below operation");
															System.out.println("1. For deposite the amount in saving account.");
															System.out.println("2. For withdraw the amount from saving account.");
															System.out.println("0. To go saving-account home menu.");
															
														} else {
															
															System.out.println("\nNo such account holder present in bank.");
															System.out.println("\nPlease enter the choice to perform below operation");
															System.out.println("1. For deposite the amount in saving account.");
															System.out.println("2. For withdraw the amount from saving account.");
															System.out.println("0. To go saving-account home menu.");
														}
														
														break;
														
													case 2: 
														System.out.println("\nEnter the account number to perform withdraw operation.");
														int accNo2 = sc.nextInt();
														
														if(accNo2 == Saving.accNo) {
															
															System.out.println("Enter the amount to withdraw");
															double balance1 = sc.nextDouble();
															
															if((Saving.balance - balance1) >= 5000) {
																
																Saving.balance = Saving.balance - balance1;
																
																System.out.println("\nMoney withdrew successfully.");
																Saving.showDetails();
																
																System.out.println("\nPlease enter the choice to perform below operation");
																System.out.println("1. For deposite the amount in saving account.");
																System.out.println("2. For withdraw the amount from saving account.");
																System.out.println("0. To go saving-account home menu.");
															} else
																System.out.println("\nSaving account balance should not be below 5000.");
															
														} else {
															
															System.out.println("\nNo such account holder present in bank.");
															System.out.println("\nPlease enter the choice to perform below operation");
															System.out.println("1. For deposite the amount in saving account.");
															System.out.println("2. For withdraw the amount from saving account.");
															System.out.println("0. To go saving-account home menu.");
														}
														break;
												}
											
											} else {
												
												System.out.println("\nPlease provide the valid input.");
												System.out.println("\nPlease enter the choice to perform below operation");
												System.out.println("1. For deposite the amount in saving account.");
												System.out.println("2. For withdraw the amount from saving account.");
												System.out.println("0. To go saving-account home menu.");
											}
										}
										
										System.out.println("\nYou are in saving-account home menu now.");
										System.out.println("\nPlease enter the choice : ");
										System.out.println("1. For creating new saving account.");
										System.out.println("2. For updating saving account balance.");
										System.out.println("0. To go home menu.");
										
										break;
								}
								
							} else {
								
								System.out.println("\nPlease provide the correct input.");
								System.out.println("\nPlease enter the choice : ");
								System.out.println("1. For creating new saving account.");
								System.out.println("2. For updating saving account balance.");
								System.out.println("0. To go home menu.");
							}
						}
						
						System.out.println("\nYou are in home menu now.");
						System.out.println("\nPlease Enter the choice : ");
						System.out.println("1. For saving account");
						System.out.println("2. For current account");
						System.out.println("0. Exit");
						
						break;
						
					case 2: 
						System.out.println("\nPlease enter the choice : ");
						System.out.println("1. For creating new current account.");
						System.out.println("2. For updating current account balance.");
						System.out.println("0. To go home menu.");
						int ch2;
						
						while((ch2 = sc.nextInt()) != 0) {
							
							if(0<ch2 && ch2<3) {
								
								switch(ch2) {
								
									case 1: 
										System.out.print("Please enter the account number : ");
										int accNo = sc.nextInt();
										sc.nextLine();
										System.out.print("Please enter the account holder name : ");
										String name = sc.nextLine();
										System.out.print("Please enter the account balance greater than 1000 : ");
										double balance = sc.nextDouble();
										sc.nextLine();
										System.out.print("Please enter the branch name : ");
										String branch = sc.nextLine();
										
										if(balance >=1000) {
											
											Current obj2 = new Current(accNo, name, balance, branch);
											System.out.println("\nCurrent account created successfully.");
											obj2.showDetails();
											
											System.out.println("\nPlease enter the choice : ");
											System.out.println("1. For creating new current account.");
											System.out.println("2. For updating current account balance.");
											System.out.println("0. To go home menu.");
										} else {
											
											System.out.println("\nPlease provide the correct balance.");
											System.out.println("\nPlease enter the choice : ");
											System.out.println("1. For creating new current account.");
											System.out.println("2. For updating current account balance.");
											System.out.println("0. To go home menu.");
										}
										
										break;
										
									case 2: 
										System.out.println("\nPlease enter the choice to perform below operation");
										System.out.println("1. For deposite the amount in current account.");
										System.out.println("2. For withdraw the amount from current account.");
										System.out.println("0. To go current-account home menu.");
										int ch2_1;
										
										while((ch2_1 = sc.nextInt()) != 0) {
											
											if(0<ch2_1 && ch2_1<3) {
											
												switch(ch2_1) {
													
													case 1: 
														System.out.println("\nEnter the account number to do deposite operation.");
														int accNo1 = sc.nextInt();
														
														if(accNo1 == Current.accNo) {
															
															System.out.println("Enter the amount to deposite");
															double balance1 = sc.nextDouble();
															
															Current.balance = Current.balance + balance1;
															
															System.out.println("\nMoney deposited successfully.");
															Current.showDetails();
															
															System.out.println("\nPlease enter the choice to perform below operation");
															System.out.println("1. For deposite the amount in current account.");
															System.out.println("2. For withdraw the amount from current account.");
															System.out.println("0. To go current-account home menu.");
															
														} else {
															
															System.out.println("\nNo such account holder present in bank.");
															System.out.println("\nPlease enter the choice to perform below operation");
															System.out.println("1. For deposite the amount in saving account.");
															System.out.println("2. For withdraw the amount from saving account.");
															System.out.println("0. To go current-account home menu.");
														}
														
														break;
														
													case 2: 
														System.out.println("\nEnter the account number to do withdraw operation.");
														int accNo2 = sc.nextInt();
														
														if(accNo2 == Current.accNo) {
															
															System.out.println("Enter the amount to withdraw");
															double balance1 = sc.nextDouble();
															
															if((Current.balance - balance1) >= 1000) {

																Current.balance = Current.balance - balance1;
																
																System.out.println("\nMoney withdrew successfully.");
																Current.showDetails();
																
																System.out.println("\nPlease enter the choice to perform below operation");
																System.out.println("1. For deposite the amount in current account.");
																System.out.println("2. For withdraw the amount from current account.");
																System.out.println("0. To go current-account home menu.");
																
															} else
																System.out.println("\nCurrent account balance should not be below 1000.");
															
														} else {
															
															System.out.println("\nNo such account holder present in bank.");
															System.out.println("\nPlease enter the choice to perform below operation");
															System.out.println("1. For deposite the amount in current account.");
															System.out.println("2. For withdraw the amount from current account.");
															System.out.println("0. To go current-account home menu.");
														}
														
														break;
													}
												
											} else {
												
												System.out.println("\nPlease provide the valid input.");
												System.out.println("\nPlease enter the choice to perform below operation");
												System.out.println("1. For deposite the amount in current account.");
												System.out.println("2. For withdraw the amount from current account.");
												System.out.println("0. To go current-account home menu.");
											}	
										}
										
										System.out.println("\nYou are in current-account home menu now.");
										System.out.println("\nPlease enter the choice : ");
										System.out.println("1. For creating new current account.");
										System.out.println("2. For updating current account balance.");
										System.out.println("0. To go home menu.");
										
										break;
								}
								
							} else {
								
								System.out.println("\nPlease provide the correct input.");
								System.out.println("\nPlease enter the choice : ");
								System.out.println("1. For creating new current account.");
								System.out.println("2. For updating current account balance.");
								System.out.println("0. To go home menu.");
							}
						}
						
						System.out.println("\nYou are in home menu now.");
						System.out.println("\nPlease Enter the choice : ");
						System.out.println("1. For saving account");
						System.out.println("2. For current account");
						System.out.println("0. Exit");
						
						break;
				}
			} else {
				
				System.out.println("\nPlease provide the valid input.");
				System.out.println("\nPlease Enter the choice : ");
				System.out.println("1. For saving account");
				System.out.println("2. For current account");
				System.out.println("0. Exit");
			}
		}
		
		if(choice == 0) 
			System.out.println("Exit successfully.");
	}

}