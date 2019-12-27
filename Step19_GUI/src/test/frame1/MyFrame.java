package test.frame1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyFrame extends JFrame implements ActionListener{
	// 상속만 단일이고, 인터페이스는 콤마로 구분해서 여러개 정의할 수 있다
	
	// 생성자
	public MyFrame(String title) {	// 생성자의 인자로 프레임의 제목을 전달받아서
		super(title);				// 부모 생성자에 전달한다.
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// x, y, width, height를 한번에 지정하기
		setBounds(200, 200, 300, 300);
		// 기본 레이아웃을 동작하게 하기
		setLayout(null);
		// 화면에 보이게하기
		setVisible(true);
	
		// 버튼
		JButton btn=new JButton("Click this!");
		// x, y, width, height를 한번에 지정하기
		btn.setBounds(10, 10, 100, 40);
		// 버튼을 프레임에 추가하기
		add(btn);
		// 버튼에 리스너 등록하기
		btn.addActionListener(this);
	}

		// 클릭한 횟수를 세는 필드 만들기
		private int count;
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// 필드값 1 증가 시키기
		count++;
		// System.out.println(count+"번 클릭했네?");
		// 위 코드처럼 콘솔창에 찍는 대신, .showMessageDialog (컴포넌트의 참조값, 메세지) 사용하기
		JOptionPane.showMessageDialog(this, count+"번 클릭했네?");
	}
}
