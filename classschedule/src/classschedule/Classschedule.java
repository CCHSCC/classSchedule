/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classschedule;

import java.util.Scanner;

/**
 *
 * @author 21008
 */
public class Classschedule {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner inputScan = new Scanner(System.in);
        String studentName = "Ethan Akers";
        int graduationYr = 2021;
        String class1 = "|1| Religion | Gonzalez";
        String class2 = "|2| AP Computer Science A | Larrubia";
        String class3 = "|3| AP American Hist | Hermida";
        String class4 = "|4| AP English Lang | Crossman";
        String class5 = "|5| Rock Ensemble | Cooper";
        String class6 = "|6| Coll Alg & Trig | Ferguson";
        String class7 = "|7| AP Physics | Ferguson";
        String topHorMargin = "+-----------------------------------------------------------------------+";
        String botHorMargin = "+-----------------------------------------------------------------------+";

        
        System.out.println("My name is: " + studentName + " and I will graduate in: " + graduationYr);
        
        String callSched = "Call Schedule";
        
     
        System.out.println("Here is my schedule:");
        System.out.println(topHorMargin);
        System.out.println(class1);
        System.out.println(class2);
        System.out.println(class3);
        System.out.println(class4);
        System.out.println(class5);
        System.out.println(class6);
        System.out.println(class7);
       
        System.out.println(botHorMargin);
            
        
       
        
      
        
      
        
        

      
    }
    
}
