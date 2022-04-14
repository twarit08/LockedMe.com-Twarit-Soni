package com.Lockers.LockedMe;

import java.util.Scanner;

public class MenuDisplay {
	FileOperations fileIO = new FileOperations();
	Scanner scan =  new Scanner(System.in);
	String input;
	String subInput;
	String close;

	public void mainMenu() {
		for(int i=0;i<1;i++) {
			System.out.print("      ");
			for(int j=0;j<=75;j++) {
				System.out.print(" *");
			}
		}
		System.out.println();
		System.out.println("       *                                                                  LockedMe.com                                                                       *");
		System.out.println("       *                                                           (Developed by TWARIT SONI)                                                                *");
		for(int i=0;i<1;i++) {
			System.out.print("      ");
			for(int j=0;j<=75;j++) {
				System.out.print(" *");
			}
		}
		System.out.println();
		for(int i=0;i<1;i++) {
			System.out.print("      ");
			for(int j=0;j<=75;j++) {
				System.out.print(" =");
			}
		}
		System.out.println();
		System.out.println("      |                                                               ******MAIN MENU******                                                                   |");
		System.out.println("      |                                                                                                                                                       |");
		System.out.println("      |                                                     Select any one of the following options:                                                          |");
		System.out.println("      |                                                                                                                                                       |");
		System.out.println("      |                                                     1 - List All Files.                                                                               |");
		System.out.println("      |                                                     2 - More Options.                                                                                 |");
		System.out.println("      |                                                     3 - Close the Application.                                                                        |");
		System.out.println("      |                                                                                                                                                       |");
		for(int i=0;i<1;i++) {
			System.out.print("      ");
			for(int j=0;j<=75;j++) {
				System.out.print(" =");
			}
		}
		System.out.println();
		for(int i=0;i<1;i++) {
			System.out.print("      ");
			for(int j=0;j<=75;j++) {
				System.out.print(" *");
			}
		}
		System.out.println();
		System.out.println("       *                                                   Directory: E:\\LockedMe.com                                                                        *");
		
		for(int i=0;i<1;i++) {
			System.out.print("      ");
			for(int j=0;j<=75;j++) {
				System.out.print(" *");
			}
		}
		
		System.out.println();
		System.out.print("       Choose any of the above options: ");
	
	}
	public void subMenu(){
		do {
			for(int i=0;i<1;i++) {
				System.out.print("      ");
				for(int j=0;j<=75;j++) {
					System.out.print(" =");
				}
			}	
			System.out.println();
			System.out.println("      |                                                               ******Sub Menu******                                                                    |");
			System.out.println("      |                                                                                                                                                       |");
			System.out.println("      |                                                     Select any one of the following options:                                                          |");
			System.out.println("      |                                                                                                                                                       |");
			System.out.println("      |                                                     1 - Add a File.                                                                                   |");
			System.out.println("      |                                                     2 - Delete a File.                                                                                |");
			System.out.println("      |                                                     3 - Search a File.                                                                                |");
			System.out.println("      |                                                     4 - Back to Main Menu.                                                                            |");
	
			for(int i=0;i<1;i++) {
				System.out.print("      ");
				for(int j=0;j<=75;j++) {
					System.out.print(" =");
				}
			}
			System.out.println();
			System.out.print("       Choose any of the above options: ");
	
		
			try {
				this.subInput = scan.next();
			} catch (Exception e3) {
				System.out.println("       Invalid Input!");
				subMenu();
			}
			switch(this.subInput) {
			case "1":
				System.out.print("       Please enter a FileName to Add a File: ");
				fileIO.addNew();
				System.out.println();
				System.out.print("       Press '0' to go back in the SUB MENU: ");
				try {
					int a = scan.nextInt();
					if(a==0) {
						subMenu();
					}else {
						System.out.println();
						System.out.println("       Invalid Input.Press '0' again!");
						System.out.println();
					}
				} catch (Exception e2) {
					System.out.println("       Invalid Input! Try again.");
					subMenu();
				}
				break;
			
			case "2":
				System.out.print("       Please enter a FileName to Delete a File(FileName is case sensitive): ");
				fileIO.deleteFile();
				System.out.println();
				System.out.print("       Press '0' to go back in the SUB MENU: ");
				try {
					int b = scan.nextInt();
					if(b==0) {
						subMenu();
					}else {
						System.out.println();
						System.out.println("       Invalid Input.Press '0' again!");
						System.out.println();
					}
				} catch (Exception e1) {
					System.out.println("       Invalid Input! Try again.");
					subMenu();
				}
				break;
			
			case "3":
				System.out.print("       Please enter a FileName to Search a File(FileName is case sensitive): ");
				fileIO.searchFile();
				System.out.println();
				System.out.print("       Press '0' to go back in the SUB MENU: ");
				try {
					int c = scan.nextInt();
					if(c==0) {
						subMenu();
					}else {
						System.out.println();
						System.out.println("       Invalid Input.Press '0' again!");
						System.out.println();
					}
				} catch (Exception e) {
					System.out.println("       Invalid Input! Try again.");
					subMenu();
				}
				break;
		
			case "4":
				start();
				break;
			default:
				System.out.println("       Invalid Input! Please enter correct option.");
				subMenu();
				break;
			}
		
		}while(true);
	}
	public void start(){
		
		do{
			fileIO.makeDir();
			mainMenu();
			try {
				this.input = scan.next();
			} catch (Exception e) {
				System.out.println("       Invalid Input!");
				start();
			}
			System.out.println();
			
			switch(this.input) {
			case "1":
				fileIO.getlist();
				System.out.println();
				System.out.print("       Press '0' to go back in the MAIN MENU: ");
				try {
					int m = scan.nextInt();
					if(m==0) {
						start();
					}else {
						System.out.println();
						System.out.println("       Invalid Input.Press '0' again!");
						System.out.println();
					}
				} catch (Exception e) {
					System.out.println("       Invalid Input! Try again.");
					start();
				}
				break;
				
			case "2":
				subMenu();
				break;
			
			case "3":
				
				System.out.print("       Are you sure that you want to close this Application ? If Yes press 'y' or press 'n' to stay in the Application: ");
				try {
					this.close = scan.next();
				} catch (Exception e) {
					System.out.println("Invalid Input!");
					start();
				}
				switch(this.close) {
				
				case "y":
					System.out.println();
					System.out.println("       Thanks for using this Application.");
					System.exit(0);
					break;
				case "n":
					start();
					break;
				default:
					System.out.println("       Invalid Input! Please enter correct option.");
					start();
					break;
				}
				break;
			
			default:
				System.out.println("       Invalid Input! Please enter correct option.");
				start();
				break;
			}
		}while(true);
	}
	
}
