/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author shram
 */
public class M3E5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your Quiz grade: ");
        double quiz = scanner.nextDouble();
        
        System.out.print("Enter your Project Grade:");
        double project = scanner.nextDouble();
        
        System.out.print("Enter your exam grade: ");
        double exam = scanner.nextDouble();
        
        quiz = quiz * 0.30;
        project = project * 0.30;
        exam = exam * 0.40;
        
        double fgrade = quiz + project + exam;
        
        System.out.println("Final grade: " + fgrade);
        scanner.close();
    }
}
