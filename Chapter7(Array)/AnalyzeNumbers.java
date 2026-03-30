/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapater7Problems;

/**
 *
 * @author Ali Khan
 */
public class AnalyzeNumbers {
    public static void main(String[] args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        
        System.out.print("Enter the size of array: ");
        int n = input.nextInt();
        double[] numbers = new double[n];
        
        System.out.println("Enter the elements: ");
        double sum = 0;
        for(int i=0; i<numbers.length;i++ ){
            numbers[i] = input.nextDouble();
            sum += numbers[i];
        }
        
        double average = sum / numbers.length;
        
        int count = 0;
        for(double e : numbers){
            if(e > average){
                count++;
            }
        }
        
        System.out.println("The average is " + average);
        System.out.println("The number of element above the average is "+ count);
        
        
        
        
    }
    
    
}
