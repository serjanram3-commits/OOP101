/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author shram
 */
public class M3E4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("By: Ser Jan Perzeus H. Ram");
        
        System.out.println("Enter weight (in kilograms): ");
        double weight = scanner.nextDouble();
        
        System.out.println("Enter Height (in meters):");
        double height = scanner.nextDouble();
        
        double BMI = weight / (height * height);
        
        System.out.println("BMI: approximately " + BMI);
        scanner.close();
    }
}
