package day0404;
//생성자(constructor)
//특징1. 객체 생성시 자동호출
//	2. 생성자는 오버로딩이 가능
//3. 생성자명은 반드시 클래스명과 동일해야함. //에크마6와다름
//4. 리턴타입(void 이런거)이 없다(형식:접근지정자 클래스명 (인자))
//5. 주로 멤버변수의 초기화를 담당.
//6. 같은 생성자끼리는 this()로 호출

class Sawon{
	String name;
	String gender;
	String buseo;
	
	Sawon(){
		this("김길동","남자","홍보부"); //3번째 생성자 호출 생성자끼리 호출시 디스쓰니까
		//밑에 3개짜리 를 받아서 사용가능.
//		System.out.println("기본생성자");
//		name="김단비";
//		gender="여자";
//		buseo="홍보부";
	}
	Sawon(String name){
		this(name,"여자","교육부"); //밑에꺼랑같음
//		this.name=name;
//		gender="남자";
//		buseo="교육부";
		
	}
	
	Sawon(String name,String gender,String buseo){
		this.name=name;
		this.gender=gender;
		this.buseo=buseo;
	}
	public void write() {
		System.out.println("이름:"+name);
		System.out.println("성별:"+gender);
		System.out.println("부서:"+buseo);
		System.out.println();
	}
}
public class Ex10Const {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sawon s1=new Sawon();
		s1.write();
		Sawon s2=new Sawon("이영자");
		s2.write();
		Sawon s3=new Sawon("이미도","여자","인사부");
		s3.write();
	}

}
