package day0406;

import java.util.Scanner;

public class Ex8Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int su1,su2,sum;
		
		System.out.println("숫자1입력");
		try {
			su1=Integer.parseInt(sc.nextLine());
		}catch (NumberFormatException e) {
			System.out.println("첫숫자잘못입력했으므로 0으로초기화함");
			su1=0;
		}
		
		System.out.println("숫자2입력");
		try {
			su2=Integer.parseInt(sc.nextLine());
		}catch (NumberFormatException e) {
			System.out.println("두번째숫자잘못입력했으므로 0으로초기화함");
			su2=0;
		
		}
		sum=su1+su2;
		System.out.println(su1+"+"+su2+"="+sum);
		System.out.println("**정상종료**");
	}

	}
