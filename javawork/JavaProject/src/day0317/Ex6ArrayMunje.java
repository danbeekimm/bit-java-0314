package day0317;

public class Ex6ArrayMunje {

	public static void main(String[] args) {
		//
		int []data= {100,-56,67,89,230,-800,32,39,69,11,-9,8,25,33,77};
		int max,min;//최대 최소변수
		max=data[0];
		min=data[0];//일단 제일 첫번째 숫자에 넣어놓고비교.
		
		for(int i=1;i<data.length;i++) {//0부터주지않은이유:이미 최대최소로 넣어서
			if(data[i] > max)
				max= data[i];
			if (data[i] < min)
				min = data[i];
		}
		
			
		
		System.out.println("최대값은:"+max);
		System.out.println("최소값은:"+min);
		
	}

}
