package day0317;

public class Ex10ArrayMunje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []lotto=new int[6];
		/*
		 * lotto�迭�� 1~45 ������ ���� 6���� ���� �� ���
		 * ��, �ߺ����ڰ� ������ �ȵ�.
		 */

		for(int i=0; i<lotto.length;i++) {
			//1~45�������ϱ�
			lotto[i]=(int)(Math.random()*45)+1;
			//�ߺ�ó��
			for(int j=0;j<i;j++) {
				if(lotto[i]==lotto[j]) {
					i--;//������for �����ΰ��µ� ++�̴��ϳ����� ���ڸ�����
					break;
				}
			}
				}
		//���
			for(int n:lotto) {
				System.out.printf("%4d",n);
			}
		}

	}

