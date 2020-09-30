
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
public class isPrime {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter an integer value: ");
        
        int inputNumber = keyboard.nextInt();
        boolean isItPrime = checkIfPrime(inputNumber);
        
        if (isItPrime){
            System.out.println(inputNumber + " is a prime number");
        }
        
        else{
            System.out.println(inputNumber + " is not a prime number");
        }
        
    }
    
    public static boolean checkIfPrime (int inputNumber){
        boolean isItPrime = true;
        
        if (inputNumber <= 1){
            isItPrime = false;
        }
        
        else
        {
            for (int i = 2; i <= inputNumber; i++){
                if ((inputNumber % i) == 0)
                    isItPrime = false;
                
                break;
            }   
        }
        return isItPrime; 
        
    }
}