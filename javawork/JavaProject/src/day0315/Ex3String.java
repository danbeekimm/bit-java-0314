package day0315;

public class Ex3String {

	public static void main(String[] args) {
		String s1 = "Happy";//방법1
		String s2 = new String("Happy");//방법2
		System.out.println(s1);
		System.out.println(s2);
		
		
		int a=5,b=5;
		System.out.println(a==b);
		System.out.println(s1==s2);//==클래스 타입에서는주소를비교함.
		//문자열에서 값이 같은지 비교하려면 equals 라는 메서드 사용.
		System.out.println(s1.equals("Happy"));//대소문자같아야 true.
		System.out.println(s1.equals("happy"));
		System.out.println(s1.equals(s2));
		
		//만약 대소문자 상관없이 철자만 비교하고자할때,
		System.out.println(s1.equalsIgnoreCase("happy"));
		System.out.println(s2.equalsIgnoreCase("aPPle"));
		
		//문자열의 길이 구하기
		System.out.println(s1.length());//메서드라서 ()있고, 배열에선없음 속성이라서.
		
		//문자열의첫글자구하기
		char start=s1.charAt(0);
		char startChar = s1.charAt(0);//Happy라는문자열
		System.out.println(startChar);
		
		//전체를 무조건 대문자 또는 소문자로 출력
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		
		String s3= "Have a Nice Day!!";
		System.out.println(s3.startsWith("Have"));//s3문자열이Have로 시작할 경우 true
		System.out.println(s3.endsWith("!"));//s3문자열이!로 끝날 경우 true
		System.out.println(s3.startsWith("Happy"));
		System.out.println(s3.endsWith("*"));
		
		//
		
		
		
		
	}

}
