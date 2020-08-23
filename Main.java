import java.awt.Canvas;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame implements ActionListener{
	String a="",b="",c="",s="";
	JTextField tf;
	JPanel p;
	JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,add,sub,mul,div,clear,dot,percent,equal;
	Main(){
			
		 setSize(450,320);
		 Container c=getContentPane();
		 c.setBackground(Color.red);
		 setLayout(null);
		 JPanel p=new JPanel();
		 p.setBounds(20,20,400,240);
		 p.setBackground(Color.DARK_GRAY);
		 
		b0=new JButton("0");
		b1=new JButton("1");
		b2=new JButton("2");
		b3=new JButton("3");
		b4=new JButton("4");
		b5=new JButton("5");
		b6=new JButton("6");
		b7=new JButton("7");
		b8=new JButton("8");
		b9=new JButton("9");
		dot=new JButton(".");
		percent=new JButton("%");
		add=new JButton("+");
		sub=new JButton("-");
		mul=new JButton("*");
		div=new JButton("/");
		clear=new JButton("CE");
		equal=new JButton("=");
		
		 tf=new JTextField();
		 tf.setBounds(20, 20, 350, 30);
		 
		 b1.setBounds(20,80,50,30);
		 b2.setBounds(80,80,50,30);
		 b3.setBounds(140,80,50,30);
		 b4.setBounds(200,80,50,30);
		 b5.setBounds(260,80,50,30);
		 b6.setBounds(320,80,50,30);
		 b7.setBounds(20,120,50,30);
		 b8.setBounds(80,120,50,30);
		 b9.setBounds(140,120,50,30);
		 b0.setBounds(200,120,50,30);
		 
		 add.setBounds(260,120,50,30);
		 sub.setBounds(320,120,50,30);
		 mul.setBounds(20,160,50,30);
		 div.setBounds(80,160,50,30);
		 dot.setBounds(140,160,50,30);
		 percent.setBounds(200,160,50,30);
		 
		 equal.setBounds(260,160,110,30);
		 clear.setBounds(20,200,350,30);
		 
		 b1.addActionListener(this);
		 b2.addActionListener(this);
		 b4.addActionListener(this);
		 b3.addActionListener(this);
		 b5.addActionListener(this);
		 b6.addActionListener(this);
		 b7.addActionListener(this);
		 b8.addActionListener(this);
		 b9.addActionListener(this);
		 b0.addActionListener(this);
		 add.addActionListener(this);
		 sub.addActionListener(this);
		 mul.addActionListener(this);
		 div.addActionListener(this);
		 dot.addActionListener(this);
		 percent.addActionListener(this);
		 clear.addActionListener(this);
		 equal.addActionListener(this);
		 
		 p.add(tf);
		 p.add(b1);
		 p.add(b2);
		 p.add(b3);
		 p.add(b4);
		 p.add(b5);
		 p.add(b6);
		 p.add(b7);
		 p.add(b8);
		 p.add(b9);
		 p.add(b0);
		 p.add(add);
		 p.add(sub);
		 p.add(mul);
		 p.add(div);
		 p.add(clear);
		 p.add(dot);
		 p.add(percent);
		 p.add(equal);
		
		add(p);
		p.setLayout(null);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	
	
	public static void main(String[] args) {
		new Main();

	}



	@Override
	public void actionPerformed(ActionEvent e) {
		s=e.getActionCommand();
		if((s.charAt(0) >= '0' && s.charAt(0) <= '9') || s.charAt(0) == '.') {
			if(c.equals(""))
				a+=s;
			else
				b+=s;
			tf.setText(a+c+b);
		}
		else if(s.equals("CE")) {
			a=b=c="";
			tf.setText(a+b+c);
		}
		else if(s.charAt(0) == '=') {
			double res=0;
		if(c == "+")
			res=Double.valueOf(a)+Double.valueOf(b);
		else if(c == "-")
			res=Double.valueOf(a)+Double.valueOf(b);
		else if(c == "*")
			res=Double.valueOf(a)*Double.valueOf(b);
		else if(c == "/")
			res=Double.valueOf(a)/Double.valueOf(b);
		else if(c == "%")
			res=Double.valueOf(a)%Double.valueOf(b);
		tf.setText(a+c+b+"="+String.valueOf(res));
			
		}
		else {
			if(s.charAt(0) == '+')
				c="+";
			else if(s.charAt(0) == '-')
				c="-";
			else if(s.charAt(0) == '*')
				c="*";
			else if(s.charAt(0) == '/')
				c="/";
			else if(s.charAt(0) == '%')
				c="%";
			tf.setText(a+c+b);
		}
	}

}