package it.support.email.main;
import java.util.Scanner;

import it.support.email.model.Employee;
import it.support.email.service.GenerateCredentialService;

public class EmployeeDriver {

	public static void main(String[] args) {
		Scanner option=new Scanner(System.in);
		int choice;
		GenerateCredentialService genCredential=new GenerateCredentialService();
		Employee emp=new Employee("harshit","choudhary");
		System.out.println("Enter department number");
		System.out.println("1.Technical");
		System.out.println("2.Admin");
		System.out.println("3.Human Resource");
		System.out.println("4.Legal");
		
		if(option.hasNextInt())
		{
			choice=option.nextInt();
			switch(choice)
			{
			case 1:
				genCredential.generateEmailAddress(emp.getFirstName(),emp.getLastName(),"tech");
				genCredential.generatePassword();
				genCredential.showCredentials();
				break;
			case 2:
				genCredential.generateEmailAddress(emp.getFirstName(),emp.getLastName(),"admin");
				genCredential.generatePassword();
				genCredential.showCredentials();
				break;
			case 3:
				genCredential.generateEmailAddress(emp.getFirstName(),emp.getLastName(),"human");
				genCredential.generatePassword();
				genCredential.showCredentials();
				break;
			case 4:
				genCredential.generateEmailAddress(emp.getFirstName(),emp.getLastName(),"legal");
				genCredential.generatePassword();
				genCredential.showCredentials();
				break;
			default:
				System.out.println("Enter correct option");
			
			}
		}
		else
		{
				System.out.println("Enter correct option.Only enter number between 1 to 4.");
		}
			
		
		
		option.close();

	}

}
