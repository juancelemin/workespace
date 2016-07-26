package example2;

public class AccountPrototypeFactory {
	private UserAccount accountRep;
	private UserAccount supervisor;
	public AccountPrototypeFactory(UserAccount accountRep, UserAccount supervisor) {
		super();
		this.accountRep = accountRep;
		this.supervisor = supervisor;
	}
	public UserAccount getAccountRep() {
		return (UserAccount) accountRep.clone();
	}

	public UserAccount getSupervisor() {
		return (UserAccount) supervisor.clone();
	}
	
	
}
