package com.spring.dp.abstractfactory;

public class BankFactory extends AbstractFactory {

	public Bank getBank(String bank){
	      if(bank == null){
	         return null;
	      }
			
	      if(bank.equalsIgnoreCase("HDFC")){
	         return new HDFC();
	      } else if(bank.equalsIgnoreCase("ICICI")){
	         return new ICICI();
	      } else if(bank.equalsIgnoreCase("SBI")){
	         return new SBI();
	      }
	      return null;
	   }

	@Override
	public Loan getLoan(String loan) {
		// TODO Auto-generated method stub
		return null;
	}

}
