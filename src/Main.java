
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class Main {
    static JButton buttonAc = new JButton();
    static JButton buttonC = new JButton();
    static JButton button1 = new JButton();
    static JButton button2 = new JButton();
    static JButton button3 = new JButton();
    static JButton button4 = new JButton();
    static JButton button5 = new JButton();
    static JButton button6 = new JButton();
    static JButton button7 = new JButton();
    static JButton button8 = new JButton();
    static JButton button9 = new JButton();
    static JButton button0 = new JButton();
    static JButton buttonDot = new JButton();
    static JButton buttonPercent = new JButton();
    static JButton buttonPlus = new JButton();
    static JButton buttonMinus = new JButton();
    static JButton buttonDivide = new JButton();
    static JButton buttonMultiply = new JButton();
    static JButton buttonEquals = new JButton();
    static JButton buttonPlaceHolder = new JButton();
    static String num1 ="", num2 = "";
    static boolean changeVariable = false;
    static String symbol = "";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        JFrame frame = new JFrame();
        ImageIcon image = new ImageIcon("C:\\Users\\yashs\\OneDrive\\Desktop\\Projects\\Calculator\\src\\calculator.png");
        Border border =  BorderFactory.createLineBorder(Color.WHITE,2);//border for testing


        int appHeight = 700;
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
        outputPanel.setBounds(0,150,400,550);
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


        buttonAc.setBounds(0,0,100,100);
        buttonAc.setText("AC");
        buttonAc.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                System.out.println("AC");
                num1 = "";
                num2 = "";
                symbol = "";
            }
        });
        outputPanel.add(buttonAc);

        buttonC.setBounds(100,0,100,100);
        buttonC.setText("C");
        buttonC.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                System.out.println("C");
            }
        });
        outputPanel.add(buttonC);

        buttonPercent.setBounds(200,0,100,100);
        buttonPercent.setText("%");
        buttonPercent.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                System.out.println("%");
                symbol = "%";
                changeVariable = true;

            }
        });
        outputPanel.add(buttonPercent);

        buttonDivide.setBounds(300,0,100,100);
        buttonDivide.setText("/");
        buttonDivide.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                System.out.println("/");
                symbol = "/";
                changeVariable = true;
            }
        });
        outputPanel.add(buttonDivide);

        buttonMultiply.setBounds(300,100,100,100);
        buttonMultiply.setText("x");
        buttonMultiply.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                System.out.println("x");
                symbol = "x";
                changeVariable = true;
            }
        });
        outputPanel.add(buttonMultiply);

        buttonMinus.setBounds(300,200,100,100);
        buttonMinus.setText("-");
        buttonMinus.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                System.out.println("-");
                symbol = "-";
                changeVariable = true;
            }
        });
        outputPanel.add(buttonMinus);

        buttonPlus.setBounds(300,300,100,100);
        buttonPlus.setText("+");
        buttonPlus.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                System.out.println("+");
                symbol = "+";
                changeVariable = true;
            }
        });
        outputPanel.add(buttonPlus);

        buttonEquals.setBounds(300,400,100,100);
        buttonEquals.setText("=");
        buttonEquals.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                changeVariable = false;
                System.out.println("=");
                switch (symbol){
                    case "+":
                        System.out.println(plus(num1,num2));
                        break;
                    case "-":
                        System.out.println(minus(num1,num2));
                        break;
                    case "x":
                        System.out.println(multiply(num1,num2));
                        break;
                    case "/":
                        System.out.println(division(num1,num2));
                        break;
                    case "%":
                        System.out.println(percentage(num1,num2));
                        break;

                }
            }
        });
        outputPanel.add(buttonEquals);

        button7.setBounds(0,100,100,100);
        button7.setText("7");
        button7.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                setValues("7");
            }
        });
        outputPanel.add(button7);

        button8.setBounds(100,100,100,100);
        button8.setText("8");
        button8.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                setValues("8");
            }
        });
        outputPanel.add(button8);

        button9.setBounds(200,100,100,100);
        button9.setText("9");
        button9.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                setValues("9");
            }
        });
        outputPanel.add(button9);

        button4.setBounds(0,200,100,100);
        button4.setText("4");
        button4.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                setValues("4");
            }
        });
        outputPanel.add(button4);

        button5.setBounds(100,200,100,100);
        button5.setText("5");
        button5.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                setValues("5");
            }
        });
        outputPanel.add(button5);

        button6.setBounds(200,200,100,100);
        button6.setText("6");
        button6.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                setValues("6");
            }
        });
        outputPanel.add(button6);

        button1.setBounds(0,300,100,100);
        button1.setText("1");
        button1.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                setValues("1");

            }
        });
        outputPanel.add(button1);

        button2.setBounds(100,300,100,100);
        button2.setText("2");
        button2.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                setValues("2");
            }
        });
        outputPanel.add(button2);

        button3.setBounds(200,300,100,100);
        button3.setText("3");
        button3.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                setValues("3");
            }
        });
        outputPanel.add(button3);

        buttonPlaceHolder.setBounds(0,400,100,100);
        buttonPlaceHolder.setText("abc");
        buttonPlaceHolder.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                System.out.println("abc");
            }
        });
        outputPanel.add(buttonPlaceHolder);

        button0.setBounds(100,400,100,100);
        button0.setText("0");
        button0.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                setValues("0");
            }
        });
        outputPanel.add(button0);

        buttonDot.setBounds(200,400,100,100);
        buttonDot.setText(".");
        buttonDot.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                System.out.println(".");
            }
        });
        outputPanel.add(buttonDot);












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

    static void setValues(String num){

        if (!changeVariable){
            num1  += num;
        }
        else {
            num2 += num;
            System.out.println(num1+"E");

        }
        System.out.println("num1= "+num1);
        System.out.println("num2= "+num2);
    }

    static double plus(String num1,String num2){
        double parseDouble1 = Double.parseDouble(num1);
        double parseDouble2 = Double.parseDouble(num2);
        return parseDouble1+parseDouble2;
    }
    static double minus(String num1,String num2){
        double parseDouble1 = Double.parseDouble(num1);
        double parseDouble2 = Double.parseDouble(num2);
        return parseDouble1-parseDouble2;
    }
    static double multiply(String num1,String num2){
        double parseDouble1 = Double.parseDouble(num1);
        double parseDouble2 = Double.parseDouble(num2);
        return parseDouble1*parseDouble2;
    }
    static double division(String num1,String num2){
        double parseDouble1 = Double.parseDouble(num1);
        double parseDouble2 = Double.parseDouble(num2);
        return parseDouble1/parseDouble2;
    }
    static double percentage(String num1,String num2){
        double parseDouble1 = Double.parseDouble(num1);
        double parseDouble2 = Double.parseDouble(num2);
        return (parseDouble1/parseDouble2) * 100;
    }

}