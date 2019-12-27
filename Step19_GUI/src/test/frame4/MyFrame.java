package test.frame4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener{
	// ▲ 상속만 단일이고, 인터페이스는 콤마로 구분해서 여러개 정의할 수 있다
	
	// 필드 선언하기
	JTextField inputText;
	
	// 생성자
	public MyFrame(String title) {	// 생성자의 인자로 프레임의 제목을 전달받아서
		super(title);				// 부모 생성자에 전달한다.
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(200, 200, 300, 300);
		setLayout(null);
		setVisible(true);
		
		// JTextField 객체의 참조값을 필드에 저장
		inputText=new JTextField(10);		// 위에서 필드 선언했으므로 지역변수(JTextField)는 지운다
		inputText.setBounds(10, 10, 200, 20);
		add(inputText);
	
		JButton sendBtn=new JButton("send");
		sendBtn.setBounds(210, 10, 80, 20);
		add(sendBtn);
		// 버튼에 ActionListener 등록하기
		sendBtn.addActionListener(this);
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		// 입력한 문자열 읽어오기
		String msg=inputText.getText();
		// 알림창에 띄우기
		JOptionPane.showMessageDialog(this, msg);
		// 입력한 문자열 삭제하기
		inputText.setText("");
	}
	
	public static void main(String[] args) {
		new MyFrame("My Frame");
	}
}
