package day0317;

public class Ex3Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[]ch;
		ch=new char[4];
		System.out.println("length="+ch.length);
		System.out.println("�ʱⰪ���");
		for(int i=0; i<ch.length;i++) {
			System.out.println((int)ch[i]);
		}
		
		ch[0]='A';
		ch[1]=67;
		ch[2]=90;
		ch[3]='*';
		
		System.out.println("�迭��¹��1");
		for(int i=0; i<ch.length; i++) {
			System.out.printf("%3c",ch[i]);
		}
		System.out.println("\n�迭��¹��2");
		for(char a:ch)//a�� ���ڵ��鼭��µ�
			System.out.printf("%3c",a);
	}

}
