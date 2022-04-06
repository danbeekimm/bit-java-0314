package day0404;

class Hello{
	int year,month,day;
	
	Hello(int year,int month,int day){
		this.year=year;
		this.month=month;
		this.day=day;
	}
	
	public void write() {
		System.out.println(year+"��"+month+"��"+day+"�ϻ��Դϴ�.");
	}
}


class Hello2{
	int year,month,day;
	
	private Hello2(int year,int month,int day){
		this.year=year;
		this.month=month;
		this.day=day;
	}
	
	public static Hello2 getInstance() {
		return new Hello2(2010,12,25); //����ƽ���� �ϸ� ��.
	}
	
	public void write() {
		System.out.println(year+"��"+month+"��"+day+"�ϻ��Դϴ�.");
	}
}


public class Ex11Const {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hello h=new Hello(2001,4,10);
		h.write();
		
//		Hello2 h2=new Hello2(2..5,11,25);�̰� ������ �����Ŷ�
		Hello2 h2=Hello2.getInstance();
		h2.write(); //����ƽ�̹Ƿ� �׳� ��°���.�����ʾ���
	}

}