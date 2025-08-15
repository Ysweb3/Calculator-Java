import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    JFrame frame = new JFrame();

    ImageIcon image = new ImageIcon("C:\\Users\\yashs\\OneDrive\\Desktop\\Projects\\Calculator\\src\\calculator.png");


    int height = 550;
    int width = 400;

    frame.setSize(width,height);
    frame.setTitle("Calculator");
    frame.setResizable(false);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    frame.setIconImage(image.getImage());
    frame.getContentPane().setBackground(new Color(59, 59, 59));

//    double num1, num2;
//    System.out.println("Enter number 1:");
//    num1 = scanner.nextDouble();
//    System.out.println("Enter number 2 :");
//    num2 = scanner.nextDouble();
//
//
//
//    if(num1 == 0 ||num2 == 0){
//        System.out.println("Cannot divide by Zero");
//    }
//    else {
//        System.out.println(add(num1, num2));
//        System.out.println(sub(num1, num2));
//        System.out.println(mul(num1, num2));
//        System.out.println(div(num1, num2));
//    }

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