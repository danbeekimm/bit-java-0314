package day0405;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ex10Frame extends Frame implements WindowListener{
//인터페이스implement는 다중화가능
//다중상속
	public Ex10Frame() {
		// TODO Auto-generated constructor stub
		super("안녕하세요");
		this.setBounds(300, 100, 300, 300);//위치와 크기 지정
		this.setBackground(Color.pink);//배경색 지정
		this.addWindowListener(this);//이벤트 발생
		this.setVisible(true);		
	}
	 //오버라이딩안할거면 추상화해야됨.
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("윈도우 종료");
		System.exit(0);//프로그램 종료
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ex10Frame();//디폴트 생성자 호출
	}

}



