package day0315;

public class Ex2DateType {

	public static void main(String[] args) {
		byte b1=127;
		byte b2=(byte)129;
		System.out.println(b1);
		System.out.println(b2);//마이너스값 출력(2의 보수)
		float f1= 123.456789f; //f를 붙이면 4바이트의 float으로 선언.
		double d1 = 123.456789123; 
		
		System.out.println(f1);// 소숫점포함 8글자자리의 정확도
		System.out.println(d1);//소숫점포함 15글자자리의 정확도
		
		boolean b = true;
		System.out.println(b);
		System.out.println(!b);
		
		//printf 는 변환기호를 사용해서 출력할때 사용(jdk5에서 추가된 기능)
		//정수:%d, 실수:%f, 문자:%c, 문자열 :%s
		System.out.printf("f1=%7.1f,d1=%7.2f\n",f1,d1);// \n:엔터, \t:탭
		
		char ch ='A';
		System.out.printf("ch=%c\n",ch);
		
		//"Red" 이렇게 나오게하는법. \"
		System.out.println("\"Red\",\"Blue\"");
		
		//파일의 경로를 나타낼때 /도 되고 \도 됨. 대신 \\으로 해야함.
		System.out.println("c:/image/sun.jpg");
		System.out.println("c:\\image\\sun.jpg");
		
		
		
		
		
		
		

	}

}
