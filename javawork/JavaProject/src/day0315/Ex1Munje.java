package day0315;

import java.util.Scanner;

public class Ex1Munje {

	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String  name;
		int count;
		int money,total;
		
		System.out.println("상품명");
		
		name=sc.nextLine();
		System.out.println("수량");
		count =sc.nextInt();
		System.out.println("단가");
		money = sc.nextInt();
		
		total = count*money; 
		
		if (count>=5) {
			total = (int)(total*0.9);
			System.out.println("총금액은 10% dc한 "+total+"원 입니다.");
		}else {  
			System.out.println("총금액은"+total+"원 입니다.");
		}
			
	}
}

