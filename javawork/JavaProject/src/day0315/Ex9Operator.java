package day0315;

import java.util.Scanner;

public class Ex9Operator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int kor;//������������
		String msg; //����޼��� ����
		//���������� �Է��� 90�̻��̸� "Excellent!"��� msg�� ����
		//80�̻��̸� "Good!!"
		//90�̸��̸� "Try!!!"��� ����

		System.out.println("��������");
		kor=sc.nextInt();
		
		//if ��
//		if (kor>=90)
//			msg = "Excellent!";
//		else if(kor>=80)
//			msg = "Good!!";
//		else 
//			msg = "Try!!!";
//		System.out.println(kor+"=>"+msg);
		
		//���ǿ�����
		msg=kor>=90?"Excellent!":"Try!!!";
		System.out.println(kor+"=>"+msg);
	

	}

}