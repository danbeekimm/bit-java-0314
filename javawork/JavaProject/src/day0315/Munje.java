package day0315;

import java.util.Scanner;

public class Munje {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int a;
		int sum=0;
		int b;
		int x ;
		
		System.out.println("���� �ΰ��� �Է����ּ���");
		a=sc.nextInt();
		b=sc.nextInt();
		
		for (x = a; x <= b; x++) {
		    sum = sum += x;
		}
		    
		System.out.println(a + " ���� " + b + " ������ ������ ���� " + sum + " �̴�");

		}

	}

