package day0315;

public class Ex3String {

	public static void main(String[] args) {
		String s1 = "Happy";//���1
		String s2 = new String("Happy");//���2
		System.out.println(s1);
		System.out.println(s2);
		
		
		int a=5,b=5;
		System.out.println(a==b);
		System.out.println(s1==s2);//==Ŭ���� Ÿ�Կ������ּҸ�����.
		//���ڿ����� ���� ������ ���Ϸ��� equals ��� �޼��� ���.
		System.out.println(s1.equals("Happy"));//��ҹ��ڰ��ƾ� true.
		System.out.println(s1.equals("happy"));
		System.out.println(s1.equals(s2));
		
		//���� ��ҹ��� ������� ö�ڸ� ���ϰ����Ҷ�,
		System.out.println(s1.equalsIgnoreCase("happy"));
		System.out.println(s2.equalsIgnoreCase("aPPle"));
		
		//���ڿ��� ���� ���ϱ�
		System.out.println(s1.length());//�޼���� ()�ְ�, �迭�������� �Ӽ��̶�.
		
		//���ڿ���ù���ڱ��ϱ�
		char start=s1.charAt(0);
		char startChar = s1.charAt(0);//Happy��¹��ڿ�
		System.out.println(startChar);
		
		//��ü�� ������ �빮�� �Ǵ� �ҹ��ڷ� ���
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		
		String s3= "Have a Nice Day!!";
		System.out.println(s3.startsWith("Have"));//s3���ڿ���Have�� ������ ��� true
		System.out.println(s3.endsWith("!"));//s3���ڿ���!�� ���� ��� true
		System.out.println(s3.startsWith("Happy"));
		System.out.println(s3.endsWith("*"));
		
		//
		
		
		
		
	}

}