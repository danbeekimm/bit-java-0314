package day0405;

class Apple{
	private void methodA()
	{
		System.out.println("super �޼��� A");
	}
	
	public void methodB()
	{
		System.out.println("super �޼��� B");
	}
}
/////////////////////////
class Banana extends Apple
{
	public void methodC()
	{
		System.out.println("sub �޼��� C");
	}
}



public class Ex3Inheri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Banana b=new Banana();
		b.methodB();//��ӵ� �޼���
		b.methodC();
	}

}

