package edu.nashcc.cert;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class TestCertificateOfDeposit {

	public static void main(String[] args) {

		Calendar calendar = new GregorianCalendar();
		SimpleDateFormat dateForm = new
		SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		// System.out.println(dateForm.format(calendar.getTime()));
		
		//Calendar calendar = new GregorianCalendar();
		
		calendar.getInstance();
		

		CertificateOfDeposit depo1 = new CertificateOfDeposite("001", "Smith", calendar, 1000.0D);   // String certNum,
																	// String acctLastName,
																	// GregorianCalendar issueDate,
																	// double balance

	}

}
