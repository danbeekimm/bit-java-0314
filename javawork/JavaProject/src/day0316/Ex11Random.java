package day0316;

public class Ex11Random {

	public static void main(String[] args) {
		//static은 클래스명으로 바로 호출됨.생성안해도
		// TODO Auto-generated method stub
		//임의의수(랜덤)구하는 방법이 두가지있다.
		//1Math.random
		//2Random 클래스
		for(int i=1;i<=5;i++) {
			double a=Math.random();
			//System.out.println(a);
		}
		System.out.println(("0~9사이의 난수 구하기"));
		for(int i=1;i<=5;i++) {
			int a=(int)(Math.random()*10);
			System.out.println(a);
		}
		
		System.out.println(("0~99사이의 난수 구하기"));
		for(int i=1;i<=5;i++) {
			int a=(int)(Math.random()*100);
			System.out.println(a);
		}
		
		System.out.println(("1~100사이의 난수 구하기"));
		for(int i=1;i<=5;i++) {
			int a=(int)(Math.random()*100)+1;
			System.out.println(a);
		}
		
		System.out.println(("임의의 알파벳 A~Z(65~90)까지구하기"));
		for(int i=1;i<=5;i++) {
			int a=(int)(Math.random()*35)+65;
			System.out.println((char)a);
			
		}
	}

}
