import java.awt.*;
import javax.swing.*;

public class Calculator extends JFrame {
	
	private JButton num1;
	private JButton num2;
	private JButton num3;
	private JButton num4;
	private JButton num5;
	private JButton num6;
	private JButton num7;
	private JButton num8;
	private JButton num9;
	private JButton num0;
	private JButton solve;
	private JButton equal;
	private JButton add;
	private JButton subtract;
	private JButton clear;
	private JButton dot;
	private JButton multiply;
	private JButton divide;
	private double temp;
	private double answer;
	private JTextField result;
	String display = "";
	boolean subBoolean = false;
	boolean addBoolean = false;
	boolean mulBoolean = false;
	boolean divBoolean = false;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(() ->{
			Calculator calculator = new Calculator();
			calculator.pack();
			calculator.setVisible(true);
		});
	}

	public Calculator() {
		JPanel panel1 = new JPanel();
		panel1.setLayout(new GridLayout(4, 3));
		panel1.add(num1 = new JButton("1"));
		panel1.add(num2 = new JButton("2"));
		panel1.add(num3 = new JButton("3"));
		panel1.add(num4 = new JButton("4"));
		panel1.add(num5 = new JButton("5"));
		panel1.add(num6 = new JButton("6"));
		panel1.add(num7 = new JButton("7"));
		panel1.add(num8 = new JButton("8"));
		panel1.add(num9 = new JButton("9"));
		panel1.add(clear = new JButton("C"));
		panel1.add(num0 = new JButton("0"));
		panel1.add(dot = new JButton("."));

		JPanel panel2 = new JPanel();
		panel2.setLayout(new FlowLayout());
		panel2.add(result = new JTextField(15));

		JPanel panel3 = new JPanel();
		panel3.setLayout(new GridLayout(1, 5));
		panel3.add(subtract = new JButton("-"));
		panel3.add(add = new JButton("+"));
		panel3.add(divide = new JButton("/"));
		panel3.add(multiply = new JButton("*"));
		panel3.add(solve = new JButton("="));

		JPanel p = new JPanel();
		p.add(panel2);
		p.add(panel1);
		p.add(panel3);
		add(p);

		num1.addActionListener((event)->One());
		num2.addActionListener((event)->Two());
		num3.addActionListener((event)->Three());
		num4.addActionListener((event)->Four());
		num5.addActionListener((event)->Five());
		num6.addActionListener((event)->Six());
		num7.addActionListener((event)->Seven());
		num8.addActionListener((event)->Eight());
		num9.addActionListener((event)->Nine());
		num0.addActionListener((event)->Zero());

		add.addActionListener((event)->add());
		subtract.addActionListener((event)->subtract());
		divide.addActionListener((event)->divide());
		multiply.addActionListener((event)->multiply());
		solve.addActionListener((event)->solve());
		clear.addActionListener((event)->clear());
		dot.addActionListener((event)->dot());
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void clear() {
		result.setText("");
	}

	public void One() {
		display = result.getText();
		result.setText(display + "1");
	}
 
	public void Two() {
		display = result.getText();
		result.setText(display + "2");
	}
 

	public void Three() {
		display = result.getText();
		result.setText(display + "3");
	}
 
	public void Four() {
		display = result.getText();
		result.setText(display + "4");
	}

	public void Five() {
		display = result.getText();
		result.setText(display + "5");
	}

	public void Six() {
		display = result.getText();
		result.setText(display + "6");
	}

	public void Seven() {
		display = result.getText();
		result.setText(display + "7");
	}
 
	public void Eight() {
		display = result.getText();
		result.setText(display + "8");
	}
 
	public void Nine() {
		display = result.getText();
		result.setText(display + "9");
	}

	public void Zero() {
		display = result.getText();
		result.setText(display + "0");
	}
	public void dot() {
		display = result.getText();
		result.setText(display + ".");
	}

	public void add() {
		temp = Double.parseDouble( result.getText());
		result.setText("");
		addBoolean = true;
	}

	public void subtract() {
		temp = Double.parseDouble( result.getText());
		result.setText("");
		subBoolean = true;
	}

	public void divide() {
		temp = Double.parseDouble( result.getText());
		result.setText("");
		divBoolean = true;
	}
	
	public void multiply() {
		temp = Double.parseDouble( result.getText());
		result.setText("");
		mulBoolean = true;
	}

	public void solve() {
		answer = Double.parseDouble( result.getText());
		if (addBoolean == true) {
			answer = temp + answer;
		}
		else if ( divBoolean == true) {
			answer = temp / answer;
		}
		else if ( subBoolean == true) {
			answer = temp - answer ;
		}
		else if ( mulBoolean == true) {
			answer = temp * answer;
		}
		result.setText( Double.toString(answer));
		addBoolean = false;
		subBoolean = false;
		mulBoolean = false;
		divBoolean = false;
	}
}