package day0316;


import java.util.Scanner;

public class Ex4While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//������ �Է¹޾� ������ ��հ� �Է¹��� ������ ���Ͻÿ�
//�� ������ 1~100�� �ƴϸ� �ٽ��Է�(�������� ����)
// ������ 0�̸� �ݺ��� ������ ���
		Scanner sc = new Scanner(System.in);
		
		int score;
		int total;
		int cnt ;
		float avg;
		//�ֱⰪ ����
		total=cnt=0;
		
		while (true) {
			System.out.println("�����Է��ϱ�");
			score=sc.nextInt();
			if(score==0)
				break;
			if(score<0 || score>100) {
				System.out.println("�ٽ��Է��ϼ���");
				continue;//���ǽ����� �̵�, �ϴ��۾��� ���߰� ó�����ͽ���
			}
			total+=score;
			cnt++;
		}
		avg=(float)total/cnt;
		System.out.println("���Է°���"+cnt);
		System.out.println("����"+total);
		System.out.println("���"+avg);
	}

	
	}


