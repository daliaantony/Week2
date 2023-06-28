package org.system;

public class AxisBank {
	public void deposit() {
		System.out.println("Deposit method is called from AxisBank class - Overriden as expected");
	}

	public static void main(String[] args) {
		AxisBank bank = new AxisBank();
		bank.deposit();


	}

}
