package example2;

import java.util.ArrayList;

public class AccountManager {

	public static void main(String[] args){
		ArrayList<Object> supervisorPremissions = getPermissionsFromFile("supervisor.txt");
		UserAccount supervisor = new UserAccount();
		supervisor.setUpermissions(supervisorPremissions);
		ArrayList<Object> accountRepPermissions = getPermissionsFromFile("accountrep.txt");
		UserAccount accountRep = new UserAccount();
		accountRep.setUpermissions(accountRepPermissions);
		AccountPrototypeFactory factory = new AccountPrototypeFactory(accountRep, supervisor);
		
		
		UserAccount newSupervisor = factory.getSupervisor();
		newSupervisor.setUserName("PKuchana");
		newSupervisor.setPassword("Everest");
		System.out.println(newSupervisor.getUserName());
		
		UserAccount anotherSupervisor = factory.getSupervisor();
		newSupervisor.setUserName("PKuchana");
		newSupervisor.setPassword("Everest");
		System.out.println(anotherSupervisor);
		
		
		UserAccount newAccountName = factory.getAccountRep();
		newSupervisor.setUserName("PKuchana");
		newSupervisor.setPassword("Everest");
		System.out.println(newAccountName);
		
		
	}

	private static ArrayList<Object> getPermissionsFromFile(String user) {
		// buscar si el usuario  es supervisor o no y retornar un  arreglo con todos los usuarios de ese tipo
		return null;
	}

	
}
