
package day0316;

import java.util.Scanner;

public class Ex1Munje {

	public static void main(String[] args) {
		
////1���� 100 ������ ������ ���� rnd �� ������
//		�� ���ڸ� �˾Ƹ��ߴ� ���α׷��� �ۼ��Ͻÿ�
//		while��,if��,random �޼��� ���
		
		
		Scanner sc=new Scanner(System.in);
			int cnt=0;
			int rnd;//������
			int num;//�����Է��� ��
			//1~100�����߻�
			rnd=(int)(Math.random()*100)+1;
			while(true) {
				System.out.print(++cnt+":");
				num=sc.nextInt();
				if(num>rnd) {
					System.out.println("\t"+num+"�����۽��ϴ�");
					
				}else if(num<rnd) {
					System.out.println("\t"+num+"����Ů�ϴ�");
				}else { 
					System.out.println("�¾ҽ��ϴ�.������"+rnd+"�Դϴ�");
					System.out.println("�����մϴ�");
					break;}
				if(cnt>=10) {
					System.out.println("\t==�ð��ʰ� , �����մϴ�");
					break;
				}
				
			}
		
	}
	}

