package day0404;

import java.util.Calendar;
import java.util.Date;


public class Ex12Const {
	Date date;
	Calendar cal;//��¥���ͻ���

public Ex12Const() {
	
	date=new Date();
//	cal=new Calender(); �̰žȵ�. �����ڰ� ������Ƽ��protected�� �ȵ�
	cal=Calendar.getInstance();
}
public void write(){
	int y=date.getYear()+1900; //Ǯ�̾ ���� �ڹٴ� �׷��� 1900���ؾ���
	int m=date.getMonth()+1; //0~11������
	int d=date.getDate();
	
	System.out.println("���ó�¥"+y+"��"+m+"��"+d+"��");
}
public void write2()
{
	int y=cal.get(Calendar.YEAR);
	int m=cal.get(Calendar.MONTH)+1;
	int d=cal.get(Calendar.DATE);
	
	System.out.println("���ó�¥:"+y+"��"+m+"��"+d+"��");
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex12Const ex=new Ex12Const();
		ex.write();
		ex.write2();

	}

}
