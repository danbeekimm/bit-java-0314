package day0406;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.nio.Buffer;

//��� Ȱ��Ǵ��� �׽�Ʈ ����

public class Ex3FrameInterface extends 
Frame implements WindowListener,ActionListener {
	//�����ӻ�ӹ����ΰ��� ����̴޶� ������� ��������. ������ ��ư���
	Button btn;
	
	public Ex3FrameInterface() {
		super("Hello");
		this.setBounds(300,100,300,300);
		this.addWindowListener(this); //�������̺�Ʈ�߻�
		this.setLayout(new FlowLayout()); //���̾ƿ�����
		this.setBackground(Color.pink);
		btn=new Button("Click");
		this.add(btn);
		btn.addActionListener(this); //��ư�̺�Ʈ
		this.setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ex3FrameInterface();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("��ưŬ���߾��!!!"
				+ "");
		
	}
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.exit(0); //������ ���� Ŭ���� ȣ�� �ý�������
		
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

}