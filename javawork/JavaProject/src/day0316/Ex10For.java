package day0316;

import java.util.Scanner;

public class Ex10For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//예
		//1. 지수승구하기 2. 숫자n까지의 합 3. 숫자n까지의 팩토리알 4. 종료
		Scanner sc=new Scanner(System.in);
		int menu;
		while(true) {
			System.out.println("1.지수승구하기");
			System.out.println("2.숫자n까지의 합");
			System.out.println("3.숫자n까지의 팩토리알");
			System.out.println("4.종료");
			
			menu=sc.nextInt();
			if(menu==4) {
				System.out.println("프로그램종료");
				break;
			}
			switch(menu) {
			case 1:{
				int r=1;
				int x,y;
				System.out.println("지수승을 구할 x,y 두숫자입력");
				x=sc.nextInt();
				y=sc.nextInt();
				for (int i=1;i<=y;i++) {
					r*=x;
					
				}
				System.out.println(x+"의"+y+"승은 "+r+"입니다.");
			}
				break;
			case 2:{
				int n ;
				int sum =0;
				System.out.println("합계를구할 숫자를 입력하세요.");
				n=sc.nextInt();
				for(int i=1;i<=n;i++) {
					
					sum  += i;}
				System.out.println("1부터 "+n+"까지의 합은"+sum+"입니다.");
				
			}
				break;
				
			case 3:
			{
				int n;
				int sum=1;
				System.out.println("팩토리알을 구할 숫자를 입력하세요.");
				n=sc.nextInt();
				for(int i=1;i<=n;i++) {
					sum*=i;
				}
				System.out.println("숫자"+n+"까지의 팩토리알 값은"+sum+"입니다.");
			}
				break;
			default:
				System.out.println("메뉴를 다시 선택하세요");
			}
		}
		
		
		
	}

}
