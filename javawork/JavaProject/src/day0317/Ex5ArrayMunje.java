package day0317;

public class Ex5ArrayMunje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []data = {56,67,79,89,100};
		int sum=0;//합계구할변수
		double avg;//평균변수
		//for 문에서 sum 구하기
		//방법1
		for (int i=0; i<data.length; i++) 
			
			sum += data[i];
		//방법2
		for(int n:data)
			sum += n;
		//avg 구하기
			 avg = (double)sum/data.length;
		//출력
			 System.out.println("합계:"+sum);
			 System.out.println("평균:"+avg);
			 
	} 

}
