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
//상속받는 클래스만들기
class Orange extends Fruit
{
	private String name;
	public Orange() {
		name="오렌지";
	}
	Orange(String name)
	{
		this.name=name; //name은외부에서호출된다치지만 단가는 1000원
	}
	Orange(String name, int danga)
	{
		//부모단가가 프라이빗 그럼밑처럼써야대
		super(danga);
		this.name=name;
	}
	public void write() { //super인데 나한테도잇어서 this도사용가능
		System.out.println("과일명:"+name+",단가:"+this.getDanga());
	}
}

public class Ex5Inheri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Orange []or=new Orange[3];
		or[0]=new Orange();
		or[1]=new Orange("키위");
		or[2]=new Orange("딸기",3000);
		for(Orange o:or)
			o.write();
	}

}
