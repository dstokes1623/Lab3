
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
public class PaintJobEstimator {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        // get number of rooms, price of paint per gallon, and total square footage
        System.out.println("Enter the number of rooms to be painted: ");
        
        int numberofRooms = keyboard.nextInt();
        double totalSqFootage = 0;
        
        System.out.println("Enter the price of the paint per gallon: ");
        
        double pricePerGallon = keyboard.nextDouble();
        
        
        for (int i = 1; i <= numberofRooms; i++){
            System.out.println("Enter the square footage for room " + i);
            totalSqFootage += keyboard.nextDouble(); 
        
        }
        
        // calculate gallons of paint required
        double gallonsRequired = calculateGallonsofPaint(totalSqFootage);
        
        // calculate cost of paint
        
        double costofPaint = calculateCostofPaint(gallonsRequired, pricePerGallon);
        
        // calculate total hours of labor required
        double laborHoursRequired = calculateLaborHoursRequired(totalSqFootage);
        // calculate cost of labor
        double costofLabor = calculateLaborCharges(laborHoursRequired);
        // calculate total cost of the paint job
        double totalCost = calculateTotalCost(costofLabor, costofPaint);
        
        //round values to 2 decimals
        
        String displayGallons = String.format("%.2f", gallonsRequired);
        String displayLaborHours = String.format("%.2f", laborHoursRequired);
        String displayLaborCost = String.format("%.2f", costofLabor);
        String displayPaintCost = String.format("%.2f", costofPaint);
        String displayTotalCost = String.format("%.2f", totalCost);
        
        // display all data
        
        System.out.println("Gallons of paint required: " + displayGallons);
        System.out.println("Labor hours required: " + displayLaborHours);
        System.out.println("Cost of paint: $" + displayPaintCost);
        System.out.println("Cost of labor: $" + displayLaborCost);
        System.out.println("Total cost: $" + displayTotalCost);
    }
    
    public static double calculateGallonsofPaint(double totalSqFootage){
        final double SQFEET_PER_GALLON = 115;
        return totalSqFootage / SQFEET_PER_GALLON;
         
    }
    
    public static double calculateCostofPaint(double gallonsRequired, double pricePerGallon){
        return gallonsRequired * pricePerGallon;
    }
    
    public static double calculateLaborHoursRequired(double totalSqFootage){
        // sqft able to be completed per hour is equal to 115 / 8 
        final double SQFT_PER_HOUR = 14.375;
        return totalSqFootage / SQFT_PER_HOUR;
    }
    
    public static double calculateLaborCharges(double laborHoursRequired){
        final double COST_OF_LABOR_PER_HOUR = 18.00;
        return laborHoursRequired * COST_OF_LABOR_PER_HOUR;
    }
    public static double calculateTotalCost (double costofLabor, double costofPaint){
        return costofLabor + costofPaint;
    }
    
}

