package day0318;

public class Ex3ArrayStringSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[]names = {"�Ѱ���","��ȣ��","���缮","Adams","�Ѱ�"};
		
		for (int i =0;i<names.length-1;i++)
		{
			for(int j=i+1; j<names.length;j++)
			{
				if (names[i].compareTo(names[j])>0)
				{
					String temp = names[i];
					names[i]=names[j];
					names[j]=temp;
				}
			}
		}
		for(int i=0;i<names.length;i++) {
			System.out.println(i+"=>"+names[i]);
		}
	}

}