/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner; 
/**
 *
 * @author shram
 */
public class M3E3 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         
         System.out.println("By: Ser Jan Perzeus H. Ram");
         System.out.println("Enter temperature (in celcius): " );
         double C = scanner.nextDouble();
         
         double F = (C * 9 / 5) + 32;
         
         System.out.println("Fahrenheit: " + F);
         
         scanner.close();
    }
    
}
