package day0404;

public class Ex8Overloading {

	
	//write인자가있음4가지밖에안돼.
	public static void write(String s) {
		System.out.println("문자열"+s);
	}
	
	public static void write(int s) {
		System.out.println("정수값"+s);
	}
	
	public static void write(String []s) {
		System.out.println("문자열배열");
		for(String a:s)
			System.out.println(a);
	}
	
	public static void write(String s1,String s2) {
		System.out.println("문자열"+s1+","+s2);
	}
	//합계를 구하는 overloading 메서드
	public static int sum(int a,int b) {
		return a+b;
	}
	public static double sum(double a, double b)
	{
		return a+b;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		write(100);
		write("사과");
		write("red","pink");
//		write("red","orange","pink")오류 >>안만들어놨기때문
		String []s= {"red","orange","pink","green"};
		write(s);
		
		System.out.println("합계"+sum(4,5));
		System.out.println("합계"+sum(1.2,6.5));
		//System.out.println("합계"+sum("red",5));는 오류
	}

}
