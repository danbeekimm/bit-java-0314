package day0317;

public class Ex6ArrayMunje {

	public static void main(String[] args) {
		//
		int []data= {100,-56,67,89,230,-800,32,39,69,11,-9,8,25,33,77};
		int max,min;//�ִ� �ּҺ���
		max=data[0];
		min=data[0];//�ϴ� ���� ù��° ���ڿ� �־������.
		
		for(int i=1;i<data.length;i++) {//0����������������:�̹� �ִ��ּҷ� �־
			if(data[i] > max)
				max= data[i];
			if (data[i] < min)
				min = data[i];
		}
		
			
		
		System.out.println("�ִ밪��:"+max);
		System.out.println("�ּҰ���:"+min);
		
	}

}