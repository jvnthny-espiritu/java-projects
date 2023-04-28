
/**
 * Calculator GUI using Java Swing
 *
 * @author Jave Anthony Espiritu
 * @version 2.0
 */

import javax.swing.*;
import java.awt.*;
import java.awt.EventQueue;
import java.awt.event.*;

public class Calculator
{
    public JFrame frame;
    public JTextField textfield;
    public double a, b, result;
    String answer, operation;
    
    public Calculator() {
        inititalize();
    }
    
    private void inititalize() {
        frame = new JFrame("Calculator");
        
        frame.setSize(325, 250);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        textfield = new JTextField();
        textfield.setHorizontalAlignment(SwingConstants.RIGHT);
        textfield.setBounds(10, 10, 290, 30);
        frame.getContentPane().add(textfield);
        textfield.setColumns(10);
            
        // Row 1
        
        JButton b7 = new JButton("7");
        b7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String num=textfield.getText()+b7.getText();
                textfield.setText(num);
            }
        });
        b7.setBounds(10, 50, 50, 30);
        frame.getContentPane().add(b7);

        JButton b8 = new JButton("8");
        b8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String num=textfield.getText()+b8.getText();
                textfield.setText(num);
            }
        });
        b8.setBounds(70, 50, 50, 30);
        frame.getContentPane().add(b8);
            
        JButton b9 = new JButton("9");
        b9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String num=textfield.getText()+b9.getText();
                textfield.setText(num);
            }
        });
        b9.setBounds(130, 50, 50, 30);
        frame.getContentPane().add(b9);
        
        JButton del = new JButton("<");
        del.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) {
                try {
                    String text;
                    if (textfield.getText().length()>0) {
                        StringBuilder string = new StringBuilder(textfield.getText());
                        string.deleteCharAt(textfield.getText().length()-1);
                        text = string.toString();
                        textfield.setText(text);
                    }} catch(Exception e1) {}
            }
        });
        del.setBounds(190, 50, 50, 30);
        frame.getContentPane().add(del);
        
        JButton ac = new JButton("AC");
        ac.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e) {
                textfield.setText(null);
            }
        });
        ac.setBounds(250, 50, 50, 30);
        frame.getContentPane().add(ac);
        
        // Row 2
        
        JButton b4 = new JButton("4");
        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String num=textfield.getText()+b4.getText();
                textfield.setText(num);
            }
        });
        b4.setBounds(10, 90, 50, 30);
        frame.getContentPane().add(b4);

        JButton b5 = new JButton("5");
        b5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String num=textfield.getText()+b5.getText();
                textfield.setText(num);
            }
        });
        b5.setBounds(70, 90, 50, 30);
        frame.getContentPane().add(b5);
            
        JButton b6 = new JButton("6");
        b6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String num=textfield.getText()+b6.getText();
                textfield.setText(num);
            }
        });
        b6.setBounds(130, 90, 50, 30);
        frame.getContentPane().add(b6);
        
        JButton multiply = new JButton("x");
        multiply.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    a=Double.parseDouble(textfield.getText());
                    textfield.setText("");
                    operation="x";
                } catch (Exception e1) {}
            }
        });
        multiply.setBounds(190, 90, 50, 30);
        frame.getContentPane().add(multiply);
        
        JButton divide = new JButton("/");
        divide.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    a=Double.parseDouble(textfield.getText());
                    textfield.setText("");
                    operation="/";
                } catch (Exception e1) {}
            }
        });
        divide.setBounds(250, 90, 50, 30);
        frame.getContentPane().add(divide);
        
        // Row 3
        
        JButton b1 = new JButton("1");
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String num=textfield.getText()+b1.getText();
                textfield.setText(num);
            }
        });
        b1.setBounds(10, 130, 50, 30);
        frame.getContentPane().add(b1);

        JButton b2 = new JButton("2");
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String num=textfield.getText()+b2.getText();
                textfield.setText(num);
            }
        });
        b2.setBounds(70, 130, 50, 30);
        frame.getContentPane().add(b2);
            
        JButton b3 = new JButton("3");
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String num=textfield.getText()+b3.getText();
                textfield.setText(num);
            }
        });
        b3.setBounds(130, 130, 50, 30);
        frame.getContentPane().add(b3);
        
        JButton add = new JButton("+");
        add.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    a=Double.parseDouble(textfield.getText());
                    textfield.setText("");
                    operation="+";
                } catch (Exception e1) {}
            }
        });
        add.setBounds(190, 130, 50, 30);
        frame.getContentPane().add(add);
        
        JButton minus = new JButton("-");
        minus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    a=Double.parseDouble(textfield.getText());
                    textfield.setText("");
                    operation="-";
                } catch (Exception e1) {}
            }
        });
        minus.setBounds(250, 130, 50, 30);
        frame.getContentPane().add(minus);
        
        // Row 4
        
        JButton b0 = new JButton("0");
        b0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String num=textfield.getText()+b0.getText();
                textfield.setText(num);
            }
        });
        b0.setBounds(10, 170, 50, 30);
        frame.getContentPane().add(b0);
        
        JButton dot = new JButton(".");
        dot.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	    try{
        	        String num=textfield.getText()+dot.getText();
        	        textfield.setText(num);
        	    } catch (Exception e1) {}
            }
        });
        dot.setBounds(70, 170, 50, 30);
        frame.getContentPane().add(dot);
        
    	JButton modulo = new JButton("%");
	    modulo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    a=Double.parseDouble(textfield.getText());
                    textfield.setText("");
                    operation="%";
                } catch (Exception e1) {}
            }
        });
        modulo.setBounds(130, 170, 50, 30);
        frame.getContentPane().add(modulo);
        
        JButton equal = new JButton("=");
        equal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    b=Double.parseDouble(textfield.getText());
                    switch(operation) {
                        case "+":
                            result=a+b;
                            answer=String.format("%.2f",result);
                            textfield.setText(answer);	
                            break;
                        case "-":
                            result=a-b;
                            answer=String.format("%.2f",result);
                            textfield.setText(answer);	
                            break;
                        case "x":
                            result=a*b;
                            answer=String.format("%.2f",result);
                            textfield.setText(answer);	
                            break;
                        case "/":
                            result=a/b;
                            answer=String.format("%.2f",result);
                            textfield.setText(answer);	
                            break;
                        case "%":
                            result=a%b;
                            answer=String.format("%.2f",result);
                            textfield.setText(answer);	
                            break;
                    }} catch(Exception e1){}
			}
		});
		equal.setBounds(190, 170, 110, 30);
		frame.getContentPane().add(equal);
    }
}
