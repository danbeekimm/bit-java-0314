package day0406;

public class Ex7Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {4,6,7,8};
		for(int i=0;i<=arr.length;i++)
		{
			try {
				System.out.println(arr[i]);
			}catch (ArrayIndexOutOfBoundsException e) {
				//e.printStackTrace(); : �����޼��� �����ؼ�Ȯ�� ���ι�ȣ�����˰�������̰��ؾ߉�
				System.out.println("�迭����:"+e.getMessage()); //�����޼�����
			}
		}
		System.out.println("***��������***");

	}

}
