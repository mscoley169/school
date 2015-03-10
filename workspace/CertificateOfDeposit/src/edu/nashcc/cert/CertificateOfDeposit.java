package edu.nashcc.cert;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CertificateOfDeposit {

	// global variables
	String certNum, acctLastName;
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
		this.issueDate = issueDate;
	}
	public GregorianCalendar getMaturityDate() {
		return maturityDate;
	}
	public void setMaturityDate(GregorianCalendar maturityDate) {
		this.maturityDate = maturityDate;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
}
