
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Client
 */
public class BankCharges {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        //Prompt user to enter number of checks written in a month
        
        System.out.println("Enter the number of checks written this month");
        int checksWritten = keyboard.nextInt();
        
        //Define base fee of 10 dollars and checkFee
        
        double baseFee = 10;
        double checkFee = 0.10;
        
        //Determine service fees per check
        
        if (checksWritten >= 20 && checksWritten <= 39){
            checkFee = 0.08;
        }
        if (checksWritten >= 40 && checksWritten <= 59){
            checkFee = 0.06;
        }
        if (checksWritten >= 60){
            checkFee = 0.04;
        }
        
        //Calculate total service fees (base fee + (number of checks * check fee)
        
        double serviceFees = baseFee + (checkFee * checksWritten);
        String displayFees = String.format("%.2f", serviceFees);
        //Display service fees for the month
        System.out.println("Total service fees this month: $" + displayFees);
        
    }
    
}
