package day0315;

public class Ex6Operator {

	public static void main(String[] args) {
		System.out.println("**증감연산자 연습**");
	int a,b,x,y;
//		x=a++;//후치증감연산자
//		y=++b;//전치증감연산자
//		System.out.println(a+","+b);
//		System.out.println(x+","+y);
//		
//		a=b=x=3;
//		y=++a+b--*++x;
//		System.out.println(y);
		
		a=3;
		System.out.println(a++);//출력후 증가 메모리:4
		System.out.println(++a);//5
		
		System.out.println("** 대입연산자 연습**");
		
		a=5;
		a+=3;//a=a+3
		System.out.println(a);//8
		a*=5;
		System.out.println(a);
		a-=2;
		System.out.println(a);
		a/=3;
		System.out.println(a);
		a%=5;
		System.out.println(a);
		
		
		
		
	}

}
