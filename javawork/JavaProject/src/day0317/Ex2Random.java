package day0317;

import java.util.Scanner;

public class Ex2Random {

	private static final String Exit = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1�������� �߰��ϱ�. ����̾ �ٸ����� ���߱�
		Scanner sc= new Scanner(System.in);
		int  rnd;
		int cnt;
		int num;
		char ans;

		Exit:
			while(true) {
				System.out.println("������ �����մϴ�");
				cnt=0;
				rnd = (int)(Math.random()*100)+1;


				while(true) {
					System.out.print(++cnt+":");
					num=Integer.parseInt(sc.nextLine());
					//���ڿ��� ������ int Ÿ����ȯ.
					//���ڹ��ڼ��������� ��Ȯ�� int�� �������
					if (num>rnd)
						System.out.println("\t"+num+"���� �۽��ϴ�");
					else if (num<rnd)
						System.out.println("\t"+num+"���� Ů�ϴ�");
					else {
						System.out.println("�����Դϴ�. ������"+rnd+"�Դϴ�");
						System.out.println("����Ϸ��� y,�׸��Ϸ���n�� �����ּ���");
						ans = sc.nextLine().charAt(0);
						//���ڿ� ���·� ù���ڸ� char�� ��´�.
						if(ans=='y' || ans =='Y') {
							System.out.println("���ο�����߻��մϴ�");
							continue Exit;
						}else {
							System.out.println("���α׷�����");
							break Exit;
					}
						}

					}
				
			}
	}

}