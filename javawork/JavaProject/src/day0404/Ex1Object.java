package day0404;
//Ŭ���Ŀ��������鶩 �ۺ�������
public class Ex1Object {
//instance �����������
	int score=78;//���������ڴ� default(���� ��Ű�������������ٰ���)new,this�̷��� �־����
	
	//static �������
	static int jungdap=90;
	
	//static �޼���� �ڱ��ڽ��� �ǹ��ϴ� this��� �ν��Ͻ� ����������.
	public static void main(String[] args) {
	// TODO Auto-generated method stub
		Ex1Object ex1=new Ex1Object();
		ex1.score=80;
		System.out.println(ex1.score); //main�� ����ƽ�̺پ this��� �ν��Ͻ�����ߴ�
		Ex1Object ex2=new Ex1Object();
		ex2.score=90;
		Ex1Object ex3=new Ex1Object();
		ex3.score=100;
		//�ν��ؽ�: ���Ӱ� �����������Ǿ� �����ٸ����ټ��ִ�.
		//����ƽ:�ȵ�
		
		System.out.println(ex2.score);
		System.out.println(ex3.score);
		
		
		System.out.println(jungdap);//��������ƽ�����°���
		System.out.println(Ex1Object.jungdap);
	}

}