package day0317;

public class Ex5ArrayMunje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []data = {56,67,79,89,100};
		int sum=0;//�հ豸�Һ���
		double avg;//��պ���
		//for ������ sum ���ϱ�
		//���1
		for (int i=0; i<data.length; i++) 
			
			sum += data[i];
		//���2
		for(int n:data)
			sum += n;
		//avg ���ϱ�
			 avg = (double)sum/data.length;
		//���
			 System.out.println("�հ�:"+sum);
			 System.out.println("���:"+avg);
			 
	} 

}