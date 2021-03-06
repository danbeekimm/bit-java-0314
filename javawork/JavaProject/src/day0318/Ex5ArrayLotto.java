package day0318;

import java.util.Scanner;

public class Ex5ArrayLotto {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int money;
		int []lotto=new int[6];
		/*
		 * 문제: 금액을 입력하면  금액에 해당하는 횟수만큼
		 * 로또숫자 출력
		 * 1~45 사이의 중복되지 않은 난수를 배열에 저장후
		 *       오름차순으로 출력하시오
		 */

		System.out.println("로또구입금액입력");
		money =sc.nextInt();
		if(money<1000) {
			System.out.println("금액이부족하므로 종료합니다");
			return; // 현재 메인 함수 종료 
		}

		for(int m=1;m<=money/1000;m++)
		{
			System.out.print(m+"회:");
			//난수 발생(중복처리)-다중for문
			for(int i=0;i<lotto.length;i++)
			{
				lotto[i]=(int)(Math.random()*45)+1;
				for(int j=0;j<i;j++)
				{
					if(lotto[i]==lotto[j])
					{
						i--;
						break;
					}
				}
			}

			//오름차순 정렬 - 다중 for문
			for(int i=0;i<lotto.length-1;i++)
			{
				for(int j=i+1;j<lotto.length;j++)
				{
					if(lotto[i]>lotto[j])
					{
						int temp=lotto[i];
						lotto[i]=lotto[j];
						lotto[j]=temp;
					}
				}
			}

			//출력 - 단일 for
			for(int n:lotto)
				System.out.printf("%4d",n);
			System.out.println();
		}
	}
}

