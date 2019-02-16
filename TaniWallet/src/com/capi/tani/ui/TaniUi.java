package com.capi.tani.ui;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import com.capi.tani.beans.Customer;
import com.capi.tani.repo.TaniRepo;
import com.capi.tani.repo.TaniRepoImpl;
import com.capi.tani.service.TaniService;
import com.capi.tani.service.TaniServiceImpl;

public class TaniUi {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		TaniRepo tr = new TaniRepoImpl();
		TaniService ts = new TaniServiceImpl(tr);

		Scanner sc = new Scanner(System.in);

		int choice;
		while (true) {
			System.out.println("Enter the choice");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter the name");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.println("Enter the mobile number");
				String mobNo = sc.nextLine();
				System.out.println("Enter the amount");
				String amount = sc.nextLine();
				ts.createAccount(name, mobNo, new BigDecimal(amount));
				// System.out.println("List");
				// List<Customer>l=ts.showBalance(mobNo);
				Customer e = ts.createAccount(name, mobNo, new BigDecimal(amount));

				System.out.println("Customer name : " + e.getName() + "Customer number" + e.getMobNo()
						+ "Account Balance :" + e.getWallet().getBalance());

				break;
			case 2:
				System.out.println("Enter the name");
				sc.nextLine();
				String nam = sc.nextLine();
				System.out.println("Enter the mobile number");
				String mobN = sc.nextLine();
				System.out.println("Enter the amount");
				String amoun = sc.nextLine();
				System.out.println("Enter the deposite amount");
				String amoun1 = sc.nextLine();
				ts.createAccount(nam, mobN, new BigDecimal(amoun));
				// System.out.println("List");
				// List<Customer>l=ts.showBalance(mobNo);
				Customer e1 = ts.createAccount(nam, mobN, new BigDecimal(amoun));

				System.out.println("Customer name : " + e1.getName() + "Customer number" + e1.getMobNo()
						+ "Account Balance :" + e1.getWallet().getBalance());
				System.out.println("Deposite" + ts.depositAmount(mobN, new BigDecimal(amoun1)));
				break;
			case 3:
				System.out.println("Enter the name");
				sc.nextLine();
				String na = sc.nextLine();
				System.out.println("Enter the mobile number");
				String mob = sc.nextLine();
				System.out.println("Enter the amount");
				String amou = sc.nextLine();
				System.out.println("Enter the withdraw amount");
				String amou1 = sc.nextLine();
				ts.createAccount(na, mob, new BigDecimal(amou));
				// System.out.println("List");
				// List<Customer>l=ts.showBalance(mobNo);
				Customer e2 = ts.createAccount(na, mob, new BigDecimal(amou));

				System.out.println("Customer name : " + e2.getName() + "Customer number" + e2.getMobNo()
						+ "Account Balance :" + e2.getWallet().getBalance());
				System.out.println("Deposite" + ts.withdrawAmount(mob, new BigDecimal(amou1)));

				break;
			case 4:
				System.out.println("Enter the name");
				sc.nextLine();
				String n = sc.nextLine();
				System.out.println("Enter the source mobile number");
				String mo = sc.nextLine();
				System.out.println("Enter the target mobile number");
				String mot = sc.nextLine();
				System.out.println("Enter the transfer amount");
				String amo1 = sc.nextLine();
				// System.out.println("List");
				// List<Customer>l=ts.showBalance(mobNo);
				System.out.println("Fund" + ts.fundTransfer(mo, mot, new BigDecimal(amo1)));
				break;
			case 5:
				System.exit(0);
				break;
			default:
				System.out.println("You have entered an invalid choice");
			}
		}

	}

}
