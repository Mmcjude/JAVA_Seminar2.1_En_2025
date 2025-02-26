package model;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Purchase {
	// variables, getters, setters, both constructors, toString + other functions(if necessary)
	private String userCardNr;
	private ArrayList<Vehicle> shoppingList = new ArrayList<Vehicle>();
	private LocalDateTime dateTime;
	
	public String getUserCardNr() {
		return userCardNr;
	}
	public ArrayList<Vehicle> getShoppingList() {
		return shoppingList;
	}
	public LocalDateTime getDateTime() {
		return dateTime;
	}
	
	public void setUserCardNr(String inputUserCardNr) {
		if(inputUserCardNr != null && inputUserCardNr.matches("[A-Z]{3}[0-9]{6}")) {
			userCardNr = inputUserCardNr;
		}
		else
		{
			userCardNr = "No card no";
		}
	}
	
	//no set for shoppinglist because it is initialized as empty list and adding some tractors or busses will be done in next functions

	public void setDateTime() {
		dateTime = LocalDateTime.now();
	}
	
	public Purchase()
	{
		setUserCardNr("ABC123456");
		setDateTime();
	}
	
	public Purchase(String inputUserCardNr) {
		setUserCardNr(inputUserCardNr);
		setDateTime();
	}
	
	public String toString() {
		return userCardNr + "bought " + shoppingList + " (" + dateTime + ")";
	}
	
}