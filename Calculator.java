package app;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import javax.swing.SpringLayout;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel answerLabel;
	private JLabel topLabel;
	private String condition = null;
	private boolean gotAnswer = false;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
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
	public Calculator() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Calculator.class.getResource("/Images/Windows_Calculator_icon.png")));
		setTitle("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 332, 538);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel answerPanel = new JPanel();
		answerPanel.setBackground(new Color(255, 255, 255));
		answerPanel.setBounds(0, 0, 316, 161);
		contentPane.add(answerPanel);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Calculator.class.getResource("/Images/menubar.png")));
		
		JLabel lblNewLabel_1 = new JLabel("Standrad");
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.BOLD, 20));
		SpringLayout sl_answerPanel = new SpringLayout();
		sl_answerPanel.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 11, SpringLayout.NORTH, answerPanel);
		sl_answerPanel.putConstraint(SpringLayout.WEST, lblNewLabel_1, 40, SpringLayout.WEST, answerPanel);
		sl_answerPanel.putConstraint(SpringLayout.NORTH, lblNewLabel, 14, SpringLayout.NORTH, answerPanel);
		sl_answerPanel.putConstraint(SpringLayout.WEST, lblNewLabel, 10, SpringLayout.WEST, answerPanel);
		answerPanel.setLayout(sl_answerPanel);
		answerPanel.add(lblNewLabel);
		answerPanel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		sl_answerPanel.putConstraint(SpringLayout.NORTH, lblNewLabel_2, 5, SpringLayout.NORTH, lblNewLabel);
		sl_answerPanel.putConstraint(SpringLayout.WEST, lblNewLabel_2, 16, SpringLayout.EAST, lblNewLabel_1);
		lblNewLabel_2.setIcon(new ImageIcon(Calculator.class.getResource("/Images/maximize.png")));
		answerPanel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(Calculator.class.getResource("/Images/history.png")));
		sl_answerPanel.putConstraint(SpringLayout.NORTH, lblNewLabel_3, 6, SpringLayout.NORTH, lblNewLabel);
		sl_answerPanel.putConstraint(SpringLayout.EAST, lblNewLabel_3, -10, SpringLayout.EAST, answerPanel);
		answerPanel.add(lblNewLabel_3);
		
		topLabel = new JLabel("");
		sl_answerPanel.putConstraint(SpringLayout.NORTH, topLabel, 21, SpringLayout.SOUTH, lblNewLabel);
		sl_answerPanel.putConstraint(SpringLayout.WEST, topLabel, 10, SpringLayout.WEST, answerPanel);
		sl_answerPanel.putConstraint(SpringLayout.EAST, topLabel, 0, SpringLayout.EAST, lblNewLabel_3);
		topLabel.setForeground(new Color(128, 128, 128));
		topLabel.setFont(new Font("Arial", Font.PLAIN, 16));
		topLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		answerPanel.add(topLabel);
		
		answerLabel = new JLabel("0");
		sl_answerPanel.putConstraint(SpringLayout.NORTH, answerLabel, 85, SpringLayout.NORTH, answerPanel);
		sl_answerPanel.putConstraint(SpringLayout.SOUTH, answerLabel, -33, SpringLayout.SOUTH, answerPanel);
		sl_answerPanel.putConstraint(SpringLayout.SOUTH, topLabel, -10, SpringLayout.NORTH, answerLabel);
		sl_answerPanel.putConstraint(SpringLayout.WEST, answerLabel, 0, SpringLayout.WEST, lblNewLabel);
		sl_answerPanel.putConstraint(SpringLayout.EAST, answerLabel, 0, SpringLayout.EAST, lblNewLabel_3);
		answerLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		answerLabel.setFont(new Font("Tahoma", Font.PLAIN, 44));
		answerPanel.add(answerLabel);
		
		JPanel btnPanel = new JPanel();
		btnPanel.setBackground(new Color(255, 255, 255));
		btnPanel.setBounds(5, 195, 307, 299);
		contentPane.add(btnPanel);
		btnPanel.setLayout(new GridLayout(6, 4, 3, 3));
		
		JButton btnNewButton = new JButton("%");
		btnNewButton.setBorder(new EmptyBorder(0, 0, 0, 0));
		btnNewButton.setBackground(new Color(243, 243, 243));
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 24));
		btnPanel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("CE");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				answerLabel.setText("0");
			}
		});
		btnNewButton_1.setBorder(new EmptyBorder(0, 0, 0, 0));
		btnNewButton_1.setBackground(new Color(243, 243, 243));
		btnNewButton_1.setFont(new Font("Arial", Font.PLAIN, 24));
		btnPanel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("C");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				topLabel.setText("");
				answerLabel.setText("0");
			}
		});
		btnNewButton_2.setBorder(new EmptyBorder(0, 0, 0, 0));
		btnNewButton_2.setBackground(new Color(243, 243, 243));
		btnNewButton_2.setFont(new Font("Arial", Font.PLAIN, 24));
		btnPanel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String currentValue = answerLabel.getText();
				if(currentValue.length() > 1) {
					answerLabel.setText(currentValue.substring(0,currentValue.length() - 1));
				}else {
					answerLabel.setText("0");
				}
				
			}
		});
		btnNewButton_3.setBorder(new EmptyBorder(0, 0, 0, 0));
		btnNewButton_3.setBackground(new Color(243, 243, 243));
		btnNewButton_3.setIcon(new ImageIcon(Calculator.class.getResource("/Images/back.png")));
		btnPanel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("1/x");
		btnNewButton_4.setBorder(new EmptyBorder(0, 0, 0, 0));
		btnNewButton_4.setBackground(new Color(243, 243, 243));
		btnNewButton_4.setFont(new Font("Arial", Font.PLAIN, 24));
		btnPanel.add(btnNewButton_4);
		
		JButton btnNewButton_6 = new JButton("");
		btnNewButton_6.setBorder(new EmptyBorder(0, 0, 0, 0));
		btnNewButton_6.setBackground(new Color(243, 243, 243));
		btnNewButton_6.setIcon(new ImageIcon(Calculator.class.getResource("/Images/math.png")));
		btnPanel.add(btnNewButton_6);
		
		JButton btnNewButton_5 = new JButton("²√x");
		btnNewButton_5.setBorder(new EmptyBorder(0, 0, 0, 0));
		btnNewButton_5.setBackground(new Color(243, 243, 243));
		btnNewButton_5.setFont(new Font("Arial", Font.PLAIN, 24));
		btnPanel.add(btnNewButton_5);
		
		JButton btnNewButton_12 = new JButton("/");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				condition = "/";
				setTopLabel();
			}
		});
		btnNewButton_12.setBorder(new EmptyBorder(0, 0, 0, 0));
		btnNewButton_12.setBackground(new Color(243, 243, 243));
		btnNewButton_12.setFont(new Font("Arial", Font.PLAIN, 24));
		btnPanel.add(btnNewButton_12);
		
		JButton btnNewButton_7 = new JButton("7");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addNumber("7");
			}
		});
		btnNewButton_7.setBorder(new EmptyBorder(0, 0, 0, 0));
		btnNewButton_7.setBackground(new Color(243, 243, 243));
		btnNewButton_7.setFont(new Font("Arial", Font.PLAIN, 24));
		btnPanel.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("8");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addNumber("8");
			}
		});
		btnNewButton_8.setBorder(new EmptyBorder(0, 0, 0, 0));
		btnNewButton_8.setBackground(new Color(243, 243, 243));
		btnNewButton_8.setFont(new Font("Arial", Font.PLAIN, 24));
		btnPanel.add(btnNewButton_8);
		
		JButton btnNewButton_18 = new JButton("9");
		btnNewButton_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addNumber("9");
			}
		});
		btnNewButton_18.setBorder(new EmptyBorder(0, 0, 0, 0));
		btnNewButton_18.setBackground(new Color(243, 243, 243));
		btnNewButton_18.setFont(new Font("Arial", Font.PLAIN, 24));
		btnPanel.add(btnNewButton_18);
		
		JButton btnNewButton_10 = new JButton("X");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				condition = "*";
				setTopLabel();
				
			}
		});
		btnNewButton_10.setBorder(new EmptyBorder(0, 0, 0, 0));
		btnNewButton_10.setBackground(new Color(243, 243, 243));
		btnNewButton_10.setFont(new Font("Arial", Font.PLAIN, 24));
		btnPanel.add(btnNewButton_10);
		
		JButton btnNewButton_9 = new JButton("4");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addNumber("4");
			}
		});
		btnNewButton_9.setBorder(new EmptyBorder(0, 0, 0, 0));
		btnNewButton_9.setBackground(new Color(243, 243, 243));
		btnNewButton_9.setFont(new Font("Arial", Font.PLAIN, 24));
		btnPanel.add(btnNewButton_9);
		
		JButton btnNewButton_11 = new JButton("5");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addNumber("5");
			}
		});
		btnNewButton_11.setBorder(new EmptyBorder(0, 0, 0, 0));
		btnNewButton_11.setBackground(new Color(243, 243, 243));
		btnNewButton_11.setFont(new Font("Arial", Font.PLAIN, 24));
		btnPanel.add(btnNewButton_11);
		
		JButton btnNewButton_15 = new JButton("6");
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addNumber("6");
			}
		});
		btnNewButton_15.setBorder(new EmptyBorder(0, 0, 0, 0));
		btnNewButton_15.setBackground(new Color(243, 243, 243));
		btnNewButton_15.setFont(new Font("Arial", Font.PLAIN, 24));
		btnPanel.add(btnNewButton_15);
		
		JButton btnNewButton_13 = new JButton("-");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				condition = "-";
				setTopLabel();
			}
		});
		btnNewButton_13.setBorder(new EmptyBorder(0, 0, 0, 0));
		btnNewButton_13.setBackground(new Color(243, 243, 243));
		btnNewButton_13.setFont(new Font("Arial", Font.PLAIN, 24));
		btnPanel.add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("1");
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addNumber("1");
			}
		});
		btnNewButton_14.setBorder(new EmptyBorder(0, 0, 0, 0));
		btnNewButton_14.setBackground(new Color(243, 243, 243));
		btnNewButton_14.setFont(new Font("Arial", Font.PLAIN, 24));
		btnPanel.add(btnNewButton_14);
		
		JButton btnNewButton_20 = new JButton("2");
		btnNewButton_20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addNumber("2");
			}
		});
		btnNewButton_20.setBorder(new EmptyBorder(0, 0, 0, 0));
		btnNewButton_20.setBackground(new Color(243, 243, 243));
		btnNewButton_20.setFont(new Font("Arial", Font.PLAIN, 24));
		btnPanel.add(btnNewButton_20);
		
		JButton btnNewButton_16 = new JButton("3");
		btnNewButton_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addNumber("3");
			}
		});
		btnNewButton_16.setBorder(new EmptyBorder(0, 0, 0, 0));
		btnNewButton_16.setBackground(new Color(243, 243, 243));
		btnNewButton_16.setFont(new Font("Arial", Font.PLAIN, 24));
		btnPanel.add(btnNewButton_16);
		
		JButton btnNewButton_17 = new JButton("+");
		btnNewButton_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				condition = "+";
				setTopLabel();
			}
		});
		btnNewButton_17.setBorder(new EmptyBorder(0, 0, 0, 0));
		btnNewButton_17.setBackground(new Color(243, 243, 243));
		btnNewButton_17.setFont(new Font("Arial", Font.PLAIN, 24));
		btnPanel.add(btnNewButton_17);
		
		JButton btnNewButton_19 = new JButton("+/-");
		btnNewButton_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				answerLabel.setText("-" + answerLabel.getText());
			}
		});
		btnNewButton_19.setBorder(new EmptyBorder(0, 0, 0, 0));
		btnNewButton_19.setBackground(new Color(243, 243, 243));
		btnNewButton_19.setFont(new Font("Arial", Font.PLAIN, 24));
		btnPanel.add(btnNewButton_19);
		
		JButton btnNewButton_21 = new JButton("0");
		btnNewButton_21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addNumber("0");
			}
		});
		btnNewButton_21.setBorder(new EmptyBorder(0, 0, 0, 0));
		btnNewButton_21.setBackground(new Color(243, 243, 243));
		btnNewButton_21.setFont(new Font("Arial", Font.PLAIN, 24));
		btnPanel.add(btnNewButton_21);
		
		JButton btnNewButton_22 = new JButton(".");
		btnNewButton_22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addNumber(".");
			}
		});
		btnNewButton_22.setBorder(new EmptyBorder(0, 0, 0, 0));
		btnNewButton_22.setBackground(new Color(243, 243, 243));
		btnNewButton_22.setFont(new Font("Arial", Font.PLAIN, 24));
		btnPanel.add(btnNewButton_22);
		
		JButton btnNewButton_23 = new JButton("=");
		btnNewButton_23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				doCalculate();
			}
		});
		btnNewButton_23.setForeground(new Color(255, 255, 255));
		btnNewButton_23.setBorder(new EmptyBorder(0, 0, 0, 0));
		btnNewButton_23.setBackground(new Color(0, 128, 192));
		btnNewButton_23.setFont(new Font("Arial", Font.PLAIN, 24));
		btnPanel.add(btnNewButton_23);
	}
	
	private void addNumber(String num) {
		if(gotAnswer) {
			answerLabel.setText("0");
			topLabel.setText("");
			gotAnswer = false;
		}
		
		String currentVal = answerLabel.getText();
		
		if(num == "." && currentVal.equals("0")) {
			num = "0.";
		}
		
		currentVal = currentVal.equals("0") || currentVal.equals("Error") ? num : currentVal + num; 
		answerLabel.setText(currentVal);
	}
	private void setTopLabel() {
		String currentVal = answerLabel.getText();
		topLabel.setText(currentVal + " " + condition);
		answerLabel.setText("0");
	}
	
	private void showResult(double result) {
		gotAnswer = true;
		
		topLabel.setText(topLabel.getText() + " " + answerLabel.getText() + " =");
		
		if(result == (long) result) {
			answerLabel.setText(String.format("%d",(long) result));
		}else {
			answerLabel.setText(String.valueOf(result));
		}
		condition = null;
	}
	
	private void doCalculate() {
		
		try {
			double preVal = Double.parseDouble(topLabel.getText().replaceAll("[^0-9.]",""));
			double lastVal = Double.parseDouble(answerLabel.getText());
			double result = 0;
			
			switch(condition) {
				case "+":
					result = preVal + lastVal;
					break;
				case "-":
					result = preVal - lastVal;
					break;
				case "*":
					result = preVal * lastVal;
					break;
				case "/":
					result = preVal / lastVal;
					break;
				default:
					answerLabel.setText("Error");
					topLabel.setText("");
					break;
			}
			
			showResult(result);
		}catch(Exception e) {
			answerLabel.setText("Error");
			topLabel.setText("");
			gotAnswer = false;
		}
		
	}
	
}

