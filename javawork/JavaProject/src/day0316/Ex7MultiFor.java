package day0316;

public class Ex7MultiFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int a=1;a<=5;a++) {//青
			for(int b=1;b<=5;b++) {
				System.out.print("≮");//凯
			}
			System.out.println();
		}
		System.out.println("----------------");

		for(int a=1;a<=5;a++) {//青
			for(int b=1;b<=a;b++) {
				System.out.print("≮");//凯
			}
			System.out.println();
		}
		System.out.println("----------------");
//		for(int a=1;a<=5;a++) 规过 1
//		for(int b=a;b<=5;b++) 
		for(int a=1;a<=5;a++) { //规过2
			for(int b=5;b>=a;b--) {
				System.out.print("≮");//凯
			}
			System.out.println();
	}
		System.out.println("----------------");

		//		        ≮
		//		      ≮≮
		//		    ≮≮≮
		//		  ≮≮≮≮
		//		≮≮≮≮≮
		for(int a=1;a<=5;a++) {//青
			//傍归捞 4.3.2.1.0
			for(int sp=a;sp<5;sp++) {
				System.out.print(" ");
			}
			for(int b=1;b<=a;b++) {
				
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
