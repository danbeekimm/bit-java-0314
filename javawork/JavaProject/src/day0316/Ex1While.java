package day0316;

public class Ex1While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		while(++a<=5) {//증가후비교
			System.out.println(a);
		}
		System.out.println("빠져나온후의 a 값"+a);
		
		
		a=0;
		while(a++<=5) {//비교후증가
			System.out.println(a);
		}
		System.out.println("빠져나온후의 a 값"+a);
		
		a=0;
		while(true) {// 조건은무조건 true
			System.out.println(++a);
			if(a==5)// a가 5가되면 빠져나간다.
				break;
		}
		System.out.println("빠져나온후의 a 값"+a);
	}
}
