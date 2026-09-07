
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
public class M3E1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your Hours Worked: ");
        double hours_worked = scanner.nextDouble();
        
        System.out.print("Enter your Hourly Rate: ");
        double hourly_rate = scanner.nextDouble();
        
        double gross_salary = hours_worked * hourly_rate;
        
        System.out.println("Gross Salary: " + gross_salary);
        
        
        
        scanner.close();
    }
    
}
