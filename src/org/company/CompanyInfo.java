package org.company;

public class CompanyInfo {
	public void companyName() {
System.out.println("Greens Company");
	}
	public void companyId() {
System.out.println("Id 123Ge64");
	}
	public void companyAddress() {
System.out.println("Greens Omr 123460");
	}
	public static void main(String[] args) {
		CompanyInfo c = new CompanyInfo();
		c.companyId();
		c.companyAddress();
		c.companyName();
		
	}

}
