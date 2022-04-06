package day0406;
interface InterA
{
	public void draw(); //드로우만 오버라이드하면돼
}
//interface가 interface를 상속받은경우 extends
interface InterB extends InterA
{
	public void play(); 
	//플래이랑드로우가 모두있는것, 오버라이드할거면
	//둘다해야함
	
}
//class에서InterB를 구현할 경우 InterA가 가진것도 오버라이드해야한다
class My1 implements InterB
{
	public void show()
	{
		System.out.println("My1이 가진메서드");
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("draw");
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("play");
	}
	
}


public class Ex1Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		My1 a1=new My1();
		a1.draw();
		a1.play();
		a1.show();//My1ㅏㄴ 가지고있는 메서드 선언이 마이원이여야만가능
		
		InterB a2=new My1(); //마이원이 이미 인터가ㄱ가진기능을가지고잇음
		//오버라이드된 메서드만호출가능
		a2.draw();
		a2.play();
	}

}
