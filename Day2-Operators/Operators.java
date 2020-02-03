import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

  
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        double meal_cost = scanner.nextDouble();
        
        int tip_percent = scanner.nextInt();
       
        int tax_percent = scanner.nextInt();
       
       

        
         double tip = meal_cost * tip_percent / 100;
        double tax = meal_cost * tax_percent / 100;
        double Roundvalue = tip + tax + meal_cost;
        // cast the result of the rounding operation to an int and save it as totalCost 
        int totalCost = (int) Math.round(Roundvalue);
      
        System.out.println(totalCost);
        scanner.close();
    }
}

