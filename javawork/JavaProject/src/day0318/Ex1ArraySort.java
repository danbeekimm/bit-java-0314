package day0318;

public class Ex1ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []data = {3,5,1,4,2};
		for(int i=0;i<data.length-1;i++)
		{
			for(int j = i+1;j<data.length;j++)
			{//기준값 i 더클경우 서로바꾼다.(오름차순)
				if (data[i]>data[i])
				{//임시변수를 이용해 변수안의 값만 바꾼다.
					int temp=data[i];
					data[i]=data[j];
					data[j]=temp;
				}
			}
		}
		//출력
		for(int i=0; i<data.length;i ++)
		{
			System.out.println(i + "=>"+data[i]);
		}
	}

}
