
package day0316;

import java.util.Scanner;

public class Ex1Munje {

	public static void main(String[] args) {
		
////1부터 100 사이의 난수를 변수 rnd 에 저장후
//		그 숫자를 알아맞추는 프로그램을 작성하시오
//		while문,if문,random 메서드 사용
		
		
		Scanner sc=new Scanner(System.in);
			int cnt=0;
			int rnd;//랜덤수
			int num;//내가입력한 수
			//1~100난수발생
			rnd=(int)(Math.random()*100)+1;
			while(true) {
				System.out.print(++cnt+":");
				num=sc.nextInt();
				if(num>rnd) {
					System.out.println("\t"+num+"보다작습니다");
					
				}else if(num<rnd) {
					System.out.println("\t"+num+"보다큽니다");
				}else { 
					System.out.println("맞았습니다.정답은"+rnd+"입니다");
					System.out.println("종료합니다");
					break;}
				if(cnt>=10) {
					System.out.println("\t==시간초과 , 종료합니다");
					break;
				}
				
			}
		
	}
	}


