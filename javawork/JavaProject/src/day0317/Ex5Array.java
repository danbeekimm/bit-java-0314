package day0317;

public class Ex5Array {

	public static void main(String[] args) {
		//string �迭 ���ֱ�
		String []str1=new String[3];
		String []str2= {"ȫ�浿", "�踻��","�̸���"};
		
		System.out.println("�ʱⰪ��� (���1)");
		
		for (int i=0; i<str1.length; i++) 
			System.out.printf("%7s",str1[i]);
		System.out.println();
		for (int i=0; i<str2.length; i++) 
			System.out.printf("%5s",str2[i]);
		System.out.println();
		System.out.println("str1�� ���ֱ�");
		str1[0]="��̲�";
		str1[1]="�Ȱ���";
		str1[2]="��ȭ��";
		
		System.out.println("str1�� �ٽ����(���2)");
			
			for (String s :str1)
				System.out.println(s);
			
			
		}
	
	}

