package day0406;

abstract class AbstA
{
	abstract public void hello();
}
interface InterAnony
{
	public void process();
}


public class Ex6AnonyClass {
	AbstA aa=new AbstA() {
		
		@Override
		public void hello() {
			// TODO Auto-generated method stub
			System.out.println("hello 익명내부클래스에서구현함");
		}
	};
	
	InterAnony ia=new InterAnony() {
		
		@Override
		public void process() {
			// TODO Auto-generated method stub
			System.out.println("process:익명내부로구현함!!");
		}
	};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex6AnonyClass ex=new Ex6AnonyClass();
		ex.aa.hello();
		ex.ia.process();
	}

}
