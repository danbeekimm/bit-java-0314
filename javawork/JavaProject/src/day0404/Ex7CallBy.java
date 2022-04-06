package day0404;

public class Ex7CallBy {
	
	public static void dataIn(Person p) {
		p.name="강호동";
		p.addr="부산";
	}
	
	public static void dataOut(Person p) { //p와 person은 주소는같
		System.out.println("**값확인**");
		System.out.println("이름"+p.name+"주소:"+p.addr);
	}//클래스라가능레퍼런스로. 인트나 스트롱은안돼.
	public static void main(String[] args) {
		Person person=new Person();
		//주소가전달되므로 dataIn에서 입력된 데이타는 person에 저장된다
		dataIn(person);
		//dataIn에서 저장된 데이타가 출력된다.
		dataOut(person);
	}

}
