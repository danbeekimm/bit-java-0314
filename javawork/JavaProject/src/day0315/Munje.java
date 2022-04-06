package day0315;

import java.util.Scanner;

public class Munje {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int a;
		int sum=0;
		int b;
		int x ;
		
		System.out.println("숫자 두개를 입력해주세요");
		a=sc.nextInt();
		b=sc.nextInt();
		
		for (x = a; x <= b; x++) {
		    sum = sum += x;
		}
		    
		System.out.println(a + " 부터 " + b + " 까지의 정수의 합은 " + sum + " 이다");

		}

	}

