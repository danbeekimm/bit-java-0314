package day0315;

import java.util.Scanner;

public class Ex10Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int java,html,oracle;
		//3������ ������ �Է¹޾� �հ�� ����� ����ϰ�
		//������ ���� ����� 60�̻��̸� "�հ�"
		//�׷��������� "���հ�"ó���Ͻÿ�
		int sum;
		double avg;
		String msg;
		
		System.out.println("3������ ������ ���ʴ�� �Է��Ͻÿ�");
		java=sc.nextInt();
		html=sc.nextInt();
		oracle=sc.nextInt();
		
		sum=java+html+oracle;
		avg=sum/3.0;
		System.out.println("����:"+sum);
		System.out.printf("���: %.2f\n",avg);
		//���� : ����� true/false
	boolean a= avg>=60;
		//if ��
		if(a)
			msg = "�հ� !!";
			else
				msg = "���հ� !!";
		System.out.println(msg);
		
//		//���ǿ�����
//		msg=a? "�հ� !!":"���հ� !!";
////		System.out.println(msg);
//		if (avg>=60)
//			msg = "�հ�";
//		else msg = "���հ�";
//		System.out.println(msg);
		
//		msg = avg>=60?"�հ�":"���հ�";
//		System.out.println(msg);
		
	}

}