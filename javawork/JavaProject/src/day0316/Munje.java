package day0316;

import java.util.Scanner;

public class Munje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//������ �Է¹޾� ������ ��հ� �Է¹��� ������ ���Ͻÿ�
		//�� ������ 1~100�� �ƴϸ� �ٽ��Է�(�������� ����)
		// ������ 0�̸� �ݺ��� ������ ���
		
		Scanner sc= new Scanner(System.in);
		int cou;
		double avg;
		int a;
		int tot;
		cou=tot=0;
		while(true) {
			System.out.println("������ �Է��Ͻÿ�");
			a=sc.nextInt();
		
		
		
			if(a==0)
				break;
			if(a<0 || a>100) {
				System.out.println("�ٽ��Է��ϼ���");
				continue;}
			tot +=a;
			cou++;
		}
		avg = (double)tot/cou;
		System.out.println("���"+avg);
		System.out.println("����"+cou);
		System.out.println("����"+tot);
	

}
}
