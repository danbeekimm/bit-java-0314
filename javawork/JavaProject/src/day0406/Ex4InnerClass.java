package day0406;
//Member내부클래스
class Outer
{
	int a=10;
	static int b=20;
	
	//내부클래스 
	class Inner{
		int c=30;
//		static int d=40; member내부클래스에서 스테틱변수선언불가
		
		public void disp()
		{
			System.out.println("a="+a);
			System.out.println("b="+b);
			System.out.println("c="+c);
		}
		
	}
	//위까지 내부클래스 외부에서호출해씀거의
	
	public void outerDisp()
	{
		//내부클래스선언
		Inner in=new Inner();
		in.disp();
	}
}
public class Ex4InnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//외부클래스가 가진 메서드 호출(메서드에서 내부클래스 선언시)
		Outer out=new Outer();
		out.outerDisp();
		System.out.println();
		//외부클래스의 메서드를 거치지않고 바로 내부클래스의 메서드를 호출하고자할경우
		//위는 거친거임,,
		
		Outer.Inner inner=new Outer().new Inner();
		inner.disp();
	}

}
