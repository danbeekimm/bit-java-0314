package day0405;

class Fruit{
	private int danga;
	
	public Fruit() {
		danga=1000;
	}
	Fruit(int danga)
	{
		this.danga=danga;
	}
	public int getDanga() {
		return danga;
	}
}
/////////////////////////////
//��ӹ޴� Ŭ���������
class Orange extends Fruit
{
	private String name;
	public Orange() {
		name="������";
	}
	Orange(String name)
	{
		this.name=name; //name���ܺο���ȣ��ȴ�ġ���� �ܰ��� 1000��
	}
	Orange(String name, int danga)
	{
		//�θ�ܰ��� �����̺� �׷���ó����ߴ�
		super(danga);
		this.name=name;
	}
	public void write() { //super�ε� �����׵��վ this����밡��
		System.out.println("���ϸ�:"+name+",�ܰ�:"+this.getDanga());
	}
}

public class Ex5Inheri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Orange []or=new Orange[3];
		or[0]=new Orange();
		or[1]=new Orange("Ű��");
		or[2]=new Orange("����",3000);
		for(Orange o:or)
			o.write();
	}

}
