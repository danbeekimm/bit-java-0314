package day0318;

public class E6Array2Cha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//2���� �迭�� ��� ���� �޸� �Ҵ�
		int [][]arr=new int[2][3]; //2�� 3��
		System.out.println("���ǰ���"+arr.length);
		System.out.println("0���� ������"+arr[0].length);
		System.out.println("1���� ������"+arr[1].length);
		
		//�ʱⰪ
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length; j++) {
				System.out.printf("[%d][%d]:%d\t",i,j,arr[i][j]);
			}
			System.out.println();
		}
		System.out.println("2���� �迭�� �� ���� �� �ٽ� ���");
		arr[0][0]=10;
		arr[1][1]=15;
		arr[1][2]=30;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length; j++) {
				System.out.printf("[%d][%d]:%d\t",i,j,arr[i][j]);
			}
			System.out.println();
		}
	}

}
