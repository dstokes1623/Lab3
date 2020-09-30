
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Client
 */
public class EvenOddCounter {
    
    public static void main(String[] args) {
        int numberofEven = 0;
        int numberofOdd = 0;
        Random rand = new Random();
        
        for(int i = 1; i <= 100; i++){
            int n = rand.nextInt(); //generate random number
            boolean isEven = isEven(n); //pass integer through even/odd test
            if (isEven){
                numberofEven += 1; //if isEven returns true add 1 to Even counter
            }    
            else
                numberofOdd += 1; //if isEven returns false add 1 to Odd counter    
        }
        
        System.out.println("Even numbers generated: " + numberofEven);
        System.out.println("Odd numbers generated: " + numberofOdd);
        
    }
    
    public static boolean isEven (int inputNumber){
        boolean isEven;
        if ((inputNumber % 2) == 0){
            isEven = true;
        }
        else{
            isEven = false;
        }
        
        return isEven;
    }
}
