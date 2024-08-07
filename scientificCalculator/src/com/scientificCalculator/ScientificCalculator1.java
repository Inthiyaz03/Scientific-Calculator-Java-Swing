package com.scientificCalculator;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.TitledBorder;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
//import javax.management.StringValueExp;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class ScientificCalculator1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	double first;
	double second;
	double result;
	String operation;
	String answer;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ScientificCalculator1 frame = new ScientificCalculator1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ScientificCalculator1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 363, 710);
		contentPane = new JPanel();
		contentPane.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SCIENTIFIC CALCULATOR");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel.setBounds(10, 25, 311, 64);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setBounds(10, 78, 311, 85);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton bt7 = new JButton("7");
		bt7.setEnabled(false);
		bt7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+bt7.getText();
				textField.setText(number);
			}
		});
		bt7.setFont(new Font("Tahoma", Font.BOLD, 20));
		bt7.setBounds(85, 404, 51, 51);
		contentPane.add(bt7);
		
		JButton bt4 = new JButton("4");
		bt4.setEnabled(false);
		bt4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+bt4.getText();
				textField.setText(number);
			}
		});
		bt4.setFont(new Font("Tahoma", Font.BOLD, 20));
		bt4.setBounds(85, 457, 51, 51);
		contentPane.add(bt4);
		
		JButton bt8 = new JButton("8");
		bt8.setEnabled(false);
		bt8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+bt8.getText();
				textField.setText(number);
			}
		});
		bt8.setFont(new Font("Tahoma", Font.BOLD, 20));
		bt8.setBounds(146, 404, 51, 51);
		contentPane.add(bt8);
		
		JButton bt5 = new JButton("5");
		bt5.setEnabled(false);
		bt5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+bt5.getText();
				textField.setText(number);
			}
		});
		bt5.setFont(new Font("Tahoma", Font.BOLD, 20));
		bt5.setBounds(146, 457, 51, 51);
		contentPane.add(bt5);
		
		JButton bt9 = new JButton("9");
		bt9.setEnabled(false);
		bt9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+bt9.getText();
				textField.setText(number);
			}
		});
		bt9.setFont(new Font("Tahoma", Font.BOLD, 20));
		bt9.setBounds(207, 404, 51, 51);
		contentPane.add(bt9);
		
		JButton bt6 = new JButton("6");
		bt6.setEnabled(false);
		bt6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+bt6.getText();
				textField.setText(number);
			}
		});
		bt6.setFont(new Font("Tahoma", Font.BOLD, 20));
		bt6.setBounds(207, 457, 51, 51);
		contentPane.add(bt6);
		
		JButton bt2 = new JButton("2");
		bt2.setEnabled(false);
		bt2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+bt2.getText();
				textField.setText(number);
			}
		});
		bt2.setFont(new Font("Tahoma", Font.BOLD, 20));
		bt2.setBounds(146, 518, 51, 51);
		contentPane.add(bt2);
		
		JButton bt1 = new JButton("1");
		bt1.setEnabled(false);
		bt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+bt1.getText();
				textField.setText(number);
			}
		});
		bt1.setFont(new Font("Tahoma", Font.BOLD, 20));
		bt1.setBounds(85, 518, 51, 51);
		contentPane.add(bt1);
		
		JButton bt3 = new JButton("3");
		bt3.setEnabled(false);
		bt3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+bt3.getText();
				textField.setText(number);
			}
		});
		bt3.setFont(new Font("Tahoma", Font.BOLD, 20));
		bt3.setBounds(207, 518, 51, 51);
		contentPane.add(bt3);
		
		JButton bt0 = new JButton("0");
		bt0.setEnabled(false);
		bt0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+bt0.getText();
				textField.setText(number);
			}
		});
		bt0.setFont(new Font("Tahoma", Font.BOLD, 20));
		bt0.setBounds(85, 579, 112, 51);
		contentPane.add(bt0);
		
		JButton btdot = new JButton(".");
		btdot.setEnabled(false);
		btdot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btdot.setBackground(new Color(240, 240, 240));
		btdot.setFont(new Font("Tahoma", Font.BOLD, 20));
		btdot.setBounds(207, 579, 51, 51);
		contentPane.add(btdot);
		
		JButton btequal = new JButton("=");
		btequal.setEnabled(false);
		btequal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				second = Double.parseDouble(textField.getText());
				if(operation=="+") {
					result = first+second;
					answer= String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="-") {
					result = first-second;
					answer= String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="*") {
					result = first*second;
					answer= String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="/") {
					result = first/second;
					answer= String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="%") {
					result = first%second;
					answer= String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="x^y") {
					
					double result = 1;
					for(int i=0;i<second;i++) {
						result = first*result;
					}
					answer= String.format("%.2f", result);
					textField.setText(answer);
				}
				
			}
		});
		btequal.setFont(new Font("Tahoma", Font.BOLD, 20));
		btequal.setBounds(270, 579, 51, 51);
		contentPane.add(btequal);
		
		JButton btslash = new JButton("/");
		btslash.setEnabled(false);
		btslash.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText(null);
				operation = "/";
			}
		});
		btslash.setFont(new Font("Tahoma", Font.BOLD, 20));
		btslash.setBounds(270, 518, 51, 51);
		contentPane.add(btslash);
		
		JButton btstar = new JButton("*");
		btstar.setEnabled(false);
		btstar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText(null);
				operation = "*";
			}
		});
		btstar.setFont(new Font("Tahoma", Font.BOLD, 20));
		btstar.setBounds(270, 457, 51, 51);
		contentPane.add(btstar);
		
		JButton btminus = new JButton("-");
		btminus.setEnabled(false);
		btminus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText(null);
				operation = "-";
			}
		});
		btminus.setFont(new Font("Tahoma", Font.BOLD, 20));
		btminus.setBounds(270, 404, 51, 51);
		contentPane.add(btminus);
		
		JButton btplus = new JButton("+");
		btplus.setEnabled(false);
		btplus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText(null);
				operation = "+";
			}
		});
		btplus.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btplus.setBounds(270, 343, 51, 51);
		contentPane.add(btplus);
		
		JButton btnXy = new JButton("X^Y");
		btnXy.setEnabled(false);
		btnXy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText(null);
				operation = "x^y";
				
			}
		});
		btnXy.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnXy.setBounds(10, 343, 69, 51);
		contentPane.add(btnXy);
		
		JButton btnX_1 = new JButton("X^3");
		btnX_1.setEnabled(false);
		btnX_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = (Double.parseDouble(textField.getText()));
				a=a*a*a;
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnX_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnX_1.setBounds(10, 404, 69, 51);
		contentPane.add(btnX_1);
		
		JButton btnX = new JButton("X^2");
		btnX.setEnabled(false);
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = (Double.parseDouble(textField.getText()));
				a=a*a;
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnX.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnX.setBounds(10, 457, 69, 51);
		contentPane.add(btnX);
		
		JButton btnN = new JButton("n!");
		btnN.setEnabled(false);
		btnN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Double.parseDouble(textField.getText());
				double factorial =1;
				while(a!=0) {
					factorial = factorial*a;
					a--;
				}
				textField.setText("");
				textField.setText(textField.getText()+factorial);
				
				
			}
		});
		btnN.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnN.setBounds(10, 518, 69, 51);
		contentPane.add(btnN);
		
		JButton btplus_5 = new JButton("+/-");
		btplus_5.setEnabled(false);
		btplus_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Double.parseDouble(String.valueOf(textField.getText()));
				a=a*(-1);
				textField.setText(String.valueOf(a));
			}
		});
		btplus_5.setForeground(new Color(0, 0, 0));
		btplus_5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btplus_5.setBounds(10, 579, 69, 51);
		contentPane.add(btplus_5);
		
		JButton btplus_6 = new JButton("%");
		btplus_6.setEnabled(false);
		btplus_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText(null);
				operation = "%";
			}
		});
		btplus_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		btplus_6.setBounds(85, 343, 51, 51);
		contentPane.add(btplus_6);
		
		JButton btnC = new JButton("C");
		btnC.setEnabled(false);
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null); 
			}
		});
		btnC.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnC.setBounds(146, 343, 51, 51);
		contentPane.add(btnC);
		
		JButton btnB = new JButton("\uF0E7");
		btnB.setEnabled(false);
		btnB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backspace = null;
				if(textField.getText().length()>0) {
					StringBuilder str = new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backspace=str.toString();
					textField.setText(backspace);
					
				}
				
			}
		});
		btnB.setFont(new Font("Wingdings", Font.PLAIN, 16));
		btnB.setBounds(207, 343, 51, 51);
		contentPane.add(btnB);
		
		JButton btnSinh = new JButton("sinh");
		btnSinh.setEnabled(false);
		btnSinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.sinh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnSinh.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnSinh.setBounds(146, 282, 61, 51);
		contentPane.add(btnSinh);
		
		JButton btplus_6_1 = new JButton("Log");
		btplus_6_1.setEnabled(false);
		btplus_6_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.log(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btplus_6_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btplus_6_1.setBounds(85, 282, 51, 51);
		contentPane.add(btplus_6_1);
		
		JButton btnx = new JButton("1/X");
		btnx.setEnabled(false);
		btnx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = 1/(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnx.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnx.setBounds(10, 282, 69, 51);
		contentPane.add(btnx);
		
		JButton btnCosh = new JButton("cosh");
		btnCosh.setEnabled(false);
		btnCosh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.tanh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnCosh.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnCosh.setBounds(207, 282, 51, 51);
		contentPane.add(btnCosh);
		
		JButton btnTanh = new JButton("tanh");
		btnTanh.setEnabled(false);
		btnTanh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnTanh.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnTanh.setBounds(260, 282, 61, 51);
		contentPane.add(btnTanh);
		
		JButton btnSinh_2_1 = new JButton("Tan");
		btnSinh_2_1.setEnabled(false);
		btnSinh_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.tan(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnSinh_2_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnSinh_2_1.setBounds(260, 224, 61, 51);
		contentPane.add(btnSinh_2_1);
		
		JButton btnR = new JButton("\u221A");
		btnR.setEnabled(false);
		btnR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a =Math.sqrt(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnR.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnR.setBounds(10, 224, 69, 51);
		contentPane.add(btnR);
		
		JButton btplus_6_1_1 = new JButton("e^x");
		btplus_6_1_1.setEnabled(false);
		btplus_6_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.exp(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);

			}
		});
		btplus_6_1_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btplus_6_1_1.setBounds(85, 224, 61, 51);
		contentPane.add(btplus_6_1_1);
		
		JButton btnSin = new JButton("sin");
		btnSin.setEnabled(false);
		btnSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.sin(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnSin.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnSin.setBounds(146, 224, 51, 51);
		contentPane.add(btnSin);
		
		JButton btnCos = new JButton("cos");
		btnCos.setEnabled(false);
		btnCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.cos(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnCos.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnCos.setBounds(207, 224, 51, 51);
		contentPane.add(btnCos);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("ON");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setEnabled(true);
				bt1.setEnabled(true);
				bt0.setEnabled(true);
				bt2.setEnabled(true);
				bt3.setEnabled(true);
				bt4.setEnabled(true);
				bt5.setEnabled(true);
				bt6.setEnabled(true);
				bt7.setEnabled(true);
				bt8.setEnabled(true);
				bt9.setEnabled(true);
				btequal.setEnabled(true);
				btslash.setEnabled(true);
				btstar.setEnabled(true);
				btminus.setEnabled(true);
				btplus.setEnabled(true);
				btnB.setEnabled(true);
				btnC.setEnabled(true);
				btplus_6.setEnabled(true);
				btnXy.setEnabled(true);
				btnX_1.setEnabled(true);
				btnX.setEnabled(true);
				btnN.setEnabled(true);
				btplus_5.setEnabled(true);
				btdot.setEnabled(true);
				btnx.setEnabled(true);
				btnR.setEnabled(true);
				btplus_6_1_1.setEnabled(true);
				btnSin.setEnabled(true);
				btnCos.setEnabled(true);
				btnSinh_2_1.setEnabled(true);
				btnTanh.setEnabled(true);
				btnCosh.setEnabled(true);
				btnSinh.setEnabled(true);
				btplus_6_1.setEnabled(true);
				
			}
		});
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		rdbtnNewRadioButton.setBounds(33, 186, 51, 21);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnOff = new JRadioButton("OFF");
		rdbtnOff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				textField.setEnabled(false);
				bt1.setEnabled(false);
				bt0.setEnabled(false);
				bt2.setEnabled(false);
				bt3.setEnabled(false);
				bt4.setEnabled(false);
				bt5.setEnabled(false);
				bt6.setEnabled(false);
				bt7.setEnabled(false);
				bt8.setEnabled(false);
				bt9.setEnabled(false);
				btequal.setEnabled(false);
				btslash.setEnabled(false);
				btstar.setEnabled(false);
				btminus.setEnabled(false);
				btplus.setEnabled(false);
				btnB.setEnabled(false);
				btnC.setEnabled(false);
				btplus_6.setEnabled(false);
				btnXy.setEnabled(false);
				btnX_1.setEnabled(false);
				btnX.setEnabled(false);
				btnN.setEnabled(false);
				btplus_5.setEnabled(false);
				btdot.setEnabled(false);
				btnx.setEnabled(false);
				btnR.setEnabled(false);
				btplus_6_1_1.setEnabled(false);
				btnSin.setEnabled(false);
				btnCos.setEnabled(false);
				btnSinh_2_1.setEnabled(false);
				btnTanh.setEnabled(false);
				btnCosh.setEnabled(false);
				btnSinh.setEnabled(false);
				btplus_6_1.setEnabled(false);
				
				
			}
		});
		buttonGroup.add(rdbtnOff);
		rdbtnOff.setFont(new Font("Tahoma", Font.BOLD, 14));
		rdbtnOff.setBounds(105, 188, 76, 21);
		contentPane.add(rdbtnOff);
	}
}
