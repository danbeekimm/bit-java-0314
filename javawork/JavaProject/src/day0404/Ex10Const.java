package day0404;
//������(constructor)
//Ư¡1. ��ü ������ �ڵ�ȣ��
//	2. �����ڴ� �����ε��� ����
//3. �����ڸ��� �ݵ�� Ŭ������� �����ؾ���. //��ũ��6�ʹٸ�
//4. ����Ÿ��(void �̷���)�� ����(����:���������� Ŭ������ (����))
//5. �ַ� ��������� �ʱ�ȭ�� ���.
//6. ���� �����ڳ����� this()�� ȣ��

class Sawon{
	String name;
	String gender;
	String buseo;
	
	Sawon(){
		this("��浿","����","ȫ����"); //3��° ������ ȣ�� �����ڳ��� ȣ��� �𽺾��ϱ�
		//�ؿ� 3��¥�� �� �޾Ƽ� ��밡��.
//		System.out.println("�⺻������");
//		name="��ܺ�";
//		gender="����";
//		buseo="ȫ����";
	}
	Sawon(String name){
		this(name,"����","������"); //�ؿ���������
//		this.name=name;
//		gender="����";
//		buseo="������";
		
	}
	
	Sawon(String name,String gender,String buseo){
		this.name=name;
		this.gender=gender;
		this.buseo=buseo;
	}
	public void write() {
		System.out.println("�̸�:"+name);
		System.out.println("����:"+gender);
		System.out.println("�μ�:"+buseo);
		System.out.println();
	}
}
public class Ex10Const {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sawon s1=new Sawon();
		s1.write();
		Sawon s2=new Sawon("�̿���");
		s2.write();
		Sawon s3=new Sawon("�̵̹�","����","�λ��");
		s3.write();
	}

}
