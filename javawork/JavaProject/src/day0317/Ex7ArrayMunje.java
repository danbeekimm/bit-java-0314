package day0317;

import java.util.Scanner;

public class Ex7ArrayMunje {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String []members = {"���Ҷ�","����","��ȣ��","��ȿ��","�չ̳�","���缮"
				,"��ö��","���̸�","������","����"};
		String name;// �Է¹��� �̸�
		int cnt; //�ο��� ����
		//����: �����Է��ϸ� �ش� ���� ���� ����� ����ϰ�
		//�Ѹ������ ����ϱ�
//		�˻��� ��:��
//		1:����
//		3:��ȿ��
//		8:������
//		�� 3��
//		�˻��� �� : ��(���������)
//		�����մϴ�
		
		while(true) {
			cnt=0;
			System.out.println("�˻��� ��:");
			name=sc.nextLine();
			if(name.equals("��")) {
				System.out.println("���α׷�����");
				break;
			}
			for(int i=0;i< members.length;i++) {
				if(members[i].startsWith(name)) {//name�ش缺���ν����ϸ�
					System.out.println(i+":"+members[i]);
					cnt++;
				}
				}
				if(cnt==0)
					System.out.println(name+"������ ����");
				else
					System.out.println("��"+cnt+"��");
				System.out.println();
		}
		}
		
	}

