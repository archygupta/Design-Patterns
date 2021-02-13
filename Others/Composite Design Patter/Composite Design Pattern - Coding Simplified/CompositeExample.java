package com.codingsimplified.composite;

import java.util.ArrayList;

abstract class Account {
	public abstract float getBalance();
}

class DepositAccount extends Account {
	private String accountNo;
	private float accountBalance;

	public DepositAccount(String accountNo, float accountBalance) {
		super();
		this.accountNo = accountNo;
		this.accountBalance = accountBalance;
	}

	@Override
	public float getBalance() {
		return accountBalance;
	}

}

class SavingAccount extends Account {
	private String accountNo;
	private float accountBalance;

	public SavingAccount(String accountNo, float accountBalance) {
		super();
		this.accountNo = accountNo;
		this.accountBalance = accountBalance;
	}

	@Override
	public float getBalance() {
		return accountBalance;
	}
}

class CompositeAccount extends Account {
	private float totalBalance;
	private ArrayList<Account> accountList = new ArrayList();

	@Override
	public float getBalance() {
		totalBalance = 0;
		for (Account account : accountList) {
			totalBalance += account.getBalance();
		}
		return totalBalance;
	}

	public void addAccount(Account account) {
		accountList.add(account);
	}

	public void removeAccount(Account account) {
		accountList.remove(account);
	}
}

public class CompositeExample {
	public static void main(String args[]) {
		CompositeAccount component = new CompositeAccount();
		
    component.addAccount(new DepositAccount("DA001", 100));
		component.addAccount(new SavingAccount("DA002", 200));
		component.addAccount(new SavingAccount("SA001", 300));

		System.out.println(component.getBalance());
	}
}
