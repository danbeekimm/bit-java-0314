package day0404;

import java.util.Calendar;
import java.util.Date;


public class Ex12Const {
	Date date;
	Calendar cal;//날짜부터생성

public Ex12Const() {
	
	date=new Date();
//	cal=new Calender(); 이거안됨. 생성자가 프로텍티드protected라 안돼
	cal=Calendar.getInstance();
}
public void write(){
	int y=date.getYear()+1900; //풀이어가 없어 자바는 그래서 1900더해야함
	int m=date.getMonth()+1; //0~11까지라
	int d=date.getDate();
	
	System.out.println("오늘날짜"+y+"년"+m+"월"+d+"일");
}
public void write2()
{
	int y=cal.get(Calendar.YEAR);
	int m=cal.get(Calendar.MONTH)+1;
	int d=cal.get(Calendar.DATE);
	
	System.out.println("오늘날짜:"+y+"년"+m+"월"+d+"일");
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex12Const ex=new Ex12Const();
		ex.write();
		ex.write2();

	}

}
