package day0404;

class Person{
	String name;
	String addr;
}
public class Ex6CallBy {
	
	public static void changeInt(int a) {
		a=10;
	} //int������
	
	public static void changeArray(int []a) {
		a[2]=25;
	} //array������
	
	public static void changePerson(Person p) {
		p.addr="���ֵ�";
	}
//��Ʈ���� Ŭ����Ÿ�������� �������޵�
	public static void changeString(String s) {
		s="apple";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		changeInt(n); //n������(call by value)
		System.out.println(n);
		
		int []arr= {1,5,10};//�迭�� �����Ƿ��۷���Ÿ�� (��ü���ν�)
		changeArray(arr);//�ּҸ����� call by reference
		for(int a:arr)
			System.out.println(a);
		
		Person p=new Person();
		p.name="ȫ�浿";
		p.addr="����";
		
		changePerson(p); //�ּ����� call by reference
		System.out.println(p.name+","+p.addr);
		
		String s="orange";
		changeString(s); //��Ʈ�հ��� ���޵ǹǷ� �޼��忡�� ����Ȱ��̹ݿ��ȵ�.
		//���ּҰ��ٲ����ϴµ����̹ٲ�ϱ�. 
		System.out.println(s);
	}

}