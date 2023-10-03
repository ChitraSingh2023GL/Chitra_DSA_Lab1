package it.support.email.service;
import it.support.email.credentialInterface.EmployeeCredentialInterface;
public class GenerateCredentialService implements EmployeeCredentialInterface {
	private static String domain=".abc.com";
	private String emailId=null,password=null;
	private int passwordSize=8;

	@Override
	public void generatePassword()
	{
		 //this is the password set string from which the random characters are being chosen
        String passwordSetCaptialLetter="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String passwordSetNumber="0123456789";
        String passwordSetSamallLetter="abcdefghijklmnopqrstuvwxyz";
        String passwordSetSpecialLetter="!@#$%^&*+";
        String AllChars=passwordSetCaptialLetter+passwordSetNumber+passwordSetSamallLetter+passwordSetSpecialLetter;
    	String sb=new String(); 

        	//random pick character from all chars
        	for(int i=0;i<passwordSize-4;i++){
        	
        		sb=generateRandomString(AllChars,4);
           
            }
        	//At least 1 number,capital,small letter and special letter
        	sb+=generateRandomString(passwordSetSpecialLetter,1);
        	sb+=generateRandomString(passwordSetNumber,1);
        	sb+=generateRandomString(passwordSetSamallLetter,1);
        	sb+=generateRandomString(passwordSetCaptialLetter,1);
        	

          
       // this.password= new String(sb); 
        this.password= sb;
		
	}
	@Override
	public void  generateEmailAddress(String fName,String lname,String dept)
	{
		this.emailId= fName+lname+"@"+dept+domain;
		
	}
	@Override
	public void showCredentials()
	{
		System.out.println("Dear Harshit your generated credentials are as follows");
		System.out.println("Email --->"+this.emailId);
		System.out.println("Password --->"+this.password);
	}
	public String generateRandomString(String input,int size)
	{
		String pwdRandom=new String();  
		for(int j=0;j<size;j++)
    	{
			int random;
    		random=(int)(Math.random()*input.length());   //pick a random index from password set using random() method of Math class
    		pwdRandom+=input.charAt(random);
    	}
		return pwdRandom.toString();
	}

}
