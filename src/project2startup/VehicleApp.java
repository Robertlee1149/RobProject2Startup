/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2startup;

import javax.swing.JOptionPane;

/**
 *
 * @author hmouissa
 */
public class VehicleApp {

    public static void main(String[] args) {

        //ask user for inputs
        String fName = null;
        boolean firstName = false;
        while (firstName == false) {
            fName = JOptionPane.showInputDialog("Please Enter First Name: ");
            if (fName.length() >= 1) {
                firstName = true;
            } else {
                JOptionPane.showMessageDialog(null, "Please Enter Valid First Name.");
            }

        }

        String lName = null;
        boolean lastName = false;
        while (lastName == false) {
            lName = JOptionPane.showInputDialog("Please Enter Last Name: ");
            if (lName.length() >= 1) {
                ;
                lastName = true;
            } else {
                JOptionPane.showMessageDialog(null, "Please Enter Valid Last Name.");
            }

        }

        String aName = fName + " " + lName;

        String aPhone = null;
        boolean phoneNumber = false;
        while (phoneNumber == false) {
            aPhone = JOptionPane.showInputDialog("Please Enter Customer Phone Number: ");
            if (aPhone.length() == 10) {
                phoneNumber = true;
            } else {
                JOptionPane.showMessageDialog(null, "Please Enter a 10 Digit Phone Number.");
            }
        }

        int aNbrVehicles = 0;

        boolean numberVehicles = false;
        while (numberVehicles == false) {

            try {
                aNbrVehicles = Integer.parseInt(JOptionPane.showInputDialog("Please Enter Number Of Vehicles To Be Manufactured: "));
                if (aNbrVehicles >= 1 && aNbrVehicles <= 10) {
                    numberVehicles = true;
                } else {
                    JOptionPane.showMessageDialog(null, "Please Enter Valid Number Of Vehicles.");
                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please Enter Valid Number of Vehicles.");
            }

        }

        int aNbrTanks = 0;

        boolean numberTanks = false;
        while (numberTanks == false) {

            try {
                aNbrTanks = Integer.parseInt(JOptionPane.showInputDialog("Number Of Fuel Tanks To Be Mounted On The Vehicle: "));
                if (aNbrTanks == 2 || aNbrTanks == 4 || aNbrTanks == 8 || aNbrTanks == 8 || aNbrTanks == 10 || aNbrTanks == 15 || aNbrTanks == 20) {

                    numberTanks = true;

                } else {
                    JOptionPane.showMessageDialog(null, "Please Enter Valid Number of Fuel Tanks.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please Enter Valid Number of Fuel Tanks.");

            }

        }

        //Output data to use
        VehicleFactory vF = new VehicleFactory(aName, aPhone, aNbrVehicles, aNbrTanks);
        vF.calcManufacturingCost();
        vF.calcFuelTankCost();
        vF.calcSubtotal();
        vF.calcTax();
        vF.calcTotal();
        String summary = vF.getSummary();
        JOptionPane.showMessageDialog(null, summary);
    }

}
