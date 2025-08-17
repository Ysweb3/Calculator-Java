
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
    static JLabel labelOutput = new JLabel();

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

        JPanel outputPanel = new JPanel();
        outputPanel.setBackground(Color.red);
        outputPanel.setBounds(0,0,400,150);
        frame.add(outputPanel);

        JPanel inputPanel = new JPanel();
        inputPanel.setBackground(Color.green);
        inputPanel.setBounds(0,150,400,550);
        frame.add(inputPanel);

        JLabel labelEq = new JLabel();
        labelEq.setText("00");//default text
        labelEq.setBounds(0,45,385, 100);
        labelEq.setForeground(new Color(105, 105, 105));
        labelEq.setFont(new Font("",Font.PLAIN,25));//empty for default font
        labelEq.setHorizontalAlignment(SwingConstants.RIGHT);
        outputPanel.add(labelEq);

        labelOutput.setText("00");//default text
        labelOutput.setBounds(0,80,385, 100);
        labelOutput.setForeground(new Color(255,255,255));
        labelOutput.setFont(new Font("",Font.BOLD,45));//empty for default font
        labelOutput.setHorizontalAlignment(SwingConstants.RIGHT);
        outputPanel.add(labelOutput);

        int buttonHeight = 95;
        int buttonWidth = 95;

        buttonAc.setBounds(0,0,buttonWidth,buttonHeight);
        buttonAc.setPreferredSize(new Dimension(buttonWidth,buttonHeight));
        buttonAc.setText("AC");
        buttonAc.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                System.out.println("AC");
                num1 = "";
                num2 = "";
                symbol = "";
            }
        });
        inputPanel.add(buttonAc);

        buttonC.setBounds(100,0,buttonWidth,buttonHeight);
        buttonC.setPreferredSize(new Dimension(buttonWidth,buttonHeight));
        buttonC.setText("C");
        buttonC.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                System.out.println("C");
//                num1 = num1.substring(0, num1.length() - 1);
            }
        });
        inputPanel.add(buttonC);

        buttonPercent.setBounds(200,0,buttonWidth,buttonHeight);
        buttonPercent.setPreferredSize(new Dimension(buttonWidth,buttonHeight));
        buttonPercent.setText("%");
        buttonPercent.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                System.out.println("%");
                symbol = "%";
                changeVariable = true;

            }
        });
        inputPanel.add(buttonPercent);

        buttonDivide.setBounds(300,0,buttonWidth,buttonHeight);
        buttonDivide.setPreferredSize(new Dimension(buttonWidth,buttonHeight));
        buttonDivide.setText("/");
        buttonDivide.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                System.out.println("/");
                symbol = "/";
                changeVariable = true;
            }
        });
        inputPanel.add(buttonDivide);

        button7.setBounds(0,100,buttonWidth,buttonHeight);
        button7.setPreferredSize(new Dimension(buttonWidth,buttonHeight));
        button7.setText("7");
        button7.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                setValues("7");
            }
        });
        inputPanel.add(button7);

        button8.setBounds(100,100,buttonWidth,buttonHeight);
        button8.setPreferredSize(new Dimension(buttonWidth,buttonHeight));
        button8.setText("8");
        button8.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                setValues("8");
            }
        });
        inputPanel.add(button8);

        button9.setBounds(200,100,buttonWidth,buttonHeight);
        button9.setPreferredSize(new Dimension(buttonWidth,buttonHeight));
        button9.setText("9");
        button9.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                setValues("9");
            }
        });
        inputPanel.add(button9);

        buttonMultiply.setBounds(300,100,buttonWidth,buttonHeight);
        buttonMultiply.setPreferredSize(new Dimension(buttonWidth,buttonHeight));
        buttonMultiply.setText("x");
        buttonMultiply.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                System.out.println("x");
                symbol = "x";
                changeVariable = true;
            }
        });
        inputPanel.add(buttonMultiply);

        button4.setBounds(0,200,buttonWidth,buttonHeight);
        button4.setPreferredSize(new Dimension(buttonWidth,buttonHeight));
        button4.setText("4");
        button4.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                setValues("4");
            }
        });
        inputPanel.add(button4);

        button5.setBounds(100,200,buttonWidth,buttonHeight);
        button5.setPreferredSize(new Dimension(buttonWidth,buttonHeight));
        button5.setText("5");
        button5.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                setValues("5");
            }
        });
        inputPanel.add(button5);

        button6.setBounds(200,200,buttonWidth,buttonHeight);
        button6.setPreferredSize(new Dimension(buttonWidth,buttonHeight));
        button6.setText("6");
        button6.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                setValues("6");
            }
        });
        inputPanel.add(button6);

        buttonMinus.setBounds(300,200,buttonWidth,buttonHeight);
        buttonMinus.setPreferredSize(new Dimension(buttonWidth,buttonHeight));
        buttonMinus.setText("-");
        buttonMinus.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                System.out.println("-");
                symbol = "-";
                changeVariable = true;
            }
        });
        inputPanel.add(buttonMinus);

        button1.setBounds(0,300,buttonWidth,buttonHeight);
        button1.setPreferredSize(new Dimension(buttonWidth,buttonHeight));
        button1.setText("1");
        button1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                setValues("1");

            }
        });
        inputPanel.add(button1);

        button2.setBounds(100,300,buttonWidth,buttonHeight);
        button2.setPreferredSize(new Dimension(buttonWidth,buttonHeight));
        button2.setText("2");
        button2.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                setValues("2");
            }
        });
        inputPanel.add(button2);

        button3.setBounds(200,300,buttonWidth,buttonHeight);
        button3.setPreferredSize(new Dimension(buttonWidth,buttonHeight));
        button3.setText("3");
        button3.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                setValues("3");
            }
        });
        inputPanel.add(button3);


        buttonPlus.setBounds(300,300,buttonWidth,buttonHeight);
        buttonPlus.setPreferredSize(new Dimension(buttonWidth,buttonHeight));
        buttonPlus.setText("+");
        buttonPlus.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                System.out.println("+");
                symbol = "+";
                changeVariable = true;
            }
        });
        inputPanel.add(buttonPlus);

        buttonPlaceHolder.setBounds(0,400,buttonWidth,buttonHeight);
        buttonPlaceHolder.setPreferredSize(new Dimension(buttonWidth,buttonHeight));
        buttonPlaceHolder.setText("abc");
        buttonPlaceHolder.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                System.out.println("abc");
            }
        });
        inputPanel.add(buttonPlaceHolder);

        button0.setBounds(100,400,buttonWidth,buttonHeight);
        button0.setPreferredSize(new Dimension(buttonWidth,buttonHeight));
        button0.setText("0");
        button0.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                setValues("0");
            }
        });
        inputPanel.add(button0);

        buttonDot.setBounds(200,400,buttonWidth,buttonHeight);
        buttonDot.setPreferredSize(new Dimension(buttonWidth,buttonHeight));
        buttonDot.setText(".");
        buttonDot.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                System.out.println(".");
            }
        });
        inputPanel.add(buttonDot);

        buttonEquals.setBounds(300,400,buttonWidth,buttonHeight);
        buttonEquals.setPreferredSize(new Dimension(buttonWidth,buttonHeight));
        buttonEquals.setText("=");
        buttonEquals.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                changeVariable = false;
                System.out.println("=");
                switch (symbol){
                    case "+":
                        displayOutput(plus(num1,num2));
                        System.out.println(plus(num1,num2));
                        break;
                    case "-":
                        displayOutput(minus(num1,num2));
                        System.out.println(minus(num1,num2));
                        break;
                    case "x":
                        displayOutput(multiply(num1,num2));
                        System.out.println(multiply(num1,num2));
                        break;
                    case "/":
                        displayOutput(division(num1,num2));
                        System.out.println(division(num1,num2));
                        break;
                    case "%":
                        displayOutput(percentage(num1,num2));
                        System.out.println(percentage(num1,num2));
                        break;

                }
            }
        });
        inputPanel.add(buttonEquals);




























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
    static void displayOutput(double output){
        labelOutput.setText(String.valueOf(output));
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