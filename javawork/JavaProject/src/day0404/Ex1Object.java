package day0404;
//클래식여러개만들땐 퍼블릭못써
public class Ex1Object {
//instance 멤버변수선언
	int score=78;//접근지정자는 default(같은 패키지내에서만접근가능)new,this이런거 있어야함
	
	//static 멤버변수
	static int jungdap=90;
	
	//static 메서드는 자기자신을 의미하는 this라는 인스턴스 변수가없다.
	public static void main(String[] args) {
	// TODO Auto-generated method stub
		Ex1Object ex1=new Ex1Object();
		ex1.score=80;
		System.out.println(ex1.score); //main은 스테틱이붙어서 this없어서 인스턴스맞춰야댐
		Ex1Object ex2=new Ex1Object();
		ex2.score=90;
		Ex1Object ex3=new Ex1Object();
		ex3.score=100;
		//인스텍스: 새롭게 공간이지정되어 값을다르게줄수있다.
		//스테틱:안돼
		
		System.out.println(ex2.score);
		System.out.println(ex3.score);
		
		
		System.out.println(jungdap);//같은스테틱끼리는가능
		System.out.println(Ex1Object.jungdap);
	}

}
