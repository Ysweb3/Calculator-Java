import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.Color;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    JFrame frame = new JFrame();
    ImageIcon image = new ImageIcon("C:\\Users\\yashs\\OneDrive\\Desktop\\Projects\\Calculator\\src\\calculator.png");
    Border border =  BorderFactory.createLineBorder(Color.WHITE,2);


    int appHeight = 600;
    int appWidth = 400;

    frame.setSize(appWidth,appHeight);
    frame.setTitle("Calculator");
    frame.setResizable(false);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    frame.setIconImage(image.getImage());
    frame.setLayout(null);
    frame.getContentPane().setBackground(new Color(59, 59, 59));

    JPanel inputPanel = new JPanel();
    inputPanel.setBackground(Color.red);
    inputPanel.setBounds(0,0,400,150);
    frame.add(inputPanel);

    JPanel outputPanel = new JPanel();
    outputPanel.setBackground(Color.green);
    outputPanel.setBounds(0,150,400,450);
    frame.add(outputPanel);

    JLabel labelEq = new JLabel();
    labelEq.setText("00");//default text
    labelEq.setBounds(0,45,385, 100);
    labelEq.setForeground(new Color(105, 105, 105));
    labelEq.setFont(new Font("",Font.PLAIN,25));//empty for default font
    labelEq.setHorizontalAlignment(SwingConstants.RIGHT);
    inputPanel.add(labelEq);

    JLabel labelOutput = new JLabel();
    labelOutput.setText("00");//default text
    labelOutput.setBounds(0,80,385, 100);
    labelOutput.setForeground(new Color(255,255,255));
    labelOutput.setFont(new Font("",Font.BOLD,45));//empty for default font
    labelOutput.setHorizontalAlignment(SwingConstants.RIGHT);
    inputPanel.add(labelOutput);



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