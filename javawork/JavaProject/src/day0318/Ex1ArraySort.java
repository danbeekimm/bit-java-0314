package day0318;

public class Ex1ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []data = {3,5,1,4,2};
		for(int i=0;i<data.length-1;i++)
		{
			for(int j = i+1;j<data.length;j++)
			{//���ذ� i ��Ŭ��� ���ιٲ۴�.(��������)
				if (data[i]>data[i])
				{//�ӽú����� �̿��� �������� ���� �ٲ۴�.
					int temp=data[i];
					data[i]=data[j];
					data[j]=temp;
				}
			}
		}
		//���
		for(int i=0; i<data.length;i ++)
		{
			System.out.println(i + "=>"+data[i]);
		}
	}

}
