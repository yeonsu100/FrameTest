package test.main;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MainClass01 {
	public static void main(String[] args) {
		JFrame frame=new JFrame("My Frame");
		
		// 닫기버튼을 눌렀을 때 process가 종료되도록 설정
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 크기
		frame.setSize(300, 300);
		// 위치
		frame.setLocation(200, 200);
		// 화면에 보이게 하기
		frame.setVisible(true);
		// 기본 레이아웃으로 동작하게 하기
		frame.setLayout(null);
		// 버튼 객체 만들어서
		JButton btn=new JButton("Click on!");
		btn.setSize(100, 40);
		btn.setLocation(10, 10);
		// 프레임에 추가하기
		frame.add(btn);
		
		new YourFrame("Your Frame");
	}
	
	// 내부 클래스를 하나 생성하기
	static class YourFrame extends JFrame{
		// 생성자
		public YourFrame(String title) {
			super(title);
			
			// (this는 생략가능)
			this.setDefaultCloseOperation(EXIT_ON_CLOSE);  // JFrame. 이 생략됨 (상속받았기 때문)
			this.setSize(300, 300);
			this.setLocation(500, 200);
			this.setVisible(true);
			this.setLayout(null);
			
			JButton btn=new JButton("Click!!");
			btn.setSize(100, 40);
			btn.setLocation(10, 10);
			add(btn);
		}
	}
}
