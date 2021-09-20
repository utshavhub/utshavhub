package Calc;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Color;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.text.Document;

import java.awt.SystemColor;

public class Calculator {

	private JFrame frame;
	double num1;
	double num2;
	double result;
	String operation;
    String answer;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("“d‘ì");
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.setBackground(Color.BLACK);
		frame.setBounds(100, 100, 262, 351);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		JTextField textField = new JTextField();
	    textField.setDocument(new JTextFieldCharLimit(10));
	    textField.setForeground(Color.WHITE);
		textField.setBackground(Color.GRAY);
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setFont(new Font("MS UI Gothic", Font.BOLD | Font.ITALIC, 20));
		textField.setBounds(12, 10, 229, 46);
		frame.getContentPane().add(textField);
		textField.setColumns(15);
		
		
		JButton btn0 = new JButton("0");
		btn0.setBackground(Color.WHITE);
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String  number =textField.getText()+btn0.getText();
				textField.setText(number);
			}
		});
		btn0.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 20));
		btn0.setBounds(12, 240, 58, 35);
		frame.getContentPane().add(btn0);
		
		JButton btnDot = new JButton(".");
		btnDot.setBackground(Color.WHITE);
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String  number =textField.getText()+btnDot.getText();
				textField.setText(number);
			}
		});
		btnDot.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 20));
		btnDot.setBounds(69, 240, 58, 35);
		frame.getContentPane().add(btnDot);
		

		JButton btn1 = new JButton("1");
		btn1.setBackground(Color.WHITE);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String  number =textField.getText()+btn1.getText();
				textField.setText(number);
				
			}
		});
		btn1.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 20));
		btn1.setBounds(12, 204, 58, 29);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.setBackground(Color.WHITE);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String  number =textField.getText()+btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 20));
		btn2.setBounds(69, 204, 58, 29);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.setBackground(Color.WHITE);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String  number =textField.getText()+btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 20));
		btn3.setBounds(126, 204, 58, 29);
		frame.getContentPane().add(btn3);

		JButton btn4 = new JButton("4");
		btn4.setBackground(Color.WHITE);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String  number =textField.getText()+btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 20));
		btn4.setBounds(12, 162, 58, 35);
		frame.getContentPane().add(btn4);

		JButton btn5 = new JButton("5");
		btn5.setBackground(Color.WHITE);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String  number =textField.getText()+btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 20));
		btn5.setBounds(69, 162, 58, 35);
		frame.getContentPane().add(btn5);

		JButton btn6 = new JButton("6");
		btn6.setBackground(Color.WHITE);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String  number =textField.getText()+btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 20));
		btn6.setBounds(126, 162, 58, 35);
		frame.getContentPane().add(btn6);

		JButton btn7 = new JButton("7");
		btn7.setBackground(Color.WHITE);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String  number =textField.getText()+btn7.getText();
			textField.setText(number);
			}
		});
		btn7.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 20));
		btn7.setBounds(12, 121, 58, 35);
		frame.getContentPane().add(btn7);

		JButton btn8 = new JButton("8");
		btn8.setBackground(Color.WHITE);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String  number =textField.getText()+btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 20));
		btn8.setBounds(69, 121, 58, 35);
		frame.getContentPane().add(btn8);

		JButton btn9 = new JButton("9");
		btn9.setBackground(Color.WHITE);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String  number =textField.getText()+btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 20));
		btn9.setBounds(126, 121, 58, 35);
		frame.getContentPane().add(btn9);
		
		JButton btnBackSpace = new JButton("B");
		btnBackSpace.setBackground(Color.WHITE);
		btnBackSpace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String BackSpace = null;
				if(textField.getText().length()>0) {
					StringBuilder str = new StringBuilder(textField.getText());
							str.deleteCharAt(textField.getText().length()-1);
					BackSpace =str.toString();
					textField.setText(BackSpace);
				}
			}
		});
		btnBackSpace.setFont(new Font("Sitka Subheading", Font.BOLD, 20));
		btnBackSpace.setBounds(12, 66, 58, 46);
		frame.getContentPane().add(btnBackSpace);
		
		
		JButton btnClear = new JButton("C");
		btnClear.setBackground(Color.WHITE);
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnClear.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 20));
		btnClear.setBounds(69, 66, 58, 46);
		frame.getContentPane().add(btnClear);
		
		JButton btnd0 = new JButton("00");
		btnd0.setBackground(Color.WHITE);
		btnd0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String  number =textField.getText()+btnd0.getText();
				textField.setText(number);
			}
		});
		btnd0.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 13));
		btnd0.setBounds(126, 66, 58, 46);
		frame.getContentPane().add(btnd0);
		
		
		JButton btnEqual = new JButton("=");
		btnEqual.setBackground(Color.WHITE);
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				num2=Double.parseDouble(textField.getText());
				if (operation =="+") {
					result=num1+num2;
					answer=String.format("%.2f",result);
					textField.setText(answer);
				}
				else if(operation =="-") {
					result=num1-num2;
					answer=String.format("%.2f",result);
					textField.setText(answer);
				}
				else if(operation =="*") {
					result=num1*num2;
					answer=String.format("%.2f",result);
					textField.setText(answer);
				}
				else if(operation =="/") {
					result=num1/num2;
					answer=String.format("%.2f",result);
					textField.setText(answer);
				
			}
			}
		});
		btnEqual.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 20));
		btnEqual.setBounds(136, 240, 105, 35);
		frame.getContentPane().add(btnEqual);
		
		JButton btnAdd = new JButton("+");
		btnAdd.setBackground(Color.WHITE);
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "+";
			}
		});
		
		btnAdd.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 20));
		btnAdd.setBounds(184, 66, 58, 46);
		frame.getContentPane().add(btnAdd);
		
		JButton btnSub = new JButton("-");
		btnSub.setBackground(Color.WHITE);
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "-";
			}
		});
		
		btnSub.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 23));
		btnSub.setBounds(184, 121, 58, 35);
		frame.getContentPane().add(btnSub);
		
		JButton btnMult = new JButton("*");
		btnMult.setBackground(Color.WHITE);
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "*";
			}
		});
		
		btnMult.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 23));
		btnMult.setBounds(184, 162, 58, 35);
		frame.getContentPane().add(btnMult);
		
		JButton btnDiv = new JButton("/");
		btnDiv.setBackground(Color.WHITE);
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "/";
			}
		});
		
		btnDiv.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 20));
		btnDiv.setBounds(184, 204, 58, 29);
		frame.getContentPane().add(btnDiv);
	}
}
