package day0405;
abstract class Parent
//추상메서드를 한개이상 포함한경우 반드시클래스도 추상화 넣기
//abstract는 일반과 추상메서드 모두구현가능
{
//	public void process()
//	{
//		System.out.println("부모가 딱히 하는일이 없음");
//	}
	
	public void title() {
		System.out.println("부모만이 하는일처리" ); //일반메서드
	}
	//process가 하는일은 없지만 오버라이드를위해 메서드 존재는 피료한다
	abstract public void process(); //미완성의 메서드 (abstract :추상화)로구현한다
}
/////////////////////////////////
class ChildA extends Parent
{
	@Override 
	public void process() {
		
		
	System.out.println("페인트칠합니다");
}
}

class ChildB extends Parent
{
	@Override 
	public void process() {
		
		
	System.out.println("집안청소합니다");
}
}
public class Ex7Abstract {
	public static void process(Parent p)
	{
		p.title(); //	부모만이가진메서드호출가능 //자식만은 오버라이드
		// 다형성처리
		p.process(); //오버라이드된 메서드만 호출이가능 (예외>부모만가지면 호출가능
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	process(new SuperObj()); 이건안돼 추상클래스는 객체생성할수없고 상속받은 클래스로만가능해서
		process(new ChildA());
		process(new ChildB());
	}

}
