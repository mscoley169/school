package edu.nashcc.cert;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CertificateOfDeposit {

	// global variables
	String certNum, acctLastName;
	int day, month, year;
	GregorianCalendar issueDate, maturityDate;
	double balance;

	
	public CertificateOfDeposit(String certNum, String acctLastName,
			GregorianCalendar issueDate, double balance) {
		this.certNum = certNum;
		this.acctLastName = acctLastName;
		this.issueDate = issueDate;
		this.balance = balance;
	}
	
	// GregorianCalendar nonsense
	Calendar calendar = Calendar.getInstance();
	SimpleDateFormat dateForm = new SimpleDateFormat("dd/MM/yyyy");
	
	
	// getters and setters
	public String getCertNum() {
		return certNum;
	}
	public void setCertNum(String certNum) {
		this.certNum = certNum;
	}
	public String getAcctLastName() {
		return acctLastName;
	}
	public void setAcctLastName(String acctLastName) {
		this.acctLastName = acctLastName;
	}
	public GregorianCalendar getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(GregorianCalendar issueDate) {
		day = issueDate.get(Calendar.DAY_OF_MONTH);
		month = issueDate.get(Calendar.MONTH);
		year = issueDate.get(Calendar.YEAR);
		
	}
	public GregorianCalendar getMaturityDate() {
		return maturityDate;
	}
	public GregorianCalendar setMaturityDate(GregorianCalendar issueDate) {
		setIssueDate(issueDate);
		issueDate.add(Calendar.YEAR, 1);
		return maturityDate;
		
		
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
}
