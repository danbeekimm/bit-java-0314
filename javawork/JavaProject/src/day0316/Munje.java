package day0316;

import java.util.Scanner;

public class Munje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//점수를 입력받아 총점과 평균과 입력받은 갯수를 구하시오
		//단 점수가 1~100이 아니면 다시입력(갯수에서 빠짐)
		// 점수가 0이면 반복문 종료후 출력
		
		Scanner sc= new Scanner(System.in);
		int cou;
		double avg;
		int a;
		int tot;
		cou=tot=0;
		while(true) {
			System.out.println("점수를 입력하시오");
			a=sc.nextInt();
		
		
		
			if(a==0)
				break;
			if(a<0 || a>100) {
				System.out.println("다시입력하세요");
				continue;}
			tot +=a;
			cou++;
		}
		avg = (double)tot/cou;
		System.out.println("평균"+avg);
		System.out.println("갯수"+cou);
		System.out.println("총점"+tot);
	

}
}

