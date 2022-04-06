package day0316;


import java.util.Scanner;

public class Ex4While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//점수를 입력받아 총점과 평균과 입력받은 갯수를 구하시오
//단 점수가 1~100이 아니면 다시입력(갯수에서 빠짐)
// 점수가 0이면 반복문 종료후 출력
		Scanner sc = new Scanner(System.in);
		
		int score;
		int total;
		int cnt ;
		float avg;
		//최기값 지정
		total=cnt=0;
		
		while (true) {
			System.out.println("점수입력하기");
			score=sc.nextInt();
			if(score==0)
				break;
			if(score<0 || score>100) {
				System.out.println("다시입력하세요");
				continue;//조건식으로 이동, 하던작업을 멈추고 처음부터시작
			}
			total+=score;
			cnt++;
		}
		avg=(float)total/cnt;
		System.out.println("총입력갯수"+cnt);
		System.out.println("총합"+total);
		System.out.println("평균"+avg);
	}

	
	}


