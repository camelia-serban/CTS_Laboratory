package ro.ase.csie.cts.refactor.services;

import ro.ase.csie.cts.refactor.exceptions.InvalidLoanValueException;

public class ValidatorService implements ValidatorServiceInterface{

	@Override
	public void validateLoanValue(double loanValue) throws InvalidLoanValueException {
		if(loanValue < 0) {
			throw new InvalidLoanValueException();
		}
	}

}
