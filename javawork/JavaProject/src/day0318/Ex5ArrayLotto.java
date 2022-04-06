package day0318;

import java.util.Scanner;

public class Ex5ArrayLotto {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int money;
		int []lotto=new int[6];
		/*
		 * ����: �ݾ��� �Է��ϸ�  �ݾ׿� �ش��ϴ� Ƚ����ŭ
		 * �ζǼ��� ���
		 * 1~45 ������ �ߺ����� ���� ������ �迭�� ������
		 *       ������������ ����Ͻÿ�
		 */

		System.out.println("�ζǱ��Աݾ��Է�");
		money =sc.nextInt();
		if(money<1000) {
			System.out.println("�ݾ��̺����ϹǷ� �����մϴ�");
			return; // ���� ���� �Լ� ���� 
		}

		for(int m=1;m<=money/1000;m++)
		{
			System.out.print(m+"ȸ:");
			//���� �߻�(�ߺ�ó��)-����for��
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

			//�������� ���� - ���� for��
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

			//��� - ���� for
			for(int n:lotto)
				System.out.printf("%4d",n);
			System.out.println();
		}
	}
}
