package day0318;

public class Ex2StringCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Apple".compareTo("Apple"));
		//마지막까지같을경우 0
		
		System.out.println("Apple".compareTo("Banana"));
		//오름차순으로되어있을때 -1이나옴. 숫자크기
		
		System.out.println("Hello".compareTo("Hi"));//e랑 i차이
		
		System.out.println("Hello".compareTo("Apple"));//7만큼크다
	}

}
