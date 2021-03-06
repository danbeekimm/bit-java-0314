package day0404;

public class Ex4Method {
	private String name;
	private int age; //메서드만으로 값가져와라. 셋터메서드,반환시 겟터메서드
	
	//setter method:값변경시 필요한 메서드 셋터반환타입없음 주로 보이드임
	public void setName(String name)
	{
		this.name=name; //인자가같은이름일경우 멤버변수명앞에 반드시 this 붙이기
		//name을 셋네임에있는 걸로인식해버림.. 위 프리베이트 네임으로 인식하고싶으면
		//this
		
	}
	public void setAge(int age) { //파라미터로받은 외부에서받은 변수와 에이지같은이름
		this.age=age; //this사용
	}
	//getter method:값얻을때 사용 //멤버변수값을 반환하기위한 메서드
	public String getName() {
		return this.name;//this는 생략가능
	}
	
	public int getAge() {
		return age;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex4Method ex1=new Ex4Method();
		ex1.setName("이기자");
		ex1.setAge(25);
		
		Ex4Method ex2=new Ex4Method();
		ex2.setName("강기자");
		ex2.setAge(30);
		
		System.out.println("이름:"+ex1.getName());
		System.out.println("나이:"+ex1.getAge());
		System.out.println();
		
		System.out.println("이름:"+ex2.getName());
		System.out.println("나이:"+ex2.getAge());

	}

}
