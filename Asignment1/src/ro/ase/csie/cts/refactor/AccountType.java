package ro.ase.csie.cts.refactor;

public enum AccountType {
	STANDARD(0), BUDGET(1), PREMIUM(2), SUPER_PREMIUM(3);
	
	private final int accountTypeNumber;
	
	private AccountType(int accountTypeNo) {
		this.accountTypeNumber = accountTypeNo;
	}
	
	public int getAccountTypeNumber() {
		return this.accountTypeNumber;
	}
}
