package ro.ase.csie.cts.refactor.services;

import ro.ase.csie.cts.refactor.exceptions.InvalidLoanValueException;

public interface ValidatorServiceInterface {
	
	public void validateLoanValue(double loanValue) throws InvalidLoanValueException;
	
}
