package service;

import model.EnergyType;
import model.Vehicle;

public class MainService extends Vehicle {
	//1. variables
		private String additionalTechniques;
		private boolean isOnlyLargeTires;
		
		//getters
		public String getAdditionalTechniques() {
			return additionalTechniques;
		}
		public boolean isOnlyLargeTires() {
			return isOnlyLargeTires;
		}
		
		
		//setters
		public void setAdditionalTechniques(String additionalTechniques) {
			this.additionalTechniques = additionalTechniques;
		}
		public void setOnlyLargeTires(boolean isOnlyLargeTires) {
			this.isOnlyLargeTires = isOnlyLargeTires;
		}
		
}

