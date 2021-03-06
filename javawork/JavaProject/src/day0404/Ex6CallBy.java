package day0404;

class Person{
	String name;
	String addr;
}
public class Ex6CallBy {
	
	public static void changeInt(int a) {
		a=10;
	} //int값변경
	
	public static void changeArray(int []a) {
		a[2]=25;
	} //array값변경
	
	public static void changePerson(Person p) {
		p.addr="제주도";
	}
//스트링은 클래스타입이지만 값이전달됨
	public static void changeString(String s) {
		s="apple";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		changeInt(n); //n값전달(call by value)
		System.out.println(n);
		
		int []arr= {1,5,10};//배열은 무조건레퍼런스타입 (객체로인식)
		changeArray(arr);//주소를전달 call by reference
		for(int a:arr)
			System.out.println(a);
		
		Person p=new Person();
		p.name="홍길동";
		p.addr="서울";
		
		changePerson(p); //주소전달 call by reference
		System.out.println(p.name+","+p.addr);
		
		String s="orange";
		changeString(s); //스트롱값이 전달되므로 메서드에서 변경된값이반영안됨.
		//ㄴ주소가바껴야하는데값이바뀌니까. 
		System.out.println(s);
	}

}
