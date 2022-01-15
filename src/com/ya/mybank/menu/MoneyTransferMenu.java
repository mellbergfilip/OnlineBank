package com.ya.mybank.menu;

import com.ya.mybank.bank.Bank;
import com.ya.mybank.service.MoneyTransfer;
import com.ya.mybank.util.ConsoleOutput;
import com.ya.mybank.util.InputSafetyChecker;

/*
 * Class that contains logic and print
 * for MoneyTransfer menu
 */
public class MoneyTransferMenu {

	// Create service MoneyTransfer
	private MoneyTransfer moneyTransfer = new MoneyTransfer();

	/* Logic for MoneyTransfer menu
	 * Switch/Case Menu
	 */
	public void runMoneyTransferMenu(Bank bank) {

		int menuChoice = 0;

		while (menuChoice != 3) {
			printMenu2();
			menuChoice = InputSafetyChecker.readInt();
			ConsoleOutput.dottedLine();
			switch (menuChoice) {
			case 1:
				moneyTransfer.depositToChosenAccount(bank);
				break;
			case 2:
				moneyTransfer.withdrawFromChosenAccount(bank);
				break;
			case 3:
				break;
			default:
				System.out.println("Invalid input");
				break;
			}
		}
	}

	// Method that prints out MoneyTransfer menu to console
	private void printMenu2() {
		System.out.println("------ TRANSFER MONEY ------");
		System.out.println("1. Deposit money ");
		System.out.println("2. Withdraw money");
		System.out.println("3. Go back to startmenu");
		System.out.print("Choice: ");
	}
}
