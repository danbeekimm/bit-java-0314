package day0315;

public class Ex2DateType {

	public static void main(String[] args) {
		byte b1=127;
		byte b2=(byte)129;
		System.out.println(b1);
		System.out.println(b2);//���̳ʽ��� ���(2�� ����)
		float f1= 123.456789f; //f�� ���̸� 4����Ʈ�� float���� ����.
		double d1 = 123.456789123; 
		
		System.out.println(f1);// �Ҽ������� 8�����ڸ��� ��Ȯ��
		System.out.println(d1);//�Ҽ������� 15�����ڸ��� ��Ȯ��
		
		boolean b = true;
		System.out.println(b);
		System.out.println(!b);
		
		//printf �� ��ȯ��ȣ�� ����ؼ� ����Ҷ� ���(jdk5���� �߰��� ���)
		//����:%d, �Ǽ�:%f, ����:%c, ���ڿ� :%s
		System.out.printf("f1=%7.1f,d1=%7.2f\n",f1,d1);// \n:����, \t:��
		
		char ch ='A';
		System.out.printf("ch=%c\n",ch);
		
		//"Red" �̷��� �������ϴ¹�. \"
		System.out.println("\"Red\",\"Blue\"");
		
		//������ ��θ� ��Ÿ���� /�� �ǰ� \�� ��. ��� \\���� �ؾ���.
		System.out.println("c:/image/sun.jpg");
		System.out.println("c:\\image\\sun.jpg");
		
		
		
		
		
		
		

	}

}
