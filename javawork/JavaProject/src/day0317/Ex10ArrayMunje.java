package day0317;

public class Ex10ArrayMunje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []lotto=new int[6];
		/*
		 * lotto배열에 1~45 사이의 난수 6개를 넣은 후 출력
		 * 단, 중복숫자가 있으면 안됨.
		 */

		for(int i=0; i<lotto.length;i++) {
			//1~45난수구하기
			lotto[i]=(int)(Math.random()*45)+1;
			//중복처리
			for(int j=0;j<i;j++) {
				if(lotto[i]==lotto[j]) {
					i--;//같으면for 문으로가는데 ++이니하나빼야 제자리가됨
					break;
				}
			}
				}
		//출력
			for(int n:lotto) {
				System.out.printf("%4d",n);
			}
		}

	}


