package day0316;

import java.util.Scanner;

public class Ex8ForGugu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 구구단 숫자를 입력받아 해당단을 출력하시오
		//단 0입력시 종료.
		Scanner sc=new Scanner(System.in);
		int dan;
		while (true) {
			System.out.println("구구단을 입력");
			dan=sc.nextInt();
			//o일때 break
			if (dan==0)
				break;
			if (!(dan>=2 && dan<=9)) {
				System.out.println("다시 입력해주세요");
				continue;
			}
				
			//단 제목 출력
				System.out.println(dan+"단");
			//for 문 사용
			for(int i=1;i<10;i++) {
				
					System.out.println(dan+"x"+i+"="+dan*i);
				}
			System.out.println();
			}
		
		}
}
