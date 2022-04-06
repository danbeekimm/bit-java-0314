package day0315;

import java.util.Scanner;

public class Ex8Operator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int kor;//국어점수변수
		String msg; //결과메세지 변수
		//국어점수를 입력후 90이상이면 "Excellent!"라고 msg에 저장
		//90미만이면 "Try!!!"라고 저장

		System.out.println("국어점수");
		kor=sc.nextInt();
		
		//if 문
		if (kor>=90)
			msg = "Excellent!";
		else
			msg = "Try!!!";
		System.out.println(kor+"=>"+msg);
		
		//조건연산자
		msg=kor>=90?"Excellent!":"Try!!!";
		System.out.println(kor+"=>"+msg);
	

	}

}
