package test.frame3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyFrame extends JFrame implements ActionListener{
	// ▲ 상속만 단일이고, 인터페이스는 콤마로 구분해서 여러개 정의할 수 있다
	
	// 생성자
	public MyFrame(String title) {	// 생성자의 인자로 프레임의 제목을 전달받아서
		super(title);				// 부모 생성자에 전달한다.
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(200, 200, 300, 300);
		setLayout(null);
		setVisible(true);
	
		// 버튼의 참조값을 필드에 저장하기
		JButton saveBtn=new JButton("저!장!");
		JButton deleteBtn=new JButton("삭!제!");
		// x, y, width, height를 한번에 지정하기
		saveBtn.setBounds(10, 10, 100, 40);
		deleteBtn.setBounds(110, 10, 100, 40);
		// 버튼을 프레임에 추가하기
		add(saveBtn);
		add(deleteBtn);
		// 버튼에 리스너 등록하기
		saveBtn.addActionListener(this);
		deleteBtn.addActionListener(this);
		// 버튼에 ActionCommand 추가하기 (버튼에 커맨드명을 지정할 수 있다)
		saveBtn.setActionCommand("save");
		deleteBtn.setActionCommand("delete");
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		// 메소드에 전달된 ActionEvent 객체에 발생한 이벤트의 정보가 들어있다.
		String command=e.getActionCommand();
		if(command.equals("save")) {
			JOptionPane.showMessageDialog(this, "saved!");
		}else if(command.equals("delete")) {
			JOptionPane.showMessageDialog(this, "deleted!");
		}
	}
	
	public static void main(String[] args) {
		new MyFrame("My Frame");
	}
}
