package ro.ase.csie.cts.refactor;

import ro.ase.csie.cts.refactor.exceptions.InvalidLoanValueException;
import ro.ase.csie.cts.refactor.services.RateInterface;
import ro.ase.csie.cts.refactor.services.ValidatorServiceInterface;

public class Account {
	
	RateInterface rate = null;
	ValidatorServiceInterface validator = null;
	
	public Account(RateInterface rate, ValidatorServiceInterface validator) {
		this.rate = rate;
		this.validator = validator;
	}
	
	public int daysActive;
	
	
	public double getMonthlyRate(double loanValue, double rate) {
		return loanValue*rate;
	}
	
	public void setLoanValue(ValidatorServiceInterface value){
		if(value == null)
			throw new NullPointerException();
		this.validator = value;
	}

	public double computeTotalFee(AccountType type, Account[] accounts, double loan, double rate, int daysActive)
			throws InvalidLoanValueException
	{
		validator.validateLoanValue(loan);
		
		double totalFee = 0.0;
		int temp = 365;

		if(type == AccountType.PREMIUM || type==AccountType.SUPER_PREMIUM)	{
				totalFee += 0.0125	* (loan*Math.pow(rate,(daysActive/365)) - loan);
			}
		return	totalFee;
	}
			
}