package day0315;

import java.util.Scanner;

public class Ex1Munje {

	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String  name;
		int count;
		int money,total;
		
		System.out.println("��ǰ��");
		
		name=sc.nextLine();
		System.out.println("����");
		count =sc.nextInt();
		System.out.println("�ܰ�");
		money = sc.nextInt();
		
		total = count*money; 
		
		if (count>=5) {
			total = (int)(total*0.9);
			System.out.println("�ѱݾ��� 10% dc�� "+total+"�� �Դϴ�.");
		}else {  
			System.out.println("�ѱݾ���"+total+"�� �Դϴ�.");
		}
			
	}
}
