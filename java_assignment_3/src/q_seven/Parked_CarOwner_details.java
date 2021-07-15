package q_seven;

import java.util.Scanner;

public class Parked_CarOwner_details {
	int token;
	String ownerName;
	String carModel;
	double ownerMobileNo;
	String ownerAddress;
	static int i = 1;
	Scanner ip = new Scanner(System.in);
	  public Parked_CarOwner_details() {
		  
		  	System.out.println("******************************");
			System.out.println("Please enter your Name");
			ownerName = ip.nextLine();
			System.out.println("Please enter your Car model");
			carModel = ip.nextLine();
			System.out.println("Please enter your Addr");
			ownerAddress = ip.nextLine();
			System.out.println("Please enter your Mob No");
			ownerMobileNo = ip.nextInt();
			token = i;
			i++;
	  }
	public int getToken() {
		return token;
	}
	public void setToken(int token) {
		this.token = token;
	}
	public String getownerName() {
		return ownerName;
	}
	public void setownerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getCarModel() {
		return carModel;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	public double getownerMobileNo() {
		return ownerMobileNo;
	}
	public void setownerMobileNo(double ownerMobileNo) {
		this.ownerMobileNo = ownerMobileNo;
	}
	public String getownerAddress() {
		return ownerAddress;
	}
	public void setownerAddress(String ownerAddress) {
		this.ownerAddress = ownerAddress;
	}
	@Override
	public String toString() {
		return "Parked_CarOwner_details [token=" + token + ", ownerName=" + ownerName + ", carModel=" + carModel
				+ ", ownerMobileNo=" + ownerMobileNo + ", ownerAddress=" + ownerAddress + "]";
	}
//	public Scanner getIp() {
//		return ip;
//	}
//	public void setIp(Scanner ip) {
//		this.ip = ip;
//	}

}
