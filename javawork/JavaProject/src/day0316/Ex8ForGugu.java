package day0316;

import java.util.Scanner;

public class Ex8ForGugu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ������ ���ڸ� �Է¹޾� �ش���� ����Ͻÿ�
		//�� 0�Է½� ����.
		Scanner sc=new Scanner(System.in);
		int dan;
		while (true) {
			System.out.println("�������� �Է�");
			dan=sc.nextInt();
			//o�϶� break
			if (dan==0)
				break;
			if (!(dan>=2 && dan<=9)) {
				System.out.println("�ٽ� �Է����ּ���");
				continue;
			}
				
			//�� ���� ���
				System.out.println(dan+"��");
			//for �� ���
			for(int i=1;i<10;i++) {
				
					System.out.println(dan+"x"+i+"="+dan*i);
				}
			System.out.println();
			}
		
		}
}