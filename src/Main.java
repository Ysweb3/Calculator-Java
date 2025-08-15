import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);


    double num1, num2;
    System.out.println("Enter number 1:");
    num1 = scanner.nextDouble();
    System.out.println("Enter number 2 :");
    num2 = scanner.nextDouble();



    if(num1 == 0 ||num2 == 0){
        System.out.println("Cannot divide by Zero");
    }
    else {
        System.out.println(add(num1, num2));
        System.out.println(sub(num1, num2));
        System.out.println(mul(num1, num2));
        System.out.println(div(num1, num2));
    }

        scanner.close();
    }
    static double add(double num1,double num2){
        return num1+num2;
    }
    static double sub(double num1,double num2){
        return num1-num2;
    }
    static double mul(double num1,double num2){
        return num1*num2;
    }
    static double div(double num1,double num2){
        return num1/num2;
    }
}