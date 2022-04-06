package day0405;

//interface 는 상수와 추상메서드만 구현이가능
interface InterA{
	int SPEED=100; //final상수 일반변수올수없음
	public void speedWrite(); //abstract 메소드 인터페이스는구현해야함
}
//인터페이스를 구현하는 클래스
class My implements InterA{//오버라이드하기 제공하는거에 7-8개정도오버라이드만들어야하는경우있음 소스에서오버라이드눌러서하기
	@Override
	public void speedWrite() {
		// TODO Auto-generated method stub
		//SPPED=120; 상수이므로 갑변경할수없음
		System.out.println("나의 스피드는"+SPEED+"입니다.");
	} 
}
public class Ex9Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//다형성
		InterA a=new My();
		a.speedWrite();
	}

}
