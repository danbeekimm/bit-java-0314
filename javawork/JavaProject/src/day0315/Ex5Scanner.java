package day0315;

import java.util.Scanner;

public class Ex5Scanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score;
		String name;
		char blood;


		System.out.println("�����Է�"); 
	//	score = sc.nextInt(); 
//		//enter�� Ű���� ���۷������.���ڴ�������������,
//		//������ ���͸� �о �Ҹ��Ų��. 
//		//��Ʈ��a: ��ü, ��Ʈ��i:����
//		sc.nextLine();

		//System.out.println("�����Է�"); 
		//������ �ϴ� ���ڿ��� ������intŸ������ ��ȯ.
		//Integer.parseInt(a) : ���ڿ�a�� int Ÿ������ ��ȯ
		//�� �������°� �ƴҰ�� ���ܰ� �߻��Ѵ�.
		score =Integer.parseInt(sc.nextLine());

		System.out.println("�̸��Է�");
		name = sc.nextLine();

		System.out.println("������ �ѱ��� �Է�");
		blood = sc.nextLine().charAt(0);

		System.out.println("��  ��" + name);
		System.out.println("��  ��" + score);
		System.out.println("������" + blood);

	}

}