package day0404;
 //class여러개와도됨, 벗 퍼블릭은 파일명이같은클레스만가능.
//같은 페키지 내 사용할거면 여러개 클래스만들어도돼
//다른 곳에서도 사용하고싶으면 다른곳에 지정해놔야함.
class Apple{
	//접근지ㅣ정자 연습
	int a=10;
	protected int b=20;
	private int c=30;
	public int d=40;
	
	public final static String MESSAGE="Hello";
	//final상수값변경안돼. 스태틱:클래스만으로도 접근가능하다는의미
 //상수지정시 퍼블릭파이널스테틱자주씀.	
}

public class Ex2Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Apple al=new Apple();
		System.out.println(al.a);
		System.out.println(al.b);
//		System.out.println(al.c); Error떠 private는 같은 클래스내에서만가능
		System.out.println(al.d);
		
		System.out.println(Apple.MESSAGE);//static 변수는 클래스명으로 호
	}

}
