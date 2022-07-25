package org.bank;

public class AxisBank  extends BankInfo{
	public void deposit() {
		System.out.println("OverRiding the method Deposit from Axibank class");

	}
	
	public static void main(String[] args) {
		AxisBank ax = new AxisBank();
		//Override
		ax.deposit();
		System.out.println("*****");
		ax.fixed();
		ax.saving();
		
				
		
		
	}
	

}
