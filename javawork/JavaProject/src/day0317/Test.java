package day0317;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


//���� x,y�� �Է¹����� x���� y������ �հ踦 ���ϴ� ���α׷��� �ۼ��Ͻÿ�
//(��) 2 5 �� �Է½�  14 ����ϸ� ��
//(for�� ����)
////


int sum = 0;
int x;
int y;
int n;
Scanner sc = new Scanner(System.in);
System.out.println("x�� y�� �Է��Ͻÿ�");

x = sc.nextInt();        
y = sc.nextInt();  
for (n = x; n <= y; n++) {
    sum = sum + n;
}
    
System.out.println(x + " ���� " + y + " ������ ������ ���� " + sum + " �̴�");

	
	
		
	
	}
}

//
//
	






//2. ���ڿ� �迭�� 5���� �����(�ѱ�,���� �������) �� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�
//(�迭 ����)
//	
//	String []str1= new String[5];
//	str1[0]="����";
//	str1[1]="�Ķ�";
//	str1[2]="�ʷ�";
//	str1[3]="�Ͼ�";
//	str1[4]="����";
//	
//	System.out.println("[����� 5����]");
//	for (String s :str1)
//		System.out.println(s);

