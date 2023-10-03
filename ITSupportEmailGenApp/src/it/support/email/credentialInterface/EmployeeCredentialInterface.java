package it.support.email.credentialInterface;

public interface EmployeeCredentialInterface {
	public void generatePassword();
	public void generateEmailAddress(String fName,String lname,String dept);
	public void showCredentials();

}
