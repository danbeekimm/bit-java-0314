package day0317;

import java.util.Scanner;

public class Ex2Random {

	private static final String Exit = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1번문제에 추가하기. 계속이어서 다른숫자 맞추기
		Scanner sc= new Scanner(System.in);
		int  rnd;
		int cnt;
		int num;
		char ans;

		Exit:
			while(true) {
				System.out.println("게임을 시작합니다");
				cnt=0;
				rnd = (int)(Math.random()*100)+1;


				while(true) {
					System.out.print(++cnt+":");
					num=Integer.parseInt(sc.nextLine());
					//문자열로 읽은후 int 타입전환.
					//숫자문자섞여잇을땐 정확히 int로 해줘야함
					if (num>rnd)
						System.out.println("\t"+num+"보다 작습니다");
					else if (num<rnd)
						System.out.println("\t"+num+"보다 큽니다");
					else {
						System.out.println("정답입니다. 정답은"+rnd+"입니다");
						System.out.println("계속하려면 y,그만하려면n을 눌러주세요");
						ans = sc.nextLine().charAt(0);
						//문자열 형태로 첫글자만 char로 얻는다.
						if(ans=='y' || ans =='Y') {
							System.out.println("새로운난수를발생합니다");
							continue Exit;
						}else {
							System.out.println("프로그램종료");
							break Exit;
					}
						}

					}
				
			}
	}

}
