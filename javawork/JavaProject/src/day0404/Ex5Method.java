package day0404;
class Score{
	private int java;
	private int spring;
	//setter method
	
	
	public void setJava(int java){
		this.java=java;
	}
	
	public void setSpring(int spring){
		this.spring=spring;
	}
	//getter method
	public int getJava() {
		return this.java;
	}
	
	public int getSpring() {
		return this.spring;
	}
}

class Student{
	//��� ��������� �ʱⰪ�� ������ null�̳���
	private String name;
	public Score score=new Score();
	
	//setter&getter
	
 //setter
	public void setName(String name) {
		this.name=name;
	}
	
	//getter
	public String getName() {
		return this.name;
	}
	
	
}
public class Ex5Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu=new Student();
		//�̸�����
		stu.setName("������");
		//�ΰ�������
		stu.score.setJava(90); //���ڹٰ�ȣ���ϴ½��ھ ���̶������.�������� new�������ֱ�
		stu.score.setSpring(100);
		
		//��� (�̸�, �ڹ�����, ���������� ����ϱ�
		System.out.println("�̸�:"+stu.getName());
		System.out.println("�ڹ�����:"+stu.score.getJava());
		System.out.println("����������:"+stu.score.getSpring());
		
	}

}