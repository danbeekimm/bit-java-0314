package day0316;

import java.util.Scanner;

public class Ex10For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��
		//1. �����±��ϱ� 2. ����n������ �� 3. ����n������ ���丮�� 4. ����
		Scanner sc=new Scanner(System.in);
		int menu;
		while(true) {
			System.out.println("1.�����±��ϱ�");
			System.out.println("2.����n������ ��");
			System.out.println("3.����n������ ���丮��");
			System.out.println("4.����");
			
			menu=sc.nextInt();
			if(menu==4) {
				System.out.println("���α׷�����");
				break;
			}
			switch(menu) {
			case 1:{
				int r=1;
				int x,y;
				System.out.println("�������� ���� x,y �μ����Է�");
				x=sc.nextInt();
				y=sc.nextInt();
				for (int i=1;i<=y;i++) {
					r*=x;
					
				}
				System.out.println(x+"��"+y+"���� "+r+"�Դϴ�.");
			}
				break;
			case 2:{
				int n ;
				int sum =0;
				System.out.println("�հ踦���� ���ڸ� �Է��ϼ���.");
				n=sc.nextInt();
				for(int i=1;i<=n;i++) {
					
					sum  += i;}
				System.out.println("1���� "+n+"������ ����"+sum+"�Դϴ�.");
				
			}
				break;
				
			case 3:
			{
				int n;
				int sum=1;
				System.out.println("���丮���� ���� ���ڸ� �Է��ϼ���.");
				n=sc.nextInt();
				for(int i=1;i<=n;i++) {
					sum*=i;
				}
				System.out.println("����"+n+"������ ���丮�� ����"+sum+"�Դϴ�.");
			}
				break;
			default:
				System.out.println("�޴��� �ٽ� �����ϼ���");
			}
		}
		
		
		
	}

}