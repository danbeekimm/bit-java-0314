package day0317;

import java.util.Scanner;

public class Ex8ArrayMunje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�˻��� �̸�:����
		//�������� 2��°�� �ֽ��ϴ�
		//�˻����̸�:������
		// ��������� ���ܿ� �����ϴ�.
		//exit ���� �˻��� �����մϴ�.
		Scanner sc= new Scanner(System.in);

		String []members = {"���Ҷ�","����","��ȣ��","��ȿ��","�չ̳�","���缮"
				,"��ö��","���̸�","������","����"};
		String name;// �Է¹��� �̸�
		int cnt; 

		while (true) {
			cnt=0;
			System.out.print("�˻��� �̸�:");
			name = sc.nextLine();
			if(name.equalsIgnoreCase("exit")) {//��ҹ��ڻ������
				System.out.println("���α׷�����");
				break;}

			for(int i=0;i<members.length;i++) {
				if(name.equals(members[i])) {//�̸��� ������� ������
					System.out.println("\t"+name+"����"+(i+1)+"��°�� �ֽ��ϴ�.");
					cnt=1;
					break;
				}

			}
			if (cnt==0) {
				System.out.println("\t"+name+"�� ���ܿ� �����ϴ�.");
			}

		}

	}
}

	
