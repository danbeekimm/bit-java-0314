package day0404;

public class Ex7CallBy {
	
	public static void dataIn(Person p) {
		p.name="��ȣ��";
		p.addr="�λ�";
	}
	
	public static void dataOut(Person p) { //p�� person�� �ּҴ°�
		System.out.println("**��Ȯ��**");
		System.out.println("�̸�"+p.name+"�ּ�:"+p.addr);
	}//Ŭ�����󰡴ɷ��۷�����. ��Ʈ�� ��Ʈ�����ȵ�.
	public static void main(String[] args) {
		Person person=new Person();
		//�ּҰ����޵ǹǷ� dataIn���� �Էµ� ����Ÿ�� person�� ����ȴ�
		dataIn(person);
		//dataIn���� ����� ����Ÿ�� ��µȴ�.
		dataOut(person);
	}

}
