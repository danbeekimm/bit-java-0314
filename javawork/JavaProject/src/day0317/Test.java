package day0317;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


//숫자 x,y를 입력받은후 x부터 y까지의 합계를 구하는 프로그램을 작성하시오
//(예) 2 5 를 입력시  14 출력하면 됨
//(for문 문제)
////


int sum = 0;
int x;
int y;
int n;
Scanner sc = new Scanner(System.in);
System.out.println("x와 y를 입력하시오");

x = sc.nextInt();        
y = sc.nextInt();  
for (n = x; n <= y; n++) {
    sum = sum + n;
}
    
System.out.println(x + " 부터 " + y + " 까지의 정수의 합은 " + sum + " 이다");

	
	
		
	
	}
}

//
//
	






//2. 문자열 배열에 5개의 색상명(한글,영문 상관없음) 을 저장후 출력하는 프로그램을 작성하시오
//(배열 문제)
//	
//	String []str1= new String[5];
//	str1[0]="빨강";
//	str1[1]="파랑";
//	str1[2]="초록";
//	str1[3]="하양";
//	str1[4]="검정";
//	
//	System.out.println("[색상명 5가지]");
//	for (String s :str1)
//		System.out.println(s);


