import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class Calculator implements ActionListener {
	JButton p1, p2, square, per, b7, b8, b9, div, b4, b5, b6, mult, b1, b2, b3, sub, decimal, b0, equals, add, delete, clear;
	JTextField txt;
	JFrame frame;
	double result = 0, a = 0, b = 0;
	int operator = 0;
	public Calculator() {
		frame = new JFrame("Maya's Calculator");
		txt = new JTextField("", 25);
		txt.setEditable(false);
		//button names
		p1 = new JButton("x!");
		p2 = new JButton("SQRT");
		square = new JButton("x^2");
		per = new JButton("%");
		b7 = new JButton("7");
		b8 = new JButton("8");
		b9 = new JButton("9");
		div = new JButton("/");
		b4 = new JButton("4");
		b5 = new JButton("5");
		b6 = new JButton("6");
		mult = new JButton("*");
		b1 = new JButton("1");
		b2 = new JButton("2");
		b3 = new JButton("3");
		sub = new JButton("-");
		decimal = new JButton(".");
		b0 = new JButton("0");
		equals = new JButton("=");
		add = new JButton("+");
		delete = new JButton("Delete");
		clear = new JButton("Clear");
		//adding the buttons to the frame
		
		frame.add(txt);
		frame.add(p1);
		frame.add(p2);
		frame.add(square);
		frame.add(per);
		frame.add(b7);
		frame.add(b8);
		frame.add(b9);
		frame.add(div);
		frame.add(b4);
		frame.add(b5);
		frame.add(b6);
		frame.add(mult);
		frame.add(b1);
		frame.add(b2);
		frame.add(b3);
		frame.add(sub);
		frame.add(decimal);
		frame.add(b0);
		frame.add(equals);
		frame.add(add);
		frame.add(delete);
		frame.add(clear);
		
		p1.addActionListener(this);
		p2.addActionListener(this);
		square.addActionListener(this);
		per.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		div.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		mult.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		sub.addActionListener(this);
		decimal.addActionListener(this);
		b0.addActionListener(this);
		equals.addActionListener(this);
		add.addActionListener(this);
		delete.addActionListener(this);
		clear.addActionListener(this);
		
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
		frame.setSize(330, 265);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1) {
			txt.setText(txt.getText().concat("1"));
		}
		if (e.getSource() == b2) {
			txt.setText(txt.getText().concat("2"));
		}
		if (e.getSource() == b3) {
			txt.setText(txt.getText().concat("3"));
		}
		if (e.getSource() == b4) {
			txt.setText(txt.getText().concat("4"));
		}
		if (e.getSource() == b5) {
			txt.setText(txt.getText().concat("5"));
		}
		if (e.getSource() == b6) {
			txt.setText(txt.getText().concat("6"));
		}
		if (e.getSource() == b7) {
			txt.setText(txt.getText().concat("7"));
		}
		if (e.getSource() == b8) {
			txt.setText(txt.getText().concat("8"));
		}
		if (e.getSource() == b9) {
			txt.setText(txt.getText().concat("9"));
		}
		if (e.getSource() == b0) {
			txt.setText(txt.getText().concat("0"));
		}
		if (e.getSource() == decimal) {
			txt.setText(txt.getText().concat("."));
		}
		if (e.getSource() == add) {
			a = Double.parseDouble(txt.getText());
			operator = 1;
			txt.setText("");
		}
		if (e.getSource() == sub) {
			a = Double.parseDouble(txt.getText());
			operator = 2;
			txt.setText("");
		}
		if (e.getSource() == mult) {
			a = Double.parseDouble(txt.getText());
			operator = 3;
			txt.setText("");
		}
		if (e.getSource() == div) {
			a = Double.parseDouble(txt.getText());
			operator = 4;
			txt.setText("");
		}
		if (e.getSource() == equals) {
			b = Double.parseDouble(txt.getText());
			switch(operator) {
				case 1: result = a + b;
					break;
				case 2: result = a - b;
					break;
				case 3: result = a * b;
					break;
				case 4: result = a/b;
					break;
				case 5: result = a/b * 100;
					break;
				default: result = 0;
			}
			txt.setText("" + result);
		}
		if (e.getSource() == clear) {
			txt.setText("");
		}
		if (e.getSource() == delete) {
			String s = txt.getText();
			txt.setText("");
			for (int i = 0; i < s.length() - 1; i++) {
				txt.setText(txt.getText() + s.charAt(i));
			}
		}
		if (e.getSource() == p1) {
			a = fact(Double.parseDouble(txt.getText()));
			txt.setText("");
			txt.setText(txt.getText() + a);
			
		}
		if (e.getSource() == p2) {
			a = Math.sqrt(Double.parseDouble(txt.getText()));
			txt.setText("");
			txt.setText(txt.getText() + a);
		}
		if (e.getSource() == square) {
			a = Math.pow(Double.parseDouble(txt.getText()), 2);
			txt.setText("");
			txt.setText(txt.getText() + a);
		}
		if (e.getSource() == per) {
			a = Double.parseDouble(txt.getText());
			operator = 5;
			txt.setText("");
		}
	}
	public double fact(double input) {
		double indicator = 1;
		double result = 1;
		for (indicator = 2; indicator <= input; indicator += 1.0) {
			result *= indicator;
		}
		return result;
	}
	public static void main(String[] args) {
		new Calculator();
	}

}
