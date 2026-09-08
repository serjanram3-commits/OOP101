/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author shram
 */
public class M3E2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter Product Price: ");
        double product_price = scanner.nextDouble();
        
        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();
        
        double subtotal = product_price + quantity;
        double VAT = subtotal * 0.12;
        double total = VAT + subtotal;
        
        System.out.println("Subtotal: " + subtotal);
        System.out.println(" VAT: " + VAT);
        System.out.println("Total: " + total);
        
        scanner.close();
    }
    
}
