package day0406;

import java.util.Date;

public class Ex9Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date=null;
		//Date date=new Date();
		
		int year=0;
		try {
			year=date.getYear()+1900;
		}catch (NullPointerException e) {
			System.out.println("��ü�� �����ȵ�:"+e.getMessage());
			date=new Date();
			year=date.getYear()+1900;
		}finally {
			System.out.println("**������ ����Ǵ� ����**");	
			System.out.println("������ "+year+"�⵵�Դϴ�");
		}		
		
		System.out.println("** ���� ���� **");
	}

}
