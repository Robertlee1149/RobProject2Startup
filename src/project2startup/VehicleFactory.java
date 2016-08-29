/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2startup;

import java.text.NumberFormat;


/**
 *
 * @author hmouissa
 */
public class VehicleFactory {
    //variables to hold our object properties
	private String name;
	private String phone;
	private int nbrVehicles =0;
	private int nbrTanks =0;
	private double manufactureCost =0;
	private double fuelTanksCost =0;
	private double subtotal =0;
	private double tax =0;
	private double total = 0;

	//constants to hold our pricing properties
	private final double VEHICLE_PRICE = 500.19;
	private final double FUELCELL_PRICE = 2.15;
        
        //constant to hold fuel cells per tank
	private final int FUELCELLS_PER_TANK = 12;
        
	//you have to create a constant and store the tax rate in it
	private final double TAX_RATE = 0.0725;
	
	public VehicleFactory(String aName, String aPhone, int aNbrVehicles, int aNbrTanks){
		//add necessary code in here
                name = aName;
                phone = aPhone;
                nbrVehicles = aNbrVehicles;
                nbrTanks = aNbrTanks;
                
	}
	
	//Add methods to perform your calculations here
	//for example you have to calculate the manufacturing cost and store it in manufactureCost
	public void calcManufacturingCost(){
		manufactureCost = nbrVehicles * VEHICLE_PRICE;      
                
	}
	
	//for example you have to calculate the fuel tanks cost and store it in fuelTankCost
	public void calcFuelTankCost(){
		fuelTanksCost = nbrVehicles * nbrTanks * FUELCELLS_PER_TANK * FUELCELL_PRICE;
                
	}
	
	//add method to calculate the subtotal and store it in subtotal
	public void calcSubtotal(){
		subtotal = fuelTanksCost + manufactureCost;
                
	}
	
	//add method to calculate the tax and store it in tax
	public void calcTax(){
		tax = subtotal * TAX_RATE;
	}
	
	//add method to calculate the total and store it in total
	public void calcTotal(){
		total = subtotal + tax;
                
	}
	
	//Add a method to return a summary for this object here
	public String getSummary(){
            
                NumberFormat cf = NumberFormat.getCurrencyInstance();
                
		//you have to build your summary and store it in the summary variable
		String summary = "WELCOME TO HAYLO MANUFACTURING\n\n";
                        summary += "Customer Name: " + name + "\n";
                //formats phone to display (xxx) xxx-xxxx and continues with the rest of the summary build-up.
                String formattedPhone =  "(" + phone.substring(0,3) + ") " + phone.substring(3, 6) + "-" + phone.substring(6,10);
                        summary += "Customer Phone: " + formattedPhone + "\n";
                        summary += "Number of Vehicles: " + nbrVehicles + "\n";
                        summary += "Number of Tanks: " + nbrTanks + "\n";
                        summary += "Vehicle Cost($500.19/vehicle): " + cf.format(manufactureCost) + "\n";
                        summary += "Tanks Cost($2.15/Fuel Cell): " + cf.format(fuelTanksCost) + "\n";
                        summary += "Subtotal: " + cf.format(subtotal) + "\n";
                        summary += "Tax(7.25%): " + cf.format(tax) + "\n";
                        summary += "Total: " + cf.format(total) + "\n";
                        
                        //JOptionPane.showMessageDialog (null,summary);
                        
		return summary;
                
                

                
                
                
        
                 
	}
}
