package day0316;

public class Ex5For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		for(a=1;a<=5;a++) {
			System.out.printf("%d",a);
		}
		System.out.println("\n");
		for(a=5;a>=1;a--) {
			System.out.printf("%d",a);
		}
		System.out.println();
		for(a=1;a<=20;a+=3) {
			System.out.printf("%d",a);
		}
		System.out.println();
		
		System.out.println("1부터 100까지중 짝수의 합구하기");
		int sum=0;
		for(a=1;a<=100;a++) {
			if(a%2==1)
				continue;//바로 a++로 감
			else
				sum+=a;
		}System.out.println(sum);
		}
	}


