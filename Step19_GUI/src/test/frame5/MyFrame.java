package test.frame5;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener{

	
	// 생성자
	public MyFrame(String title) {	// 생성자의 인자로 프레임의 제목을 전달받아서
		super(title);				// 부모 생성자에 전달한다.
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(200, 200, 500, 500);
		setLayout(new BorderLayout());		// 레이아웃 설정하기
		setVisible(true);
		
		JButton btn1=new JButton("▲");
		JButton btn2=new JButton("▶");
		JButton btn3=new JButton("▼");
		JButton btn4=new JButton("◀");
		JButton btn5=new JButton("★");
		add(btn1, BorderLayout.NORTH);
		add(btn2, BorderLayout.EAST);
		add(btn3, BorderLayout.SOUTH);
		add(btn4, BorderLayout.WEST);
		add(btn5, BorderLayout.CENTER);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// this는 아래와 같이 다양한 타입의 참조값을 가질 수 있다
		MyFrame a=this;
		JFrame b=this;
		ActionListener c=this;
		Frame d=this;
		Window e2=this;
		Container f=this; 
		Component g=this;
		Object h=this;
	}
	
	public static void main(String[] args) {
		new MyFrame("My Frame");
	}
}
