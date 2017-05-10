
import java.util.Scanner;

public class Store extends Facility {
	private String storeNbr;
	private String divisionNbr;
	private String sales;

	public Store() {
		super();
		storeNbr = "";
		divisionNbr = "";
		sales = "";
	}

	public String getStoreNbr() {
		return storeNbr;
	}

	public void setStoreNbr(String storeNbr) {
		this.storeNbr = storeNbr;
	}

	public String getDivisionNbr() {
		return divisionNbr;
	}

	public void setDivisionNbr(String divisionNbr) {
		this.divisionNbr = divisionNbr;
	}

	public String getSales() {
		return sales;
	}

	public void setSales(String sales) {
		this.sales = sales;
	}

	public String toString() {
		return ("storeNbr: " + storeNbr + "\n" + "divisionNbr: " + divisionNbr + "\n" + "sales: " + sales + "\n")
				+ super.toString();
	}



	public void setZip(String string) {
		// TODO Auto-generated method stub

	}



}