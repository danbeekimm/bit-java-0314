package day0315;

import java.util.Scanner;

public class Ex7Operator {

	public static void main(String[] args) {
		//��������� : +,-,*,/,%
		//�޿��� �Է��� ����,õ��,���,�ʿ�.�Ͽ��� ������ �����Ͽ� ����Ͻÿ�
		int money;
		Scanner sc=new Scanner(System.in);
		System.out.println("�޿��� �Է��ϼ���.");
		
		money=sc.nextInt();
		System.out.println("���� �� �� ��:"+money+"��");
		System.out.println("���� : "+money/10000);
		System.out.println("õ�� : "+(money%10000)/1000);
		System.out.println("��� : "+(money%1000)/100);
		System.out.println("�ʿ� : "+(money%100)/10);
		System.out.println("�Ͽ� : "+(money%10)/1);

	}

}