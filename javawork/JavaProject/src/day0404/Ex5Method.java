package day0404;
class Score{
	private int java;
	private int spring;
	//setter method
	
	
	public void setJava(int java){
		this.java=java;
	}
	
	public void setSpring(int spring){
		this.spring=spring;
	}
	//getter method
	public int getJava() {
		return this.java;
	}
	
	public int getSpring() {
		return this.spring;
	}
}

class Student{
	//모든 멤버변수는 초기값이 없으면 null이나옴
	private String name;
	public Score score=new Score();
	
	//setter&getter
	
 //setter
	public void setName(String name) {
		this.name=name;
	}
	
	//getter
	public String getName() {
		return this.name;
	}
	
	
}
public class Ex5Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu=new Student();
		//이름전달
		stu.setName("송혜교");
		//두과목점수
		stu.score.setJava(90); //셋자바가호출하는스코어가 널이라고나옴.위에따로 new생성해주기
		stu.score.setSpring(100);
		
		//출력 (이름, 자바점수, 스프링점수 출력하기
		System.out.println("이름:"+stu.getName());
		System.out.println("자바점수:"+stu.score.getJava());
		System.out.println("스프링점수:"+stu.score.getSpring());
		
	}

}
