package day0405;

//다형성
class SuperObj //부모클래스
{
	public void process()
	{
		
		System.out.println("super부모가 공통적인 일을 처리한다");
	}
}
//////////////////////////////////
class Draw extends SuperObj
{
	@Override 
	public void process() {
		// TODO Auto-generated method stub
		super.process();
	System.out.println("나는그림을그려요");
}
}
/////////////////////////////////
class Game extends SuperObj
{
	@Override 
	public void process() {
		// TODO Auto-generated method stub
		
	System.out.println("나는게임을해요");
}
}
public class Ex6Inheri {

	public static void process(SuperObj obj)
	{
		obj.process();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		SuperObj obj=null;
//		obj=new Draw();
//		obj.process(); //Draw가가진 프로세스호출
//		
//		obj=new Game();
//		obj.process();//GAME가가진 프로세스호출
//		process(new SuperObj()); 여기선돼 완벽해서
		process(new Draw()); //그림그리는일처리
		process(new Draw()); //게임에 관한일처리
		
	}

}
