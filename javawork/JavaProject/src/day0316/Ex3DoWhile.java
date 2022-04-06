
package day0316;

public class Ex3DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		
		System.out.println("while¹®");
		while(a<10) {
			System.out.println(a++);
		}
//		
//		a=10;
//		do {
//			System.out.println(a++);
//		}while(a<10);
////		
		
		
		
		a=10;
		System.out.println("do~while¹®");
		do {
			System.out.println(a++);
		}while(a<10);
		
		System.out.println("---------------");
		
		
		System.out.println("1ºÎÅÍ100±îÁö ÇÕ°è");
		a=0;
		int sum=0;
		while(++a<=100) {
			sum+=a;
		}
		System.out.println("ÃÑÇÕ°è:"+sum);
		
		
		a=0;
		int esum=0,osum=0; //esumÀº Â¦¼öÇÕ. osumÀº È¦¼öÇÕ
		System.out.println("1~100±îÁö Â¦¼öÇÕ, È¦¼öÇÕ ±¸ÇÏ±â");
		while(++a<=100) {
			if (a%2==0)
				esum+=a;
			else osum +=a;
		}
		System.out.println("Â¦¼öÇÕ:"+esum+"È¦¼öÇÕ:"+osum);
	}
}
